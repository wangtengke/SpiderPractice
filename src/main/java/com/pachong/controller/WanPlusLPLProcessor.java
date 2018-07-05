package com.pachong.controller;

import com.alibaba.fastjson.JSONObject;
import com.pachong.entity.wanplus_member;
import com.pachong.entity.wanplus_member_summer2017;
import com.pachong.entity.wanplus_team;
import com.pachong.entity.wanplus_memebers7;
import com.pachong.service.lpl_memberService;
import com.pachong.service.lpl_teamService;
import com.pachong.service.wanplus_memberService;
import com.pachong.service.wanplus_teamService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @wtk
 **/
public class WanPlusLPLProcessor implements PageProcessor{
    private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    wanplus_memberService wanplus_memberService= ac.getBean(wanplus_memberService.class);
    wanplus_teamService wanplus_teamService = ac.getBean(wanplus_teamService.class);
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1500);
    private static int num = 0;
    private String ip="222.66.179.10";
    private int port =8080;
    wanplus_member wanplusMember= new wanplus_member();
    wanplus_team wanplusTeam = new wanplus_team();
    wanplus_memebers7 wanplus_members7 =new wanplus_memebers7();
    wanplus_member_summer2017 wanplus_member_summer2017 =new wanplus_member_summer2017();


    @Override
    synchronized public void process(Page page) {

        //1. 如果是用户列表页面 【入口页面】，将所有用户的详细页面的url放入target集合中。
        if (page.getUrl().regex(".*/playerstats").match()) {
            //选手
            for(int k=1;k<10;k++) {
                try {
                    Document doc = Jsoup.connect("http://www.famulei.com/services/match/match_data_ssdb_list.php?tournament_id=62&type=player&order_type=KDA&order_value=DESC&page="+k)//http://music.163.com/song?id=33206214 ; http://1212.ip138.com/ic.asp
                            .header("Host", "api-v2.famulei.com").header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36").header("Accept", "application/json, text/javascript, */*; q=0.01").header("Accept-Encoding", "gzip, deflate").header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                            // .cookie("Cookie","__guid=49530400.2858671149316304000.1522241110372.125; wp_pvid=2492906368; isShown=1; wp_info=ssid=s7559777198; Hm_lvt_f69cb5ec253c6012b2aa449fb925c1c2=1522241113,1522322773; Hm_lpvt_f69cb5ec253c6012b2aa449fb925c1c2=1522325228; wanplus_token=b88ec1b09146b04276495298e11daeda; wanplus_storage=lf4m67eka3o; wanplus_sid=96490082f3710afe25421e6593cb441d; wanplus_csrf=_csrf_tk_39464146; gameType=2; monitor_count=31")
                            // .data("param","ZEc5MWNtNWhiV1Z1ZEY5cFpEMDBNQ1owZVhCbFBYQnNZWGxsY2ladmNtUmxjbDkwZVhCbFBVdEVRU1p2Y21SbGNsOTJZV3gxWlQxRVJWTkRKblJsWVcxZmJtRnRaVDBtY0d4aGVXVnlYMjVoYldVOUpuQnZjMmwwYVc5dVgyNWhiV1U5Sm5CaFoyVTlPU1poY0dsZmRtVnljMmx2YmowMExqY3VNQ1p3YkdGMFptOXliVDEzWldJbWRITTlNVFV5TWpVd05qTTJPUT09RldBUElLRk1M")
//                        .data("draw","1")
//                        .data("columns[0][data]","order")
//                        .data("eid","579")
                            .timeout(8 * 1000).get();

                    String Json = doc.body().text();
                    List<String> player_name = new JsonPathSelector("$.data.data.list[*].player_name").selectList(Json);
                    List<String> team_name = new JsonPathSelector("$.data.data.list[*].team_name").selectList(Json);
                    List<String> position = new JsonPathSelector("$.data.data.list[*].position").selectList(Json);
                    List<String> MVP = new JsonPathSelector("$.data.data.list[*].MVP").selectList(Json);
                    List<String> MINUTE_ECONOMIC = new JsonPathSelector("$.data.data.list[*].MINUTE_ECONOMIC").selectList(Json);
                    List<String> MINUTE_HITS = new JsonPathSelector("$.data.data.list[*].MINUTE_HITS").selectList(Json);
                    List<String> MINUTE_DAMAGEDEALT = new JsonPathSelector("$.data.data.list[*].MINUTE_DAMAGEDEALT").selectList(Json);
                    List<String> DAMAGEDEALT_RATE = new JsonPathSelector("$.data.data.list[*].DAMAGEDEALT_RATE").selectList(Json);
                    List<String> MINUTE_DAMAGETAKEN = new JsonPathSelector("$.data.data.list[*].MINUTE_DAMAGETAKEN").selectList(Json);
                    List<String> DAMAGETAKEN_RATE = new JsonPathSelector("$.data.data.list[*].DAMAGETAKEN_RATE").selectList(Json);
                    List<String> MINUTE_WARDSPLACED = new JsonPathSelector("$.data.data.list[*].MINUTE_WARDSPLACED").selectList(Json);
                    List<String> MINUTE_WARDKILLED = new JsonPathSelector("$.data.data.list[*].MINUTE_WARDKILLED").selectList(Json);
                    List<String> PLAYS_TIMES = new JsonPathSelector("$.data.data.list[*].PLAYS_TIMES").selectList(Json);
                    List<String> KDA = new JsonPathSelector("$.data.data.list[*].KDA").selectList(Json);
                    List<String> OFFERED_RATE = new JsonPathSelector("$.data.data.list[*].OFFERED_RATE").selectList(Json);

                    for (int i = 0; i < team_name.size(); i++) {
                        String splayer_name = player_name.get(i);
                        String steam_name = team_name.get(i);
                        String sposition = position.get(i);
                        int iMVP = Integer.parseInt(MVP.get(i));
                        float sMINUTE_ECONOMIC = Float.parseFloat(MINUTE_ECONOMIC.get(i));
                        float sMINUTE_HITS = Float.parseFloat(MINUTE_HITS.get(i));
                        float sMINUTE_DAMAGEDEALT = Float.parseFloat(MINUTE_DAMAGEDEALT.get(i));
                        float sDAMAGEDEALT_RATE = Float.parseFloat(DAMAGEDEALT_RATE.get(i));
                        float sMINUTE_DAMAGETAKEN = Float.parseFloat(MINUTE_DAMAGETAKEN.get(i));
                        float sDAMAGETAKEN_RATE = Float.parseFloat(DAMAGETAKEN_RATE.get(i));
                        float sMINUTE_WARDSPLACED = Float.parseFloat(MINUTE_WARDSPLACED.get(i));
                        float sMINUTE_WARDKILLED = Float.parseFloat(MINUTE_WARDKILLED.get(i));
                        int sPLAYS_TIMES = Integer.parseInt(PLAYS_TIMES.get(i));
                        float sKDA = Float.parseFloat(KDA.get(i));
                        float sOFFERED_RATE = Float.parseFloat(OFFERED_RATE.get(i));

                        wanplus_member_summer2017.setPlayerName(splayer_name);
                        wanplus_member_summer2017.setTeamName(steam_name);
                        wanplus_member_summer2017.setPosition(sposition);
                        wanplus_member_summer2017.setMvp(iMVP);
                        wanplus_member_summer2017.setMinuteEconomic(sMINUTE_ECONOMIC);
                        wanplus_member_summer2017.setMinuteHits(sMINUTE_HITS);
                        wanplus_member_summer2017.setMinuteDamagedealt(sMINUTE_DAMAGEDEALT);
                        wanplus_member_summer2017.setDamagedealtRate(sDAMAGEDEALT_RATE);
                        wanplus_member_summer2017.setMinuteDamagetaken(sMINUTE_DAMAGETAKEN);
                        wanplus_member_summer2017.setDamagetakenRate(sDAMAGETAKEN_RATE);
                        wanplus_member_summer2017.setMinuteWardsplaced(sMINUTE_WARDSPLACED);
                        wanplus_member_summer2017.setMinuteWardkilled(sMINUTE_WARDKILLED);
                        wanplus_member_summer2017.setPlaysTimes(sPLAYS_TIMES);
                        wanplus_member_summer2017.setKda(sKDA);
                        wanplus_member_summer2017.setOfferedRate(sOFFERED_RATE);

//                        wanplus_memberService.saveMsg_Summer2017(wanplus_member_summer2017);

                    }

                    System.out.println("成员信息完成");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//                战队
            for(int p=1;p<3;p++) {
                try {
                    Document doc = Jsoup.connect("http://www.famulei.com/services/match/match_data_ssdb_list.php?tournament_id=62&type=team&order_type=KDA&order_value=DESC&page="+p)//http://music.163.com/song?id=33206214 ; http://1212.ip138.com/ic.asp
                            .header("Host", "api-v2.famulei.com").header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36").header("Accept", "application/json, text/javascript, */*; q=0.01").header("Accept-Encoding", "gzip, deflate").header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                            // .cookie("Cookie","__guid=49530400.2858671149316304000.1522241110372.125; wp_pvid=2492906368; isShown=1; wp_info=ssid=s7559777198; Hm_lvt_f69cb5ec253c6012b2aa449fb925c1c2=1522241113,1522322773; Hm_lpvt_f69cb5ec253c6012b2aa449fb925c1c2=1522325228; wanplus_token=b88ec1b09146b04276495298e11daeda; wanplus_storage=lf4m67eka3o; wanplus_sid=96490082f3710afe25421e6593cb441d; wanplus_csrf=_csrf_tk_39464146; gameType=2; monitor_count=31")
                            //.data("param", "ZEc5MWNtNWhiV1Z1ZEY5cFpEMDJNaVowZVhCbFBYUmxZVzBtYjNKa1pYSmZkSGx3WlQxTFJFRW1iM0prWlhKZmRtRnNkV1U5UkVWVFF5WjBaV0Z0WDI1aGJXVTlKbkJzWVhsbGNsOXVZVzFsUFNad2IzTnBkR2x2Ymw5dVlXMWxQU1p3WVdkbFBUSW1ZWEJwWDNabGNuTnBiMjQ5TkM0M0xqQW1jR3hoZEdadmNtMDlkMlZpSm5SelBURTFNakl6T0RnM09EVT1GV0FQSUtGTUw=")
//                        .data("draw","1")
//                        .data("columns[0][data]","order")
//                        .data("eid","579")
                            .timeout(8 * 1000).get();

                    String Json = doc.body().text();
                    List<String> team_name = new JsonPathSelector("$.data.data.list[*].team_name").selectList(Json);
                    List<String> VICTORY_RATE = new JsonPathSelector("$.data.data.list[*].VICTORY_RATE").selectList(Json);
                    List<String> KDA = new JsonPathSelector("$.data.data.list[*].KDA").selectList(Json);
                    List<String> AVERAGE_TIME = new JsonPathSelector("$.data.data.list[*].AVERAGE_TIME").selectList(Json);
                    List<String> FIRSTBLOODKILL = new JsonPathSelector("$.data.data.list[*].FIRSTBLOODKILL").selectList(Json);
                    List<String> MINUTE_OUTPUT = new JsonPathSelector("$.data.data.list[*].MINUTE_OUTPUT").selectList(Json);
                    List<String> MINUTE_HITS = new JsonPathSelector("$.data.data.list[*].MINUTE_HITS").selectList(Json);
                    List<String> MINUTE_MONEY = new JsonPathSelector("$.data.data.list[*].MINUTE_MONEY").selectList(Json);
                    List<String> SMALLDRAGON_RATE = new JsonPathSelector("$.data.data.list[*].SMALLDRAGON_RATE").selectList(Json);
                    List<String> MINUTE_WARDSPLACED = new JsonPathSelector("$.data.data.list[*].MINUTE_WARDSPLACED").selectList(Json);
                    List<String> MINUTE_WARDSKILLED = new JsonPathSelector("$.data.data.list[*].MINUTE_WARDSKILLED").selectList(Json);
                    List<String> AVERAGE_TOWER_SUCCESS = new JsonPathSelector("$.data.data.list[*].AVERAGE_TOWER_SUCCESS").selectList(Json);
                    List<String> AVERAGE_TOWER_FAIL = new JsonPathSelector("$.data.data.list[*].AVERAGE_TOWER_FAIL").selectList(Json);
                    List<String> BIGDRAGON_RATE = new JsonPathSelector("$.data.data.list[*].BIGDRAGON_RATE").selectList(Json);

                    for (int i = 0; i < team_name.size(); i++) {
                        String steam_name = team_name.get(i);
                        float sVICTORY_RATE = Float.parseFloat(VICTORY_RATE.get(i));
                        float sKDA = Float.parseFloat(KDA.get(i));
                        String sAVERAGE_TIME = AVERAGE_TIME.get(i);
                        float sFIRSTBLOODKILL = Float.parseFloat(FIRSTBLOODKILL.get(i));
                        float sMINUTE_OUTPUT = Float.parseFloat(MINUTE_OUTPUT.get(i));
                        float sMINUTE_HITS = Float.parseFloat(MINUTE_HITS.get(i));
                        float sMINUTE_MONEY = Float.parseFloat(MINUTE_MONEY.get(i));
                        float sSMALLDRAGON_RATE = Float.parseFloat(SMALLDRAGON_RATE.get(i));
                        float sMINUTE_WARDSPLACED = Float.parseFloat(MINUTE_WARDSPLACED.get(i));
                        float sMINUTE_WARDSKILLED = Float.parseFloat(MINUTE_WARDSKILLED.get(i));
                        float sAVERAGE_TOWER_SUCCESS = Float.parseFloat(AVERAGE_TOWER_SUCCESS.get(i));
                        float sAVERAGE_TOWER_FAIL = Float.parseFloat(AVERAGE_TOWER_FAIL.get(i));
                        float sBIGDRAGON_RATE = Float.parseFloat(BIGDRAGON_RATE.get(i));

                        wanplusTeam.setTeamname(steam_name);
                        wanplusTeam.setVictoryRate(sVICTORY_RATE);
                        wanplusTeam.setKda(sKDA);
                        wanplusTeam.setAverageTime(sAVERAGE_TIME);
                        wanplusTeam.setFirstbloodkill(sFIRSTBLOODKILL);
                        wanplusTeam.setMinuteOutput(sMINUTE_OUTPUT);
                        wanplusTeam.setMinuteHits(sMINUTE_HITS);
                        wanplusTeam.setMinuteMoney(sMINUTE_MONEY);
                        wanplusTeam.setSmalldragonRate(sSMALLDRAGON_RATE);
                        wanplusTeam.setMinuteWardsplaced(sMINUTE_WARDSPLACED);
                        wanplusTeam.setMinuteWardskilled(sMINUTE_WARDSKILLED);
                        wanplusTeam.setAverageTowerSuccess(sAVERAGE_TOWER_SUCCESS);
                        wanplusTeam.setAverageTowerFail(sAVERAGE_TOWER_FAIL);
                        wanplusTeam.setBigdragonRate(sBIGDRAGON_RATE);

                    wanplus_teamService.saveMsg(wanplusTeam);
                    }


                    System.out.println("队伍信息完成");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//            HttpPost post = null;
//            HttpClient httpClient = HttpClients.createDefault();
//            post = new HttpPost("http://www.wanplus.com/ajax/stats/list");
//
//            //post.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
//            post.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
//          //  post.addHeader("Host", "music.163.com");
//
//            HttpResponse response = null;
//            try {
//                response = httpClient.execute(post);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            HttpEntity entity = response.getEntity();
//
//            try {
//                String responseContent = EntityUtils.toString(entity, "UTF-8");
//                System.out.println("111");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
         //   JSONObject jsonObject = null;

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

        Spider.create(new WanPlusLPLProcessor()).addUrl("http://www.wanplus.com/lol/playerstats")
                //  .setScheduler(new FileCacheQueueScheduler("C:\\Users\\USER\\Desktop\\爬虫练习\\txt"))
                .thread(1).run();
        endTime = new Date().getTime();
        System.out.println("========Bilibili用户信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到" + num + "个用户信息！用时为：" + (endTime - startTime) / 1000 + "s");
    }
}
