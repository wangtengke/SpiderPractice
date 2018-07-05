package com.pachong.entity;

public class bilibiliuser_play {
    private String userid;

    private Integer playnum;

    private String url;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getPlaynum() {
        return playnum;
    }

    public void setPlaynum(Integer playnum) {
        this.playnum = playnum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public String toString() {
        return "bilibili_follow [userid=" + userid + ",playnum =" + playnum + ", url=" + url + "]";
    }
}