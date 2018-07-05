package com.pachong.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.pachong.entity.lpl_champion;
import com.pachong.entity.lpl_member;
import com.pachong.entity.lpl_team;
import com.pachong.service.lpl_teamService;
import com.pachong.service.lpl_memberService;
import com.pachong.service.lpl_championService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
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

/**
 * @wtk
 **/
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class LPLProcessor implements PageProcessor{
    private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    lpl_teamService lpl_teamService = ac.getBean(lpl_teamService.class);
    lpl_memberService lpl_memberService = ac.getBean(lpl_memberService.class);
    lpl_championService lpl_championService = ac.getBean(lpl_championService.class);

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1500);
    private static int num = 0;
    lpl_team lpl_team = new lpl_team();
    lpl_member lpl_member = new lpl_member();
    lpl_champion lpl_champion = new lpl_champion();
    @Override
    synchronized public void process(Page page) {
     //   page.addTargetRequest("http://apps.game.qq.com/lol/act/a20160519Match/Match.php?_a=teamsearch&iGameId=95&sGameType=1,5&iPage=1");
        page.addTargetRequest("http://apps.game.qq.com/lol/act/a20160519Match/Match.php?_a=teamsearch&iGameId=95&sGameType=1,5&iPage=2");
       for(int i=1;i<10;i++){
           page.addTargetRequest("http://apps.game.qq.com/lol/act/a20160519Match/Match.php?_a=personalrank&iGameId=95&sGameType=1,5&iPage="+i);
       }
       for (int k=1;k<9;k++){
           page.addTargetRequest(" http://apps.game.qq.com/lol/act/a20160519Match/Match.php?_a=herorank&iGameId=95&sGameType=1,5&iPage="+k);
       }
        //1. 如果是用户列表页面 【入口页面】，将所有用户的详细页面的url放入target集合中。
        if (page.getUrl().regex(".*teamsearch.*").match()) {
           String json=page.getRawText().toString();
              json=  json.substring(json.indexOf("RES =") + 5);//去除前面的变量，得到正确的json字符串格式
            List<String> iAppearancesFrequency = new JsonPathSelector ("$.msg.data[*].iAppearancesFrequency").selectList(json);
            List<String> sTeamName = new JsonPathSelector ("$.msg.data[*].sTeamName").selectList(json);
            List<String> iWin = new JsonPathSelector ("$.msg.data[*].iWin").selectList(json);
            List<String> iLoss = new JsonPathSelector ("$.msg.data[*].iLoss").selectList(json);
            List<String> sAveragingWin = new JsonPathSelector ("$.msg.data[*].sAveragingWin").selectList(json);
            List<String> iKill = new JsonPathSelector ("$.msg.data[*].iKill").selectList(json);
            List<String> sAveragingKill = new JsonPathSelector ("$.msg.data[*].sAveragingKill").selectList(json);
            List<String> iDeath = new JsonPathSelector ("$.msg.data[*].iDeath").selectList(json);
            List<String> sAveragingDeath = new JsonPathSelector ("$.msg.data[*].sAveragingDeath").selectList(json);
            List<String> sAveragingWardPlaced = new JsonPathSelector ("$.msg.data[*].sAveragingWardPlaced").selectList(json);
            List<String> sAveragingWardKilled = new JsonPathSelector ("$.msg.data[*].sAveragingWardKilled").selectList(json);
            List<String> sAveragingGold = new JsonPathSelector ("$.msg.data[*].sAveragingGold").selectList(json);
            List<String> sAveragingSmallDragon = new JsonPathSelector ("$.msg.data[*].sAveragingSmallDragon").selectList(json);
            List<String> sAveragingBigDragon = new JsonPathSelector ("$.msg.data[*].sAveragingBigDragon").selectList(json);

            for(int i=0;i<iAppearancesFrequency.size();i++){
                int AppearancesFrequency =Integer.parseInt(iAppearancesFrequency.get(i));
                String TeamName =sTeamName.get(i);
                int Win =Integer.parseInt(iWin.get(i));
                int Loss =Integer.parseInt(iLoss.get(i));
                float AveragingWin =Float.parseFloat(sAveragingWin.get(i));
                int Kill =Integer.parseInt(iKill.get(i));
                float AveragingKill =Float.parseFloat(sAveragingKill.get(i));
                int Death =Integer.parseInt(iDeath.get(i));
                float AveragingDeath =Float.parseFloat(sAveragingDeath.get(i));
                int AveragingWardPlaced =(int)Float.parseFloat(sAveragingWardPlaced.get(i));
                int AveragingWardKilled =(int)Float.parseFloat(sAveragingWardKilled.get(i));
                float AveragingGold =Float.parseFloat(sAveragingGold.get(i));
                float AveragingSmallDragon =Float.parseFloat(sAveragingSmallDragon.get(i));
                float AveragingBigDragon =Float.parseFloat(sAveragingBigDragon.get(i));

                lpl_team.setAppearancesfrequency(AppearancesFrequency);
                lpl_team.setTeamname(TeamName);
                lpl_team.setWin(Win);
                lpl_team.setLoss(Loss);
                lpl_team.setAveragingwin(AveragingWin);
                lpl_team.setAkill(Kill);
                lpl_team.setAveragingkill(AveragingKill);
                lpl_team.setDeath(Death);
                lpl_team.setAveragingdeath(AveragingDeath);
                lpl_team.setAveragingwardplaced(AveragingWardPlaced);
                lpl_team.setAveragingwardkilled(AveragingWardKilled);
                lpl_team.setAveraginggold(AveragingGold);
                lpl_team.setAveragingsmalldragon(AveragingSmallDragon);
                lpl_team.setAveragingbigdragon(AveragingBigDragon);


                lpl_teamService.saveMsg(lpl_team);


                System.out.println(lpl_team.toString());
            }
           System.out.println("队伍信息完成");
        }
        else if(page.getUrl().regex(".*personalrank.*").match()){

            String json=page.getRawText().toString();
            json=  json.substring(json.indexOf("RES =") + 5);//去除前面的变量，得到正确的json字符串格式
            List<String> sMemberName = new JsonPathSelector ("$.msg.data[*].sMemberName").selectList(json);
            List<String> iPosition = new JsonPathSelector ("$.msg.data[*].iPosition").selectList(json);
            List<String> iAppearancesFrequency = new JsonPathSelector ("$.msg.data[*].iAppearancesFrequency").selectList(json);
            List<String> iKill = new JsonPathSelector ("$.msg.data[*].iKill").selectList(json);
            List<String> sAveragingKill = new JsonPathSelector ("$.msg.data[*].sAveragingKill").selectList(json);
            List<String> iAssists = new JsonPathSelector ("$.msg.data[*].iAssists").selectList(json);
            List<String> sAveragingAssists = new JsonPathSelector ("$.msg.data[*].sAveragingAssists").selectList(json);
            List<String> iDeath = new JsonPathSelector ("$.msg.data[*].iDeath").selectList(json);
            List<String> sAveragingDeath = new JsonPathSelector ("$.msg.data[*].sAveragingDeath").selectList(json);
            List<String> iKDA = new JsonPathSelector ("$.msg.data[*].iKDA").selectList(json);
            List<String> sAveragingGold = new JsonPathSelector ("$.msg.data[*].sAveragingGold").selectList(json);
            List<String> sAveragingLastLasthit = new JsonPathSelector ("$.msg.data[*].sAveragingLastLasthit").selectList(json);
            List<String> sAveragingWardPlaced = new JsonPathSelector ("$.msg.data[*].sAveragingWardPlaced").selectList(json);
            List<String> sAveragingWardKilled = new JsonPathSelector ("$.msg.data[*].sAveragingWardKilled").selectList(json);
            List<String> sAveragingOfferedRate = new JsonPathSelector ("$.msg.data[*].sAveragingOfferedRate").selectList(json);
            List<String> iLastLasthit = new JsonPathSelector ("$.msg.data[*].iLastLasthit").selectList(json);
            List<String> sFavoriteHeros = new JsonPathSelector ("$.msg.data[*].sFavoriteHeros").selectList(json);
            for(int i=0;i<iAppearancesFrequency.size();i++){
                String MemberName =sMemberName.get(i);
                String Position =iPosition.get(i);
                int AppearancesFrequency =Integer.parseInt(iAppearancesFrequency.get(i));
                int Kill =Integer.parseInt(iKill.get(i));
                float AveragingKill =Float.parseFloat(sAveragingKill.get(i));
                int Assists =Integer.parseInt(iAssists.get(i));
                float AveragingAssists =Float.parseFloat(sAveragingAssists.get(i));
                int Death =Integer.parseInt(iDeath.get(i));
                float AveragingDeath =Float.parseFloat(sAveragingDeath.get(i));
                float KDA =Float.parseFloat(iKDA.get(i));
                float AveragingGold =Float.parseFloat(sAveragingGold.get(i));
                int AveragingLastLasthit =(int)Float.parseFloat(sAveragingLastLasthit.get(i));
                int AveragingWardPlaced =(int)Float.parseFloat(sAveragingWardPlaced.get(i));
                int AveragingWardKilled =(int)Float.parseFloat(sAveragingWardKilled.get(i));
                float AveragingOfferedRate =Float.parseFloat(sAveragingOfferedRate.get(i));
                float LastLasthit =Float.parseFloat(iLastLasthit.get(i));
                String FavoriteHeros =sFavoriteHeros.get(i);

               lpl_member.setMembername(MemberName);
               lpl_member.setPosition(Position);
               lpl_member.setAppearancesfrequency(AppearancesFrequency);
               lpl_member.setAkill(Kill);
               lpl_member.setAveragingkill(AveragingKill);
               lpl_member.setAssists(Assists);
               lpl_member.setAveragingassists(AveragingAssists);
               lpl_member.setDeath(Death);
               lpl_member.setAveragingdeath(AveragingDeath);
               lpl_member.setKda(KDA);
               lpl_member.setAveraginggold(AveragingGold);
               lpl_member.setAveraginglastlasthit(AveragingLastLasthit);
               lpl_member.setAveragingwardplaced(AveragingWardPlaced);
               lpl_member.setAveragingwardkilled(AveragingWardKilled);
               lpl_member.setAveragingofferedrate(AveragingOfferedRate);
               lpl_member.setLastlasthit(LastLasthit);
               lpl_member.setFavoriteheros(FavoriteHeros);


                lpl_memberService.saveMsg(lpl_member);


                System.out.println(lpl_member.toString());
            }
            System.out.println("选手信息完成");
        }
        else {
           // num++;
            String json=page.getRawText().toString();
            json=  json.substring(json.indexOf("RES =") + 5);//去除前面的变量，得到正确的json字符串格式
            List<String> iChampionId = new JsonPathSelector ("$.msg.data[*].iChampionId").selectList(json);
            List<String> iAppearancesFrequency = new JsonPathSelector ("$.msg.data[*].iAppearancesFrequency").selectList(json);
            List<String> sAveragingPick = new JsonPathSelector ("$.msg.data[*].sAveragingPick").selectList(json);
            List<String> sAveragingBan = new JsonPathSelector ("$.msg.data[*].sAveragingBan").selectList(json);
            List<String> sAveragingWin = new JsonPathSelector ("$.msg.data[*].sAveragingWin").selectList(json);
            List<String> iKill = new JsonPathSelector ("$.msg.data[*].iKill").selectList(json);
            List<String> sAveragingKill = new JsonPathSelector ("$.msg.data[*].sAveragingKill").selectList(json);
            List<String> iDeath = new JsonPathSelector ("$.msg.data[*].iDeath").selectList(json);
            List<String> sAveragingDeath = new JsonPathSelector ("$.msg.data[*].sAveragingDeath").selectList(json);
            List<String> iAssists = new JsonPathSelector ("$.msg.data[*].iAssists").selectList(json);
            List<String> sAveragingAssists = new JsonPathSelector ("$.msg.data[*].sAveragingAssists").selectList(json);
            List<String> sAveragingOfferedRate = new JsonPathSelector ("$.msg.data[*].sAveragingOfferedRate").selectList(json);
            List<String> sOftenMemberName = new JsonPathSelector ("$.msg.data[*].sOftenMemberName").selectList(json);

            for(int i=0;i<iAppearancesFrequency.size();i++){
                int ChampionId =Integer.parseInt(iChampionId.get(i));
                int AppearancesFrequency =Integer.parseInt(iAppearancesFrequency.get(i));
                float AveragingPick =Float.parseFloat(sAveragingPick.get(i));
                float AveragingBan =Float.parseFloat(sAveragingBan.get(i));
                float AveragingWin =Float.parseFloat(sAveragingWin.get(i));
                int Kill =Integer.parseInt(iKill.get(i));
                float AveragingKill =Float.parseFloat(sAveragingKill.get(i));
                int Death =Integer.parseInt(iDeath.get(i));
                float AveragingDeath =Float.parseFloat(sAveragingDeath.get(i));
                int Assists =Integer.parseInt(iAssists.get(i));
                float AveragingAssists =Float.parseFloat(sAveragingAssists.get(i));
                float AveragingOfferedRate =Float.parseFloat(sAveragingOfferedRate.get(i));
                String OftenMemberName =sOftenMemberName.get(i);

                lpl_champion.setIchampionid(ChampionId);
                lpl_champion.setAppearancesfrequency(AppearancesFrequency);
                lpl_champion.setAveragingpick(AveragingPick);
                lpl_champion.setAveragingban(AveragingBan);
                lpl_champion.setAveragingwin(AveragingWin);
                lpl_champion.setAkill(Kill);
                lpl_champion.setAveragingkill(AveragingKill);
                lpl_champion.setDeath(Death);
                lpl_champion.setAveragingdeath(AveragingDeath);
                lpl_champion.setAssists(Assists);
                lpl_champion.setAveragingassists(AveragingAssists);
                lpl_champion.setAveragingofferedrate(AveragingOfferedRate);
                lpl_champion.setOftenmembername(OftenMemberName);



                lpl_championService.saveMsg(lpl_champion);


                System.out.println(lpl_champion.toString());
            }

            System.out.println("英雄信息完成");
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
        System.out.println("========LPL信息小爬虫【启动】喽！=========");
        startTime = new Date().getTime();

        Spider.create(new LPLProcessor())
                .addUrl("http://apps.game.qq.com/lol/act/a20160519Match/Match.php?_a=teamsearch&iGameId=95&sGameType=1,5&iPage=1")
               // .setScheduler(new FileCacheQueueScheduler("C:\\Users\\USER\\Desktop\\爬虫练习\\txt"))
                .thread(1).run();
        endTime = new Date().getTime();
        System.out.println("========LPL信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到" + num + "个用户信息！用时为：" + (endTime - startTime) / 1000 + "s");
    }
}
