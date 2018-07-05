package com.pachong.controller;

/**
 * @wtk
 **/
import com.pachong.utils.NetEaseMusicUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.pachong.entity.musictoplist;
import com.pachong.service.musictoplistService;
import com.pachong.utils.NetEaseMusicUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.model.HttpRequestBody;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;

import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.utils.HttpConstant;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.*;
import com.pachong.utils.IpTest;
/**
 * @author code4crafter@gmail.com <br>
 * @since 0.6.0
 */
//@Controller
//@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class WangyiMusicProcessor implements PageProcessor {

    private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    musictoplistService musictoplistservice = ac.getBean(musictoplistService.class);

    private int limit=1;
    private int PageNum=1;
    private static String IP;
    private static int PORT;
    private Site site = Site.me()
//                        .setDomain("http://music.163.com")
                        .setRetryTimes(3)
                        .setSleepTime(1000)
                        .setUseGzip(true)
                        .addHeader("Host","music.163.com")
                        .addHeader("userAgent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
                        .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
                        .addHeader("Accept","text/html,application/xhtml+xm…plication/xml;q=0.9,*/*;q=0.8");
//                        .addHeader("Accept-Language","zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2")
//                        .addHeader("Accept-Encoding","gzip, deflate")
//                        //.addHeader("X-Requested-With","XMLHttpRequest")
//                        //.addHeader("Content-Type","application/x-www-form-urlencoded")
//                        .addHeader("Referer","http://music.163.com/");
    //用户数量
    private  static  int num = 0;

    private  JSONObject comment;
    musictoplist musictoplist = new musictoplist();

    @Override
    synchronized public void process(Page page) {
        //1. 如果是用户列表页面 【入口页面】，将所有用户的详细页面的url放入target集合中。
        for(int i=1;i<PageNum;i++){
            page.addTargetRequest("http://music.163.com/discover/playlist?limit="+limit+"&offset="+(i*limit));
        }
        if(page.getUrl().regex(".*/playlist.*").match()){
          //  List<String> ID = new JsonPathSelector("$.follow[*].userId").selectList(page.getRawText());
//
            if(page.getUrl().regex(".*/playlist\\?limit.*").match()){
                page.addTargetRequests(page.getHtml().links().regex(".*/playlist\\?id.*").all());
                System.out.println(page.getTargetRequests());
            }
            else {
//               // page.addTargetRequests(page.getHtml().xpath("//p[@class='dec']").links().regex(".*/playlist\\?id=\\d+").all());
                page.addTargetRequests(page.getHtml().links().regex(".*/song.*").all());
//                System.out.println("11");
            }
//            System.out.println("12");
            // page.addTargetRequests(page.getHtml().xpath("//p[@class='dec']").links().regex(".*/playlist\\?id=\\d+").all());//.regex("https://music\\.163\\.com/#/user/home\\?id=\\d+").all());
//            String url = page.getUrl().toString();
//            String songId = url.substring(url.indexOf("id=") + 3);
//            ArrayList<Integer> followId=getFollow(page, songId, 0);
//            for(int i=0;i<followId.size();i++)
//            page.addTargetRequest("http://music.163.com/#/user/home?id="+followId.get(i));
//
//            System.out.println("用户关注界面");

//        else if(page.getUrl().regex(".*/user/home\\?id=\\d+").match()){
//            String url = page.getUrl().toString();
//            String userId = url.substring(url.indexOf("id=") + 3);
//            ArrayList<Integer> followId=getSong(page, userId, 0);
////            for(int i=0;i<followId.size();i++)
////                page.addTargetRequest("http://music.163.com/#/user/home?id="+followId.get(i));
          //  page.addTargetRequests(page.getHtml().links().all());
            System.out.println("用户主页");
        }
        //2. 如果是用户详细页面
        else{
            num++;//用户数++
            String url = page.getUrl().toString();
           // getUserMessage(IP,PORT,url);
            String songId = url.substring(url.indexOf("id=") + 3);
            try {
                comment = getComment(page, songId, 0);
            } catch (IOException e) {
                e.printStackTrace();
            }
           int commentCount = (Integer) JSONPath.eval(comment, "$.total");
            String hotcomment=  JSONPath.eval(comment,"$.hotComments[0].content").toString();

            String title = page.getHtml().xpath("//em[@class='f-ff2']/text()").get();
            String singer = page.getHtml().xpath("//div[@class='cnt']/p[1]/span/a/text()").get();
                musictoplist.setTitle(title);
                musictoplist.setCommentnum(commentCount);
                musictoplist.setSinger(singer);
                musictoplist.setUrl(url);
                musictoplist.setCommenttop1(hotcomment);
                musictoplistservice.saveMsg(musictoplist);
//
                System.out.println(musictoplist.toString());
                System.out.println("已经爬取"+num+"首歌");
        }

    }

    private void getUserMessage(String ip, int port, String url) {
        try {
            Document doc=Jsoup.connect(url)//http://music.163.com/song?id=33206214 ; http://1212.ip138.com/ic.asp
                    .header("Host", "music.163.com")
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
                    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                    .timeout(2 * 1000)
                    .proxy(ip, port)
                    .get();
//              String title = doc.body().select()xpath("//em[@class='f-ff2']/text()").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private ArrayList<Integer> getSong(Page page, String userId, int offset) {
//        ArrayList<Integer> followId=new ArrayList();
//        String s = NetEaseMusicUtils.crawlSongUrl(userId, offset);
//        JSONObject jsonObject = JSON.parseObject(s);
////        if (s.contains("503 Service Temporarily Unavailable")) {
////            followId = null;
////        } else {
////            JSONObject jsonObject = JSON.parseObject(s);
////            int followNum =jsonObject.getJSONArray("follow").size();
////            //followId = (Integer) JSONPath.eval(jsonObject, "$.follow[2].userId");
////            for(int i=0;i<followNum;i++){
////                int userId=(Integer) JSONPath.eval(jsonObject, "$.follow["+i+"].userId");
////                followId.add(userId);
////            }
////            System.out.println(followId);
////        }
//        return followId;
//    }
//
//    private ArrayList<Integer> getFollow(Page page, String songId, int offset){
//        ArrayList<Integer> followId=new ArrayList();
//        String s = NetEaseMusicUtils.crawlFollowUrl(songId, offset);
//
//        if (s.contains("503 Service Temporarily Unavailable")) {
//            followId = null;
//        } else {
//            JSONObject jsonObject = JSON.parseObject(s);
//            int followNum =jsonObject.getJSONArray("follow").size();
//            //followId = (Integer) JSONPath.eval(jsonObject, "$.follow[2].userId");
//            for(int i=0;i<followNum;i++){
//                int userId=(Integer) JSONPath.eval(jsonObject, "$.follow["+i+"].userId");
//                followId.add(userId);
//            }
//            System.out.println(followId);
//        }
//        return followId;
//    }

    private JSONObject getComment(Page page, String songId, int offset) throws IOException {
        //int commentCount;
        HttpGet get = null;
        HttpClient httpClient = HttpClients.createDefault();
        get = new HttpGet("http://music.163.com/api/v1/resource/comments/R_SO_4_" + songId);

        get.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        get.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
        get.addHeader("Host", "music.163.com");

        HttpResponse response = httpClient.execute(get);

        HttpEntity entity = response.getEntity();

        String responseContent = EntityUtils.toString(entity, "UTF-8");
        JSONObject jsonObject = null;
        if (responseContent.contains("-460")) {
            //  commentCount=-1;
            System.out.println("无法获取");

        } else {
            jsonObject = JSON.parseObject(responseContent);
            // commentCount = (Integer) JSONPath.eval(jsonObject, "$.total");
        }

        return jsonObject;
    }

    @Override
    public Site getSite() {
        return this.site;
    }


    public static void main(String[] args) throws IOException {
      //  Spider spider=new Spider(new WangyiMusicProcessor());
//        IpTest ipget = new IpTest();
//        String Json_ip=ipget.startCrawler(1);
//        JSONObject jsonObject = JSON.parseObject(Json_ip);
//        String ip = JSONPath.eval(jsonObject, "$.data.proxy[0].ip").toString().replace("\"","").replace("\"","");
//        String port = JSONPath.eval(jsonObject,"$.data.proxy[0].port").toString().replace("\"","").replace("\"","");
//        int ports=Integer.parseInt(port);
        JSONObject jsonObject= getIP_PORT();
        String ip = JSONPath.eval(jsonObject, "$.RESULT[0].ip").toString().replace("\"","").replace("\"","");
        String port = JSONPath.eval(jsonObject,"$.RESULT[0].port").toString().replace("\"","").replace("\"","");
        System.getProperties().setProperty("http.proxyHost", ip);
        System.getProperties().setProperty("http.proxyPort", port);
        int ports=Integer.parseInt(port);
//
        HttpClientDownloader httpClientdownloader = new HttpClientDownloader();
        httpClientdownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy(ip,ports,"","")));
      //  spider.setDownloader(httpClientdownloader);
        //httpClientdownloader.setProxyProvider(proxyProvider);
        long startTime ,endTime;
        System.out.println("========知乎用户信息小爬虫【启动】喽！=========");
        startTime = new Date().getTime();
        //入口为：【https://www.zhihu.com/search?type=people&q=xxx 】，其中xxx 是搜索关键词
        Spider.create(new WangyiMusicProcessor())
         //       .setDownloader(httpClientdownloader)
                .addUrl("http://music.163.com/discover/playlist?limit=2&offset=0")

               // .setScheduler(new FileCacheQueueScheduler("C:\\Users\\USER\\Desktop\\爬虫练习\\txt"))
                .thread(5)
                //start();
                .run();//http://music.163.com/#/user/follows?id=86019584

        endTime = new Date().getTime();
        System.out.println("========知乎用户信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到"+num+"个用户信息！用时为："+(endTime-startTime)/1000+"s");


    }

    private static JSONObject getIP_PORT() throws IOException {
        HttpGet get = null;
        HttpClient httpClient = HttpClients.createDefault();
        get = new HttpGet("http://api.xdaili.cn/xdaili-api//newExclusive/getIp?spiderId=969e4ca116ad458088b830069c372190&orderno=MF20183278713lcYnRO&returnType=2&count=1&machineArea=");

       // get.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        get.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
      //  get.addHeader("Host", "music.163.com");

        HttpResponse response = httpClient.execute(get);

        HttpEntity entity = response.getEntity();

        String responseContent = EntityUtils.toString(entity, "UTF-8");
        JSONObject jsonObject = null;
        if (responseContent.contains("-460")) {
            //  commentCount=-1;
            System.out.println("无法获取");

        } else {
            jsonObject = JSON.parseObject(responseContent);
            // commentCount = (Integer) JSONPath.eval(jsonObject, "$.total");
        }

        return jsonObject;
    }


}

