package com.pachong.entity;

public class lpl_member {
    private Integer memberid;

    private String membername;

    private String position;

    private Integer appearancesfrequency;

    private Integer akill;

    private Float averagingkill;

    private Integer assists;

    private Float averagingassists;

    private Integer death;

    private Float averagingdeath;

    private Float kda;

    private Float averaginggold;

    private Integer averaginglastlasthit;

    private Integer averagingwardplaced;

    private Integer averagingwardkilled;

    private Float averagingofferedrate;

    private Float lastlasthit;

    private String favoriteheros;

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAppearancesfrequency() {
        return appearancesfrequency;
    }

    public void setAppearancesfrequency(Integer appearancesfrequency) {
        this.appearancesfrequency = appearancesfrequency;
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

    public Float getKda() {
        return kda;
    }

    public void setKda(Float kda) {
        this.kda = kda;
    }

    public Float getAveraginggold() {
        return averaginggold;
    }

    public void setAveraginggold(Float averaginggold) {
        this.averaginggold = averaginggold;
    }

    public Integer getAveraginglastlasthit() {
        return averaginglastlasthit;
    }

    public void setAveraginglastlasthit(Integer averaginglastlasthit) {
        this.averaginglastlasthit = averaginglastlasthit;
    }

    public Integer getAveragingwardplaced() {
        return averagingwardplaced;
    }

    public void setAveragingwardplaced(Integer averagingwardplaced) {
        this.averagingwardplaced = averagingwardplaced;
    }

    public Integer getAveragingwardkilled() {
        return averagingwardkilled;
    }

    public void setAveragingwardkilled(Integer averagingwardkilled) {
        this.averagingwardkilled = averagingwardkilled;
    }

    public Float getAveragingofferedrate() {
        return averagingofferedrate;
    }

    public void setAveragingofferedrate(Float averagingofferedrate) {
        this.averagingofferedrate = averagingofferedrate;
    }

    public Float getLastlasthit() {
        return lastlasthit;
    }

    public void setLastlasthit(Float lastlasthit) {
        this.lastlasthit = lastlasthit;
    }

    public String getFavoriteheros() {
        return favoriteheros;
    }

    public void setFavoriteheros(String favoriteheros) {
        this.favoriteheros = favoriteheros;
    }

    @Override
    public String toString() {
        return "选手 [name=" + membername + "已经爬取";
    }
}