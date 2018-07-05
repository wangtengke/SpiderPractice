package com.pachong.entity;

import java.util.ArrayList;
import java.util.List;

public class wanplus_memberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public wanplus_memberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPlayerNameIsNull() {
            addCriterion("Player_Name is null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNotNull() {
            addCriterion("Player_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameEqualTo(String value) {
            addCriterion("Player_Name =", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotEqualTo(String value) {
            addCriterion("Player_Name <>", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThan(String value) {
            addCriterion("Player_Name >", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("Player_Name >=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThan(String value) {
            addCriterion("Player_Name <", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThanOrEqualTo(String value) {
            addCriterion("Player_Name <=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLike(String value) {
            addCriterion("Player_Name like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotLike(String value) {
            addCriterion("Player_Name not like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIn(List<String> values) {
            addCriterion("Player_Name in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotIn(List<String> values) {
            addCriterion("Player_Name not in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameBetween(String value1, String value2) {
            addCriterion("Player_Name between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotBetween(String value1, String value2) {
            addCriterion("Player_Name not between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("Team_Name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("Team_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("Team_Name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("Team_Name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("Team_Name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("Team_Name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("Team_Name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("Team_Name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("Team_Name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("Team_Name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("Team_Name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("Team_Name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("Team_Name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("Team_Name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andMvpIsNull() {
            addCriterion("Mvp is null");
            return (Criteria) this;
        }

        public Criteria andMvpIsNotNull() {
            addCriterion("Mvp is not null");
            return (Criteria) this;
        }

        public Criteria andMvpEqualTo(Integer value) {
            addCriterion("Mvp =", value, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpNotEqualTo(Integer value) {
            addCriterion("Mvp <>", value, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpGreaterThan(Integer value) {
            addCriterion("Mvp >", value, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mvp >=", value, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpLessThan(Integer value) {
            addCriterion("Mvp <", value, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpLessThanOrEqualTo(Integer value) {
            addCriterion("Mvp <=", value, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpIn(List<Integer> values) {
            addCriterion("Mvp in", values, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpNotIn(List<Integer> values) {
            addCriterion("Mvp not in", values, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpBetween(Integer value1, Integer value2) {
            addCriterion("Mvp between", value1, value2, "mvp");
            return (Criteria) this;
        }

        public Criteria andMvpNotBetween(Integer value1, Integer value2) {
            addCriterion("Mvp not between", value1, value2, "mvp");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicIsNull() {
            addCriterion("Minute_Economic is null");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicIsNotNull() {
            addCriterion("Minute_Economic is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicEqualTo(Float value) {
            addCriterion("Minute_Economic =", value, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicNotEqualTo(Float value) {
            addCriterion("Minute_Economic <>", value, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicGreaterThan(Float value) {
            addCriterion("Minute_Economic >", value, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_Economic >=", value, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicLessThan(Float value) {
            addCriterion("Minute_Economic <", value, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicLessThanOrEqualTo(Float value) {
            addCriterion("Minute_Economic <=", value, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicIn(List<Float> values) {
            addCriterion("Minute_Economic in", values, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicNotIn(List<Float> values) {
            addCriterion("Minute_Economic not in", values, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicBetween(Float value1, Float value2) {
            addCriterion("Minute_Economic between", value1, value2, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteEconomicNotBetween(Float value1, Float value2) {
            addCriterion("Minute_Economic not between", value1, value2, "minuteEconomic");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsIsNull() {
            addCriterion("Minute_Hits is null");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsIsNotNull() {
            addCriterion("Minute_Hits is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsEqualTo(Float value) {
            addCriterion("Minute_Hits =", value, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsNotEqualTo(Float value) {
            addCriterion("Minute_Hits <>", value, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsGreaterThan(Float value) {
            addCriterion("Minute_Hits >", value, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_Hits >=", value, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsLessThan(Float value) {
            addCriterion("Minute_Hits <", value, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsLessThanOrEqualTo(Float value) {
            addCriterion("Minute_Hits <=", value, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsIn(List<Float> values) {
            addCriterion("Minute_Hits in", values, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsNotIn(List<Float> values) {
            addCriterion("Minute_Hits not in", values, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsBetween(Float value1, Float value2) {
            addCriterion("Minute_Hits between", value1, value2, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteHitsNotBetween(Float value1, Float value2) {
            addCriterion("Minute_Hits not between", value1, value2, "minuteHits");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtIsNull() {
            addCriterion("Minute_DamageDealt is null");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtIsNotNull() {
            addCriterion("Minute_DamageDealt is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtEqualTo(Float value) {
            addCriterion("Minute_DamageDealt =", value, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtNotEqualTo(Float value) {
            addCriterion("Minute_DamageDealt <>", value, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtGreaterThan(Float value) {
            addCriterion("Minute_DamageDealt >", value, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_DamageDealt >=", value, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtLessThan(Float value) {
            addCriterion("Minute_DamageDealt <", value, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtLessThanOrEqualTo(Float value) {
            addCriterion("Minute_DamageDealt <=", value, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtIn(List<Float> values) {
            addCriterion("Minute_DamageDealt in", values, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtNotIn(List<Float> values) {
            addCriterion("Minute_DamageDealt not in", values, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtBetween(Float value1, Float value2) {
            addCriterion("Minute_DamageDealt between", value1, value2, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagedealtNotBetween(Float value1, Float value2) {
            addCriterion("Minute_DamageDealt not between", value1, value2, "minuteDamagedealt");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateIsNull() {
            addCriterion("DamageDealt_Rate is null");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateIsNotNull() {
            addCriterion("DamageDealt_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateEqualTo(Float value) {
            addCriterion("DamageDealt_Rate =", value, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateNotEqualTo(Float value) {
            addCriterion("DamageDealt_Rate <>", value, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateGreaterThan(Float value) {
            addCriterion("DamageDealt_Rate >", value, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateGreaterThanOrEqualTo(Float value) {
            addCriterion("DamageDealt_Rate >=", value, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateLessThan(Float value) {
            addCriterion("DamageDealt_Rate <", value, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateLessThanOrEqualTo(Float value) {
            addCriterion("DamageDealt_Rate <=", value, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateIn(List<Float> values) {
            addCriterion("DamageDealt_Rate in", values, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateNotIn(List<Float> values) {
            addCriterion("DamageDealt_Rate not in", values, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateBetween(Float value1, Float value2) {
            addCriterion("DamageDealt_Rate between", value1, value2, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andDamagedealtRateNotBetween(Float value1, Float value2) {
            addCriterion("DamageDealt_Rate not between", value1, value2, "damagedealtRate");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenIsNull() {
            addCriterion("Minute_DamageTaken is null");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenIsNotNull() {
            addCriterion("Minute_DamageTaken is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenEqualTo(Float value) {
            addCriterion("Minute_DamageTaken =", value, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenNotEqualTo(Float value) {
            addCriterion("Minute_DamageTaken <>", value, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenGreaterThan(Float value) {
            addCriterion("Minute_DamageTaken >", value, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_DamageTaken >=", value, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenLessThan(Float value) {
            addCriterion("Minute_DamageTaken <", value, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenLessThanOrEqualTo(Float value) {
            addCriterion("Minute_DamageTaken <=", value, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenIn(List<Float> values) {
            addCriterion("Minute_DamageTaken in", values, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenNotIn(List<Float> values) {
            addCriterion("Minute_DamageTaken not in", values, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenBetween(Float value1, Float value2) {
            addCriterion("Minute_DamageTaken between", value1, value2, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andMinuteDamagetakenNotBetween(Float value1, Float value2) {
            addCriterion("Minute_DamageTaken not between", value1, value2, "minuteDamagetaken");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateIsNull() {
            addCriterion("DamageTaken_Rate is null");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateIsNotNull() {
            addCriterion("DamageTaken_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateEqualTo(Float value) {
            addCriterion("DamageTaken_Rate =", value, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateNotEqualTo(Float value) {
            addCriterion("DamageTaken_Rate <>", value, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateGreaterThan(Float value) {
            addCriterion("DamageTaken_Rate >", value, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateGreaterThanOrEqualTo(Float value) {
            addCriterion("DamageTaken_Rate >=", value, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateLessThan(Float value) {
            addCriterion("DamageTaken_Rate <", value, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateLessThanOrEqualTo(Float value) {
            addCriterion("DamageTaken_Rate <=", value, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateIn(List<Float> values) {
            addCriterion("DamageTaken_Rate in", values, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateNotIn(List<Float> values) {
            addCriterion("DamageTaken_Rate not in", values, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateBetween(Float value1, Float value2) {
            addCriterion("DamageTaken_Rate between", value1, value2, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andDamagetakenRateNotBetween(Float value1, Float value2) {
            addCriterion("DamageTaken_Rate not between", value1, value2, "damagetakenRate");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedIsNull() {
            addCriterion("Minute_WardsPlaced is null");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedIsNotNull() {
            addCriterion("Minute_WardsPlaced is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedEqualTo(Float value) {
            addCriterion("Minute_WardsPlaced =", value, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedNotEqualTo(Float value) {
            addCriterion("Minute_WardsPlaced <>", value, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedGreaterThan(Float value) {
            addCriterion("Minute_WardsPlaced >", value, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_WardsPlaced >=", value, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedLessThan(Float value) {
            addCriterion("Minute_WardsPlaced <", value, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedLessThanOrEqualTo(Float value) {
            addCriterion("Minute_WardsPlaced <=", value, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedIn(List<Float> values) {
            addCriterion("Minute_WardsPlaced in", values, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedNotIn(List<Float> values) {
            addCriterion("Minute_WardsPlaced not in", values, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedBetween(Float value1, Float value2) {
            addCriterion("Minute_WardsPlaced between", value1, value2, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardsplacedNotBetween(Float value1, Float value2) {
            addCriterion("Minute_WardsPlaced not between", value1, value2, "minuteWardsplaced");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledIsNull() {
            addCriterion("Minute_WardKilled is null");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledIsNotNull() {
            addCriterion("Minute_WardKilled is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledEqualTo(Float value) {
            addCriterion("Minute_WardKilled =", value, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledNotEqualTo(Float value) {
            addCriterion("Minute_WardKilled <>", value, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledGreaterThan(Float value) {
            addCriterion("Minute_WardKilled >", value, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_WardKilled >=", value, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledLessThan(Float value) {
            addCriterion("Minute_WardKilled <", value, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledLessThanOrEqualTo(Float value) {
            addCriterion("Minute_WardKilled <=", value, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledIn(List<Float> values) {
            addCriterion("Minute_WardKilled in", values, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledNotIn(List<Float> values) {
            addCriterion("Minute_WardKilled not in", values, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledBetween(Float value1, Float value2) {
            addCriterion("Minute_WardKilled between", value1, value2, "minuteWardkilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardkilledNotBetween(Float value1, Float value2) {
            addCriterion("Minute_WardKilled not between", value1, value2, "minuteWardkilled");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}