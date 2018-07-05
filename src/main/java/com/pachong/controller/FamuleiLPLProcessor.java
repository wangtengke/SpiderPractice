package com.pachong.controller;

import com.pachong.entity.*;
import com.pachong.service.wanplus_memberService;
import com.pachong.service.famulei_herosService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;
import us.codecraft.webmagic.selector.JsonPathSelector;

import java.util.Date;
import java.util.List;

/**
 * @wtk
 **/
public class FamuleiLPLProcessor implements PageProcessor {
    private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    famulei_herosService famulei_herosService= ac.getBean(famulei_herosService.class);
//    com.pachong.service.wanplus_teamService wanplus_teamService = ac.getBean(wanplus_teamService.class);
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
    private static int num = 0;
    private static int startID=8938;
    private static int endID=9106;

    famulei_heros famuleiHeros=new famulei_heros();

    @Override
    synchronized public void process(Page page) {
        for(int i=startID+1;i<endID+1;i++){
            page.addTargetRequest("http://img1.famulei.com/match/result/"+i+".json");
        }

        int gameID=Integer.parseInt(new JsonPathSelector("$.gameID").select(page.getRawText()));
        String TeamName=new JsonPathSelector("$.max_assists.team_name").select(page.getRawText());
        //1. 如果是用户列表页面 【入口页面】，将所有用户的详细页面的url放入target集合中。
        if (gameID==1) {
            //选手
            num++;
            //队伍名字;
            String blue_name=new JsonPathSelector("$.result_list.blue_name").select(page.getRawText());
            String red_name=new JsonPathSelector("$.result_list.red_name").select(page.getRawText());
           //比赛结果
            String blue_result=new JsonPathSelector("$.result_list.blue_result").select(page.getRawText());
            String red_result=new JsonPathSelector("$.result_list.red_result").select(page.getRawText());
            //英雄名称
            String blue_hero_a_name=new JsonPathSelector("$.result_list.blue_hero_a_name").select(page.getRawText());
            String blue_hero_b_name=new JsonPathSelector("$.result_list.blue_hero_b_name").select(page.getRawText());
            String blue_hero_c_name=new JsonPathSelector("$.result_list.blue_hero_c_name").select(page.getRawText());
            String blue_hero_d_name=new JsonPathSelector("$.result_list.blue_hero_d_name").select(page.getRawText());
            String blue_hero_e_name=new JsonPathSelector("$.result_list.blue_hero_e_name").select(page.getRawText());
            String red_hero_a_name=new JsonPathSelector("$.result_list.red_hero_a_name").select(page.getRawText());
            String red_hero_b_name=new JsonPathSelector("$.result_list.red_hero_b_name").select(page.getRawText());
            String red_hero_c_name=new JsonPathSelector("$.result_list.red_hero_c_name").select(page.getRawText());
            String red_hero_d_name=new JsonPathSelector("$.result_list.red_hero_d_name").select(page.getRawText());
            String red_hero_e_name=new JsonPathSelector("$.result_list.red_hero_e_name").select(page.getRawText());
            //选手名称
            String blue_star_a_name=new JsonPathSelector("$.result_list.blue_star_a_name").select(page.getRawText());
            String blue_star_b_name=new JsonPathSelector("$.result_list.blue_star_b_name").select(page.getRawText());
            String blue_star_c_name=new JsonPathSelector("$.result_list.blue_star_c_name").select(page.getRawText());
            String blue_star_d_name=new JsonPathSelector("$.result_list.blue_star_d_name").select(page.getRawText());
            String blue_star_e_name=new JsonPathSelector("$.result_list.blue_star_e_name").select(page.getRawText());
            String red_star_a_name=new JsonPathSelector("$.result_list.red_star_a_name").select(page.getRawText());
            String red_star_b_name=new JsonPathSelector("$.result_list.red_star_b_name").select(page.getRawText());
            String red_star_c_name=new JsonPathSelector("$.result_list.red_star_c_name").select(page.getRawText());
            String red_star_d_name=new JsonPathSelector("$.result_list.red_star_d_name").select(page.getRawText());
            String red_star_e_name=new JsonPathSelector("$.result_list.red_star_e_name").select(page.getRawText());
            //输出占比
            float blue_star_a_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_a_atk_p").select(page.getRawText()));
            float blue_star_b_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_b_atk_p").select(page.getRawText()));
            float blue_star_c_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_c_atk_p").select(page.getRawText()));
            float blue_star_d_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_d_atk_p").select(page.getRawText()));
            float blue_star_e_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_e_atk_p").select(page.getRawText()));
            float red_star_a_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_a_atk_p").select(page.getRawText()));
            float red_star_b_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_b_atk_p").select(page.getRawText()));
            float red_star_c_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_c_atk_p").select(page.getRawText()));
            float red_star_d_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_d_atk_p").select(page.getRawText()));
            float red_star_e_atk_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_e_atk_p").select(page.getRawText()));
            //承伤占比
            float blue_star_a_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_a_def_p").select(page.getRawText()));
            float blue_star_b_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_b_def_p").select(page.getRawText()));
            float blue_star_c_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_c_def_p").select(page.getRawText()));
            float blue_star_d_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_d_def_p").select(page.getRawText()));
            float blue_star_e_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.blue_star_e_def_p").select(page.getRawText()));
            float red_star_a_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_a_def_p").select(page.getRawText()));
            float red_star_b_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_b_def_p").select(page.getRawText()));
            float red_star_c_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_c_def_p").select(page.getRawText()));
            float red_star_d_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_d_def_p").select(page.getRawText()));
            float red_star_e_def_p=Float.parseFloat(new JsonPathSelector("$.result_list.red_star_e_def_p").select(page.getRawText()));
            //比赛时间
            int game_time_m=Integer.parseInt(new JsonPathSelector("$.result_list.game_time_m").select(page.getRawText()));
            int game_time_s=Integer.parseInt(new JsonPathSelector("$.result_list.game_time_s").select(page.getRawText()));

            famuleiHeros.setBlueName(blue_name);
            famuleiHeros.setRedName(red_name);
            famuleiHeros.setBlueResult(blue_result);
            famuleiHeros.setRedResult(red_result);
            famuleiHeros.setBlueHeroAName(blue_hero_a_name);
            famuleiHeros.setBlueHeroBName(blue_hero_b_name);
            famuleiHeros.setBlueHeroCName(blue_hero_c_name);
            famuleiHeros.setBlueHeroDName(blue_hero_d_name);
            famuleiHeros.setBlueHeroEName(blue_hero_e_name);
            famuleiHeros.setRedHeroAName(red_hero_a_name);
            famuleiHeros.setRedHeroBName(red_hero_b_name);
            famuleiHeros.setRedHeroCName(red_hero_c_name);
            famuleiHeros.setRedHeroDName(red_hero_d_name);
            famuleiHeros.setRedHeroEName(red_hero_e_name);
            famuleiHeros.setBlueStarAName(blue_star_a_name);
            famuleiHeros.setBlueStarBName(blue_star_b_name);
            famuleiHeros.setBlueStarCName(blue_star_c_name);
            famuleiHeros.setBlueStarDName(blue_star_d_name);
            famuleiHeros.setBlueStarEName(blue_star_e_name);
            famuleiHeros.setRedStarAName(red_star_a_name);
            famuleiHeros.setRedStarBName(red_star_b_name);
            famuleiHeros.setRedStarCName(red_star_c_name);
            famuleiHeros.setRedStarDName(red_star_d_name);
            famuleiHeros.setRedStarEName(red_star_e_name);
            famuleiHeros.setBlueStarAAtkP(blue_star_a_atk_p);
            famuleiHeros.setBlueStarBAtkP(blue_star_b_atk_p);
            famuleiHeros.setBlueStarCAtkP(blue_star_c_atk_p);
            famuleiHeros.setBlueStarDAtkP(blue_star_d_atk_p);
            famuleiHeros.setBlueStarEAtkP(blue_star_e_atk_p);
            famuleiHeros.setRedStarAAtkP(red_star_a_atk_p);
            famuleiHeros.setRedStarBAtkP(red_star_b_atk_p);
            famuleiHeros.setRedStarCAtkP(red_star_c_atk_p);
            famuleiHeros.setRedStarDAtkP(red_star_d_atk_p);
            famuleiHeros.setRedStarEAtkP(red_star_e_atk_p);
            famuleiHeros.setBlueStarADefP(blue_star_a_def_p);
            famuleiHeros.setBlueStarBDefP(blue_star_b_def_p);
            famuleiHeros.setBlueStarCDefP(blue_star_c_def_p);
            famuleiHeros.setBlueStarDDefP(blue_star_d_def_p);
            famuleiHeros.setBlueStarEDefP(blue_star_e_def_p);
            famuleiHeros.setRedStarADefP(red_star_a_def_p);
            famuleiHeros.setRedStarBDefP(red_star_b_def_p);
            famuleiHeros.setRedStarCDefP(red_star_c_def_p);
            famuleiHeros.setRedStarDDefP(red_star_d_def_p);
            famuleiHeros.setRedStarEDefP(red_star_e_def_p);
            famuleiHeros.setGameTimeM(game_time_m);
            famuleiHeros.setGameTimeS(game_time_s);

            famulei_herosService.saveMsg(famuleiHeros);


            System.out.println(num+"个数据");
        } else {


//            System.out.println("111");
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

        Spider.create(new FamuleiLPLProcessor()).addUrl("http://img1.famulei.com/match/result/8938.json")
                //  .setScheduler(new FileCacheQueueScheduler("C:\\Users\\USER\\Desktop\\爬虫练习\\txt"))
                .thread(1).run();
        endTime = new Date().getTime();
        System.out.println("========Bilibili用户信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到" + num + "个用户信息！用时为：" + (endTime - startTime) / 1000 + "s");
    }
}
