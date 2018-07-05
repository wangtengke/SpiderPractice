package com.pachong.demo;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
    public static void main(String[] args) throws IOException {
        //获取编辑推荐页
        Document document=Jsoup.connect("http://music.163.com/#/discover/playlist/?order=hot")
                //模拟火狐浏览器
                .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
                .get();
        Element main=document.getElementById("#m-pl-container");
        Elements url=main.select("li:nth-child(1)").select(" p.dec")
                .select("a");//#zh-recommend-list-full > div > div:nth-child(1) > h2 > a
        for(Element question:url){
            //输出href后的值，即主页上每个关注问题的链接
            String URL=question.attr("abs:href");
            //下载问题链接指向的页面
            Document document2=Jsoup.connect(URL)
                    .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
                    .get();
            //问题
            Elements title = question.select("a");
           // Elements title=document2.select("head").select("title");
            //问题描述
            Elements detail=document2.select("#react-root").select("div").select("div").select("div.Layout-main.av-card.av-paddingBottom.av-bodyFont.Layout-titleImage--full > div.RichText.PostIndex-content.av-paddingSide.av-card").select("p:nth-child(2)");
            //回答
            Elements answer=document2.select("#zh-question-answer-wrap")
                    .select("div.zm-item-rich-text.expandable.js-collapse-body")
                    .select("div.zm-editable-content.clearfix");
            System.out.println("\n"+"链接："+URL
                    +"\n"+"标题："+title.text()
                    +"\n"+"问题描述："+detail.text()
                    +"\n"+"回答："+answer.text());
        }
    }
}