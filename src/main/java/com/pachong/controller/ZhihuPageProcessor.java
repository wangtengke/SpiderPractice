package com.pachong.controller;

/**
 * @wtk
 **/
import com.pachong.dao.zhihuTeacherMapper;
import com.pachong.entity.zhihuTeacher;
import com.pachong.service.zhihuTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.downloader.*;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;
//import com.pachong.service.zhihuTeacherService;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;

import java.util.Date;
import java.util.List;

/**
 * @author code4crafter@gmail.com <br>
 * @since 0.6.0
 */
//@Controller
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class ZhihuPageProcessor implements PageProcessor {
//    private ApplicationContext ac;
//    private zhihuTeacherService zhihuTeacherservice;
//    @Autowired
    private ApplicationContext  ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    private zhihuTeacherService zhihuTeacherservice = ac.getBean(zhihuTeacherService.class);
//    @Autowired
//    zhihuTeacherService zhihuTeacherservice;
    private Site site = Site.me()
                        .setRetryTimes(5)
                        .setSleepTime(1000)
                        .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0")
                        .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                        .addHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
                        .setCharset("UTF-8");
                      //  .addHeader("Host","zhihu-web-analytics.zhihu.com")
//                        .addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
//                        .addHeader("Accept","text/html,application/xhtml+xm…plication/xml;q=0.9,*/*;q=0.8")
//                        .addHeader("Accept-Language","zh-CN,zh;q=0.8")
//                        .addHeader("Accept-Encoding","gzip, deflate, sdch, br")
//                             //.addHeader("X-Requested-With","XMLHttpRequest")
//                            //.addHeader("Content-Type","application/x-www-form-urlencoded")
//                        .addHeader("Referer","https://www.zhihu.com/");
    //用户数量
    private  static  int num = 0;

    private zhihuTeacher zhihuteacher=new zhihuTeacher();
    //数据持久化对象，用于将信息存入数据库
    @Override
     public void process(Page page) {

        //1. 如果是用户列表页面 【入口页面】，将所有用户的详细页面的url放入target集合中。
        if(page.getUrl().regex(".*/following").match()){
            page.addTargetRequests(page.getHtml().xpath("//div[@class='List-item']/div/div/div[2]/h2/div/span/div/div/a[@href]").links().all());
           System.out.println("1");
            // page.addTargetRequests(page.getHtml().xpath("//*[@id=\"Popover-9970-83231-toggle\"]/a").links().regex(".*/people.*").all());
           //      System.out.println(page.getHtml().toString());
        }
        //2. 如果是用户详细页面
        else{
            num++;//用户数++
            String url = page.getUrl().toString();
            page.addTargetRequest(url+"/following");
            /*实例化ZhihuUser，方便持久化存储。*/
           // ZhihuUser user = new ZhihuUser();
            /*从下载到的用户详细页面中抽取想要的信息，这里使用xpath居多*/
            /*为了方便理解，抽取到的信息先用变量存储，下面再赋值给对象*/
            String name = page.getHtml().xpath("//*[@id=\"ProfileHeader\"]/div/div[2]/div/div[2]/div[1]/h1/span[1]/text()").get();
            String identity = page.getHtml().xpath("//*[@id=\"ProfileHeader\"]/div/div[2]/div/div[2]/div[1]/h1/span[2]/text()").get();
            String location =url;

            int question = Integer.parseInt(page.getHtml().xpath("//*[@id=\"ProfileMain\"]/div[1]/ul/li[3]/a/span/text()").get());
            int answer = Integer.parseInt(page.getHtml().xpath("//*[@id=\"ProfileMain\"]/div[1]/ul/li[2]/a/span/text()").get());
            int article = Integer.parseInt(page.getHtml().xpath("//*[@id=\"ProfileMain\"]/div[1]/ul/li[4]/a/span/text()").get());
//            int collection = Integer.parseInt(page.getHtml().xpath("//div[@class='profile-navbar clearfix']/a[5]/span[@class='num']/text()").get());

            //对象赋值
            zhihuteacher.setName(name);
            zhihuteacher.setIdentity(identity);
            zhihuteacher.setLocation(location);
            zhihuteacher.setQuestion(question);
            zhihuteacher.setAnswer(answer);
            zhihuteacher.setArticle(article);
            //保存用户信息到数据库
            System.out.println("已经爬到:"+num +"数据！ " + zhihuteacher.toString());//输出对象
            zhihuTeacherservice.saveMsg(zhihuteacher);
//            zhihuTeacherMapper.insertSelective(zhihuteacher);


        }
    }

    @Override
    public Site getSite() {
        return this.site;
    }

    public static void main(String[] args) {

        long startTime ,endTime;
        System.out.println("========知乎用户信息小爬虫【启动】喽！=========");
        startTime = new Date().getTime();
        //入口为：【https://www.zhihu.com/search?type=people&q=xxx 】，其中xxx 是搜索关键词
        Spider.create(new ZhihuPageProcessor())
                .addUrl("https://www.zhihu.com/people/liujiang/following")
                //.setPipelines((List<Pipeline>) new JsonFilePipeline("D:\\webmagic\\"))
                //.setScheduler(new FileCacheQueueScheduler("C:\\Users\\USER\\Desktop\\爬虫练习\\txt"))
                .thread(1).run();//https://www.zhihu.com/people/linusp/following
        endTime = new Date().getTime();
        System.out.println("========知乎用户信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到"+num+"个用户信息！用时为："+(endTime-startTime)/1000+"s");
    }
}