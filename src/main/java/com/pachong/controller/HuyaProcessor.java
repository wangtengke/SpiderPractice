package com.pachong.controller;

import com.alibaba.fastjson.JSONObject;
import com.pachong.entity.bilibiliuser_follow;
import com.pachong.entity.bilibiliuser_play;
import com.pachong.service.bilibiliuser_followService;
import com.pachong.service.bilibiliuser_playService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.selector.JsonPathSelector;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @wtk
 **/
public class HuyaProcessor implements PageProcessor {
    //    private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
//    bilibiliuser_playService bilibiliuser_playservice = ac.getBean(bilibiliuser_playService.class);
//    bilibiliuser_followService bilibiliuser_followservice = ac.getBean(bilibiliuser_followService.class);
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1500);
    //.addHeader("Host","zhihu-web-analytics.zhihu.com")
//                        .addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
//                        .addHeader("Accept","text/html,application/xhtml+xm…plication/xml;q=0.9,*/*;q=0.8")
//                        .addHeader("Accept-Language","zh-CN,zh;q=0.8")
//                        .addHeader("Accept-Encoding","gzip, deflate, sdch, br")
//                             //.addHeader("X-Requested-With","XMLHttpRequest")
//                            //.addHeader("Content-Type","application/x-www-form-urlencoded")
//                        .addHeader("Referer","https://www.zhihu.com/");
    //用户数量
    private static int num = 0;

    //    private String USERINFO_URL="https://space.bilibili.com/ajax/member/GetInfo";
//    private String FOLLOW_URL="https://api\\.bilibili\\.com/x/relation/followings\\?vmid=\\d+&pn=\\d+&ps=\\d+";
//    private String PLAY_URL="https://api\\.bilibili\\.com/x/space/upstat\\?mid=\\d+";
//    private String Fans_URL="https://api\\.bilibili\\.com/x/relation/stat\\?vmid=\\d+";
//    com.pachong.entity.bilibiliuser_play bilibiliuser_play = new bilibiliuser_play();
//    com.pachong.entity.bilibiliuser_follow bilibiliuser_follow = new bilibiliuser_follow();
    //数据持久化对象，用于将信息存入数据库
    @Override
    synchronized public void process(Page page) {

        //1. 如果是用户列表页面 【入口页面】，将所有用户的详细页面的url放入target集合中。
        if (page.getUrl().regex("").match()) {
            // page.addTargetRequest("");
//            List<String> mids = new JsonPathSelector("$.data.list[*].mid").selectList(page.getRawText());
//            if (CollectionUtils.isNotEmpty(mids)) {
//                for (String mid : mids) {
//                    //构造用户信息主页的post请求
//                    //Request request = createPostRequest(mid);
////                    Map<String, Object> nameValuePair = new HashMap<String, Object>();
////                    NameValuePair[] values = new NameValuePair[2];
////                    values[0] = new BasicNameValuePair("mid", mid);
////                    values[1] = new BasicNameValuePair("csrf", "null");
////                    nameValuePair.put("nameValuePair", values);
////                    Request request = new Request(USERINFO_URL);
////                    request.setExtras(nameValuePair);
////                    request.setMethod(HttpConstant.Method.POST);
//                    //Spider.create(new BilibiliProcessor()).addRequest(request);
////                    page.setRequest(request);
//                    //添加Request对象到URL请求队列
//                    page.addTargetRequest("https://api.bilibili.com/x/space/upstat?mid=" + mid);//播放数
//                    page.addTargetRequest("https://api.bilibili.com/x/relation/stat?vmid=" + mid);//关注与粉丝数
//                    page.addTargetRequest("https://api.bilibili.com/x/relation/followings?vmid=" + mid + "&pn=1&ps=5");//个人主页
//                }
//            }
        } else {
            num++;

            System.out.println("111");
        }
    }

    @Override
    public Site getSite() {
        return this.site;
    }


    public static void main(String[] args) {
        HttpClientDownloader httpClientdownloader = new HttpClientDownloader();
        httpClientdownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy("101.101.101.101", 8888), new Proxy("102.102.102.102", 8888)));
        long startTime, endTime;
        System.out.println("========Bilibili用户信息小爬虫【启动】喽！=========");
        startTime = new Date().getTime();

        Spider.create(new HuyaProcessor()).addUrl("http://www.huya.com/l")
                //  .setScheduler(new FileCacheQueueScheduler("C:\\Users\\USER\\Desktop\\爬虫练习\\txt"))
                .thread(1).run();
        endTime = new Date().getTime();
        System.out.println("========Bilibili用户信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到" + num + "个用户信息！用时为：" + (endTime - startTime) / 1000 + "s");
    }
}
