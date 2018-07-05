package com.pachong.entity;

public class musictoplist {
    private Integer id;

    private String title;

    private Integer commentnum;

    private String singer;

    private String url;

    private String commenttop1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCommenttop1() {
        return commenttop1;
    }

    public void setCommenttop1(String commenttop1) {
        this.commenttop1 = commenttop1;
    }

    @Override
    public String toString() {
        return "musictoplist [title=" + title + ",commentnum =" + commentnum + ", singer=" + singer + "]";
    }
}