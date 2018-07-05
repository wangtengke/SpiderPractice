package com.pachong.entity;

public class bilibiliuser_follow {
    private String userid;

    private Integer follows;

    private Integer fans;

    private String url;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public String toString() {
        return "bilibili_follow [userid=" + userid + ",follows =" + follows + ", fans=" + fans + "]";
    }
}