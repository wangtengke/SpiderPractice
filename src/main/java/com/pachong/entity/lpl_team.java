package com.pachong.entity;

public class lpl_team {
    private Integer teamid;

    private String teamname;

    private Integer appearancesfrequency;

    private Integer win;

    private Integer loss;

    private Float averagingwin;

    private Integer akill;

    private Float averagingkill;

    private Integer death;

    private Float averagingdeath;

    private Integer averagingwardplaced;

    private Integer averagingwardkilled;

    private Float averaginggold;

    private Float averagingsmalldragon;

    private Float averagingbigdragon;

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Integer getAppearancesfrequency() {
        return appearancesfrequency;
    }

    public void setAppearancesfrequency(Integer appearancesfrequency) {
        this.appearancesfrequency = appearancesfrequency;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getLoss() {
        return loss;
    }

    public void setLoss(Integer loss) {
        this.loss = loss;
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

    public Float getAveraginggold() {
        return averaginggold;
    }

    public void setAveraginggold(Float averaginggold) {
        this.averaginggold = averaginggold;
    }

    public Float getAveragingsmalldragon() {
        return averagingsmalldragon;
    }

    public void setAveragingsmalldragon(Float averagingsmalldragon) {
        this.averagingsmalldragon = averagingsmalldragon;
    }

    public Float getAveragingbigdragon() {
        return averagingbigdragon;
    }

    public void setAveragingbigdragon(Float averagingbigdragon) {
        this.averagingbigdragon = averagingbigdragon;
    }

    @Override
    public String toString() {
        return "队伍 [name=" + teamname + "已经爬取";
    }
}