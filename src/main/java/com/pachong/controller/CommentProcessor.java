package com.pachong.controller;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @wtk
 **/
public class CommentProcessor implements PageProcessor {
    private Site site = Site.me()
//                        .setDomain("http://music.163.com")
            .setRetryTimes(3)
            .setSleepTime(1700)
            .setUseGzip(true);
    public void process(Page page){
        page.getHtml();
        page.getRawText();
    }
    @Override
    public Site getSite() {
        return this.site;
    }

}
