package com.pachong.entity;

public class lpl_champion {
    private Integer ichampionid;

    private Integer appearancesfrequency;

    private Float averagingpick;

    private Float averagingban;

    private Float averagingwin;

    private Integer akill;

    private Float averagingkill;

    private Integer death;

    private Float averagingdeath;

    private Integer assists;

    private Float averagingassists;

    private Float averagingofferedrate;

    private String oftenmembername;

    public Integer getIchampionid() {
        return ichampionid;
    }

    public void setIchampionid(Integer ichampionid) {
        this.ichampionid = ichampionid;
    }

    public Integer getAppearancesfrequency() {
        return appearancesfrequency;
    }

    public void setAppearancesfrequency(Integer appearancesfrequency) {
        this.appearancesfrequency = appearancesfrequency;
    }

    public Float getAveragingpick() {
        return averagingpick;
    }

    public void setAveragingpick(Float averagingpick) {
        this.averagingpick = averagingpick;
    }

    public Float getAveragingban() {
        return averagingban;
    }

    public void setAveragingban(Float averagingban) {
        this.averagingban = averagingban;
    }

    public Float getAveragingwin() {
        return averagingwin;
    }

    public void setAveragingwin(Float averagingwin) {
        this.averagingwin = averagingwin;
    }

    public Integer getAkill() {
        return akill;
    }

    public void setAkill(Integer akill) {
        this.akill = akill;
    }

    public Float getAveragingkill() {
        return averagingkill;
    }

    public void setAveragingkill(Float averagingkill) {
        this.averagingkill = averagingkill;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Float getAveragingdeath() {
        return averagingdeath;
    }

    public void setAveragingdeath(Float averagingdeath) {
        this.averagingdeath = averagingdeath;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Float getAveragingassists() {
        return averagingassists;
    }

    public void setAveragingassists(Float averagingassists) {
        this.averagingassists = averagingassists;
    }

    public Float getAveragingofferedrate() {
        return averagingofferedrate;
    }

    public void setAveragingofferedrate(Float averagingofferedrate) {
        this.averagingofferedrate = averagingofferedrate;
    }

    public String getOftenmembername() {
        return oftenmembername;
    }

    public void setOftenmembername(String oftenmembername) {
        this.oftenmembername = oftenmembername;
    }

    @Override
    public String toString() {
        return "英雄 [name=" + ichampionid + "已经爬取";
    }
}