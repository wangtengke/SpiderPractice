package com.pachong.entity;

import java.util.ArrayList;
import java.util.List;

public class wanplus_teamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public wanplus_teamExample() {
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

        public Criteria andTeamnameIsNull() {
            addCriterion("TeamName is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("TeamName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("TeamName =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("TeamName <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("TeamName >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("TeamName >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("TeamName <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("TeamName <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("TeamName like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("TeamName not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("TeamName in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("TeamName not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("TeamName between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("TeamName not between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andVictoryRateIsNull() {
            addCriterion("Victory_Rate is null");
            return (Criteria) this;
        }

        public Criteria andVictoryRateIsNotNull() {
            addCriterion("Victory_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andVictoryRateEqualTo(Float value) {
            addCriterion("Victory_Rate =", value, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateNotEqualTo(Float value) {
            addCriterion("Victory_Rate <>", value, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateGreaterThan(Float value) {
            addCriterion("Victory_Rate >", value, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateGreaterThanOrEqualTo(Float value) {
            addCriterion("Victory_Rate >=", value, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateLessThan(Float value) {
            addCriterion("Victory_Rate <", value, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateLessThanOrEqualTo(Float value) {
            addCriterion("Victory_Rate <=", value, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateIn(List<Float> values) {
            addCriterion("Victory_Rate in", values, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateNotIn(List<Float> values) {
            addCriterion("Victory_Rate not in", values, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateBetween(Float value1, Float value2) {
            addCriterion("Victory_Rate between", value1, value2, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andVictoryRateNotBetween(Float value1, Float value2) {
            addCriterion("Victory_Rate not between", value1, value2, "victoryRate");
            return (Criteria) this;
        }

        public Criteria andKdaIsNull() {
            addCriterion("KDA is null");
            return (Criteria) this;
        }

        public Criteria andKdaIsNotNull() {
            addCriterion("KDA is not null");
            return (Criteria) this;
        }

        public Criteria andKdaEqualTo(Float value) {
            addCriterion("KDA =", value, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaNotEqualTo(Float value) {
            addCriterion("KDA <>", value, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaGreaterThan(Float value) {
            addCriterion("KDA >", value, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaGreaterThanOrEqualTo(Float value) {
            addCriterion("KDA >=", value, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaLessThan(Float value) {
            addCriterion("KDA <", value, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaLessThanOrEqualTo(Float value) {
            addCriterion("KDA <=", value, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaIn(List<Float> values) {
            addCriterion("KDA in", values, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaNotIn(List<Float> values) {
            addCriterion("KDA not in", values, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaBetween(Float value1, Float value2) {
            addCriterion("KDA between", value1, value2, "kda");
            return (Criteria) this;
        }

        public Criteria andKdaNotBetween(Float value1, Float value2) {
            addCriterion("KDA not between", value1, value2, "kda");
            return (Criteria) this;
        }

        public Criteria andAverageTimeIsNull() {
            addCriterion("Average_Time is null");
            return (Criteria) this;
        }

        public Criteria andAverageTimeIsNotNull() {
            addCriterion("Average_Time is not null");
            return (Criteria) this;
        }

        public Criteria andAverageTimeEqualTo(String value) {
            addCriterion("Average_Time =", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotEqualTo(String value) {
            addCriterion("Average_Time <>", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeGreaterThan(String value) {
            addCriterion("Average_Time >", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Average_Time >=", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeLessThan(String value) {
            addCriterion("Average_Time <", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeLessThanOrEqualTo(String value) {
            addCriterion("Average_Time <=", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeLike(String value) {
            addCriterion("Average_Time like", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotLike(String value) {
            addCriterion("Average_Time not like", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeIn(List<String> values) {
            addCriterion("Average_Time in", values, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotIn(List<String> values) {
            addCriterion("Average_Time not in", values, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeBetween(String value1, String value2) {
            addCriterion("Average_Time between", value1, value2, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotBetween(String value1, String value2) {
            addCriterion("Average_Time not between", value1, value2, "averageTime");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillIsNull() {
            addCriterion("FirstBloodKill is null");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillIsNotNull() {
            addCriterion("FirstBloodKill is not null");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillEqualTo(Float value) {
            addCriterion("FirstBloodKill =", value, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillNotEqualTo(Float value) {
            addCriterion("FirstBloodKill <>", value, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillGreaterThan(Float value) {
            addCriterion("FirstBloodKill >", value, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillGreaterThanOrEqualTo(Float value) {
            addCriterion("FirstBloodKill >=", value, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillLessThan(Float value) {
            addCriterion("FirstBloodKill <", value, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillLessThanOrEqualTo(Float value) {
            addCriterion("FirstBloodKill <=", value, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillIn(List<Float> values) {
            addCriterion("FirstBloodKill in", values, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillNotIn(List<Float> values) {
            addCriterion("FirstBloodKill not in", values, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillBetween(Float value1, Float value2) {
            addCriterion("FirstBloodKill between", value1, value2, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andFirstbloodkillNotBetween(Float value1, Float value2) {
            addCriterion("FirstBloodKill not between", value1, value2, "firstbloodkill");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputIsNull() {
            addCriterion("Minute_Output is null");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputIsNotNull() {
            addCriterion("Minute_Output is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputEqualTo(Float value) {
            addCriterion("Minute_Output =", value, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputNotEqualTo(Float value) {
            addCriterion("Minute_Output <>", value, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputGreaterThan(Float value) {
            addCriterion("Minute_Output >", value, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_Output >=", value, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputLessThan(Float value) {
            addCriterion("Minute_Output <", value, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputLessThanOrEqualTo(Float value) {
            addCriterion("Minute_Output <=", value, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputIn(List<Float> values) {
            addCriterion("Minute_Output in", values, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputNotIn(List<Float> values) {
            addCriterion("Minute_Output not in", values, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputBetween(Float value1, Float value2) {
            addCriterion("Minute_Output between", value1, value2, "minuteOutput");
            return (Criteria) this;
        }

        public Criteria andMinuteOutputNotBetween(Float value1, Float value2) {
            addCriterion("Minute_Output not between", value1, value2, "minuteOutput");
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

        public Criteria andMinuteMoneyIsNull() {
            addCriterion("Minute_Money is null");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyIsNotNull() {
            addCriterion("Minute_Money is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyEqualTo(Float value) {
            addCriterion("Minute_Money =", value, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyNotEqualTo(Float value) {
            addCriterion("Minute_Money <>", value, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyGreaterThan(Float value) {
            addCriterion("Minute_Money >", value, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_Money >=", value, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyLessThan(Float value) {
            addCriterion("Minute_Money <", value, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyLessThanOrEqualTo(Float value) {
            addCriterion("Minute_Money <=", value, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyIn(List<Float> values) {
            addCriterion("Minute_Money in", values, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyNotIn(List<Float> values) {
            addCriterion("Minute_Money not in", values, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyBetween(Float value1, Float value2) {
            addCriterion("Minute_Money between", value1, value2, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andMinuteMoneyNotBetween(Float value1, Float value2) {
            addCriterion("Minute_Money not between", value1, value2, "minuteMoney");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateIsNull() {
            addCriterion("SmallDragon_Rate is null");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateIsNotNull() {
            addCriterion("SmallDragon_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateEqualTo(Float value) {
            addCriterion("SmallDragon_Rate =", value, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateNotEqualTo(Float value) {
            addCriterion("SmallDragon_Rate <>", value, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateGreaterThan(Float value) {
            addCriterion("SmallDragon_Rate >", value, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateGreaterThanOrEqualTo(Float value) {
            addCriterion("SmallDragon_Rate >=", value, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateLessThan(Float value) {
            addCriterion("SmallDragon_Rate <", value, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateLessThanOrEqualTo(Float value) {
            addCriterion("SmallDragon_Rate <=", value, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateIn(List<Float> values) {
            addCriterion("SmallDragon_Rate in", values, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateNotIn(List<Float> values) {
            addCriterion("SmallDragon_Rate not in", values, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateBetween(Float value1, Float value2) {
            addCriterion("SmallDragon_Rate between", value1, value2, "smalldragonRate");
            return (Criteria) this;
        }

        public Criteria andSmalldragonRateNotBetween(Float value1, Float value2) {
            addCriterion("SmallDragon_Rate not between", value1, value2, "smalldragonRate");
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

        public Criteria andMinuteWardskilledIsNull() {
            addCriterion("Minute_WardsKilled is null");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledIsNotNull() {
            addCriterion("Minute_WardsKilled is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledEqualTo(Float value) {
            addCriterion("Minute_WardsKilled =", value, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledNotEqualTo(Float value) {
            addCriterion("Minute_WardsKilled <>", value, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledGreaterThan(Float value) {
            addCriterion("Minute_WardsKilled >", value, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledGreaterThanOrEqualTo(Float value) {
            addCriterion("Minute_WardsKilled >=", value, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledLessThan(Float value) {
            addCriterion("Minute_WardsKilled <", value, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledLessThanOrEqualTo(Float value) {
            addCriterion("Minute_WardsKilled <=", value, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledIn(List<Float> values) {
            addCriterion("Minute_WardsKilled in", values, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledNotIn(List<Float> values) {
            addCriterion("Minute_WardsKilled not in", values, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledBetween(Float value1, Float value2) {
            addCriterion("Minute_WardsKilled between", value1, value2, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andMinuteWardskilledNotBetween(Float value1, Float value2) {
            addCriterion("Minute_WardsKilled not between", value1, value2, "minuteWardskilled");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessIsNull() {
            addCriterion("Average_Tower_Success is null");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessIsNotNull() {
            addCriterion("Average_Tower_Success is not null");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessEqualTo(Float value) {
            addCriterion("Average_Tower_Success =", value, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessNotEqualTo(Float value) {
            addCriterion("Average_Tower_Success <>", value, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessGreaterThan(Float value) {
            addCriterion("Average_Tower_Success >", value, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessGreaterThanOrEqualTo(Float value) {
            addCriterion("Average_Tower_Success >=", value, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessLessThan(Float value) {
            addCriterion("Average_Tower_Success <", value, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessLessThanOrEqualTo(Float value) {
            addCriterion("Average_Tower_Success <=", value, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessIn(List<Float> values) {
            addCriterion("Average_Tower_Success in", values, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessNotIn(List<Float> values) {
            addCriterion("Average_Tower_Success not in", values, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessBetween(Float value1, Float value2) {
            addCriterion("Average_Tower_Success between", value1, value2, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerSuccessNotBetween(Float value1, Float value2) {
            addCriterion("Average_Tower_Success not between", value1, value2, "averageTowerSuccess");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailIsNull() {
            addCriterion("Average_Tower_Fail is null");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailIsNotNull() {
            addCriterion("Average_Tower_Fail is not null");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailEqualTo(Float value) {
            addCriterion("Average_Tower_Fail =", value, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailNotEqualTo(Float value) {
            addCriterion("Average_Tower_Fail <>", value, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailGreaterThan(Float value) {
            addCriterion("Average_Tower_Fail >", value, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailGreaterThanOrEqualTo(Float value) {
            addCriterion("Average_Tower_Fail >=", value, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailLessThan(Float value) {
            addCriterion("Average_Tower_Fail <", value, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailLessThanOrEqualTo(Float value) {
            addCriterion("Average_Tower_Fail <=", value, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailIn(List<Float> values) {
            addCriterion("Average_Tower_Fail in", values, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailNotIn(List<Float> values) {
            addCriterion("Average_Tower_Fail not in", values, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailBetween(Float value1, Float value2) {
            addCriterion("Average_Tower_Fail between", value1, value2, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andAverageTowerFailNotBetween(Float value1, Float value2) {
            addCriterion("Average_Tower_Fail not between", value1, value2, "averageTowerFail");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateIsNull() {
            addCriterion("BigDragon_Rate is null");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateIsNotNull() {
            addCriterion("BigDragon_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateEqualTo(Float value) {
            addCriterion("BigDragon_Rate =", value, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateNotEqualTo(Float value) {
            addCriterion("BigDragon_Rate <>", value, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateGreaterThan(Float value) {
            addCriterion("BigDragon_Rate >", value, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateGreaterThanOrEqualTo(Float value) {
            addCriterion("BigDragon_Rate >=", value, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateLessThan(Float value) {
            addCriterion("BigDragon_Rate <", value, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateLessThanOrEqualTo(Float value) {
            addCriterion("BigDragon_Rate <=", value, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateIn(List<Float> values) {
            addCriterion("BigDragon_Rate in", values, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateNotIn(List<Float> values) {
            addCriterion("BigDragon_Rate not in", values, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateBetween(Float value1, Float value2) {
            addCriterion("BigDragon_Rate between", value1, value2, "bigdragonRate");
            return (Criteria) this;
        }

        public Criteria andBigdragonRateNotBetween(Float value1, Float value2) {
            addCriterion("BigDragon_Rate not between", value1, value2, "bigdragonRate");
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