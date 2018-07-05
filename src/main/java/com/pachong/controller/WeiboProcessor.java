package com.pachong.controller;

import com.pachong.entity.zhihuTeacher;
import com.pachong.service.zhihuTeacherService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.JsonPathSelector;

import java.io.IOException;
import java.util.Date;

/**
 * @wtk
 * App Key：969428196
App Secret：a6c59f69a5c76828493bd61bf9382058
 code:9937076cb4b7644410da4ae1ced8e4dd
{"access_token":"2.00Vp7dEEeYcbDB399a287a87jsJhJC","remind_in":"157679999","expires_in":157679999,"uid":"3733034601","isRealName":"true"}
 **/
public class WeiboProcessor implements PageProcessor {
//    private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
//    private zhihuTeacherService zhihuTeacherservice = ac.getBean(zhihuTeacherService.class);
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
//        if(page.getUrl().regex("").match()){

        try {
            Document doc = Jsoup.connect("https://api.weibo.com/2/comments/show.json")//http://music.163.com/song?id=33206214 ; http://1212.ip138.com/ic.asp
                    //.header("Host", "api-v2.famulei.com")
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
                    .header("Accept", "application/json, text/javascript, */*; q=0.01")
                   // .header("Accept-Encoding","gzip, deflate")
                    //.header("Content-Type","application/x-www-form-urlencoded; charset=UTF-8")
                    // .cookie("Cookie","__guid=49530400.2858671149316304000.1522241110372.125; wp_pvid=2492906368; isShown=1; wp_info=ssid=s7559777198; Hm_lvt_f69cb5ec253c6012b2aa449fb925c1c2=1522241113,1522322773; Hm_lpvt_f69cb5ec253c6012b2aa449fb925c1c2=1522325228; wanplus_token=b88ec1b09146b04276495298e11daeda; wanplus_storage=lf4m67eka3o; wanplus_sid=96490082f3710afe25421e6593cb441d; wanplus_csrf=_csrf_tk_39464146; gameType=2; monitor_count=31")
                    .data("access_token","2.00Vp7dEEeYcbDB399a287a87jsJhJC" )
                    .data("id","5235726837")
//                        .data("columns[0][data]","order")
//                        .data("eid","579")
                    .timeout(8 * 1000).get();
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }

//            System.out.println(doc);
            num++;//用户数++



//        }
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
        Spider.create(new WeiboProcessor())
                .addUrl("https://weibo.com/aj/v6/comment/big?ajwvr=6&id=4224464554025469&root_comment_max_id=140200846389567&root_comment_max_id_type=0&root_comment_ext_param=&page=0&filter=hot&sum_comment_number=10&filter_tips_before=0&from=singleWeiBo&__rnd=1523106413162")
                //.setPipelines((List<Pipeline>) new JsonFilePipeline("D:\\webmagic\\"))
                //.setScheduler(new FileCacheQueueScheduler("C:\\Users\\USER\\Desktop\\爬虫练习\\txt"))
                .thread(1).run();//https://www.zhihu.com/people/linusp/following
        endTime = new Date().getTime();
        System.out.println("========知乎用户信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到"+num+"个用户信息！用时为："+(endTime-startTime)/1000+"s");
    }
}
