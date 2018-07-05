package com.pachong.entity;

import java.util.ArrayList;
import java.util.List;

public class lpl_teamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public lpl_teamExample() {
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

        public Criteria andTeamidIsNull() {
            addCriterion("TeamId is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("TeamId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Integer value) {
            addCriterion("TeamId =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Integer value) {
            addCriterion("TeamId <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Integer value) {
            addCriterion("TeamId >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TeamId >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Integer value) {
            addCriterion("TeamId <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("TeamId <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Integer> values) {
            addCriterion("TeamId in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Integer> values) {
            addCriterion("TeamId not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Integer value1, Integer value2) {
            addCriterion("TeamId between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("TeamId not between", value1, value2, "teamid");
            return (Criteria) this;
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

        public Criteria andAppearancesfrequencyIsNull() {
            addCriterion("AppearancesFrequency is null");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyIsNotNull() {
            addCriterion("AppearancesFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyEqualTo(Integer value) {
            addCriterion("AppearancesFrequency =", value, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyNotEqualTo(Integer value) {
            addCriterion("AppearancesFrequency <>", value, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyGreaterThan(Integer value) {
            addCriterion("AppearancesFrequency >", value, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("AppearancesFrequency >=", value, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyLessThan(Integer value) {
            addCriterion("AppearancesFrequency <", value, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("AppearancesFrequency <=", value, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyIn(List<Integer> values) {
            addCriterion("AppearancesFrequency in", values, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyNotIn(List<Integer> values) {
            addCriterion("AppearancesFrequency not in", values, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyBetween(Integer value1, Integer value2) {
            addCriterion("AppearancesFrequency between", value1, value2, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andAppearancesfrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("AppearancesFrequency not between", value1, value2, "appearancesfrequency");
            return (Criteria) this;
        }

        public Criteria andWinIsNull() {
            addCriterion("Win is null");
            return (Criteria) this;
        }

        public Criteria andWinIsNotNull() {
            addCriterion("Win is not null");
            return (Criteria) this;
        }

        public Criteria andWinEqualTo(Integer value) {
            addCriterion("Win =", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotEqualTo(Integer value) {
            addCriterion("Win <>", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinGreaterThan(Integer value) {
            addCriterion("Win >", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinGreaterThanOrEqualTo(Integer value) {
            addCriterion("Win >=", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinLessThan(Integer value) {
            addCriterion("Win <", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinLessThanOrEqualTo(Integer value) {
            addCriterion("Win <=", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinIn(List<Integer> values) {
            addCriterion("Win in", values, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotIn(List<Integer> values) {
            addCriterion("Win not in", values, "win");
            return (Criteria) this;
        }

        public Criteria andWinBetween(Integer value1, Integer value2) {
            addCriterion("Win between", value1, value2, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotBetween(Integer value1, Integer value2) {
            addCriterion("Win not between", value1, value2, "win");
            return (Criteria) this;
        }

        public Criteria andLossIsNull() {
            addCriterion("Loss is null");
            return (Criteria) this;
        }

        public Criteria andLossIsNotNull() {
            addCriterion("Loss is not null");
            return (Criteria) this;
        }

        public Criteria andLossEqualTo(Integer value) {
            addCriterion("Loss =", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotEqualTo(Integer value) {
            addCriterion("Loss <>", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThan(Integer value) {
            addCriterion("Loss >", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThanOrEqualTo(Integer value) {
            addCriterion("Loss >=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThan(Integer value) {
            addCriterion("Loss <", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThanOrEqualTo(Integer value) {
            addCriterion("Loss <=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossIn(List<Integer> values) {
            addCriterion("Loss in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotIn(List<Integer> values) {
            addCriterion("Loss not in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossBetween(Integer value1, Integer value2) {
            addCriterion("Loss between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotBetween(Integer value1, Integer value2) {
            addCriterion("Loss not between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andAveragingwinIsNull() {
            addCriterion("AveragingWin is null");
            return (Criteria) this;
        }

        public Criteria andAveragingwinIsNotNull() {
            addCriterion("AveragingWin is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingwinEqualTo(Float value) {
            addCriterion("AveragingWin =", value, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinNotEqualTo(Float value) {
            addCriterion("AveragingWin <>", value, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinGreaterThan(Float value) {
            addCriterion("AveragingWin >", value, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingWin >=", value, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinLessThan(Float value) {
            addCriterion("AveragingWin <", value, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinLessThanOrEqualTo(Float value) {
            addCriterion("AveragingWin <=", value, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinIn(List<Float> values) {
            addCriterion("AveragingWin in", values, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinNotIn(List<Float> values) {
            addCriterion("AveragingWin not in", values, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinBetween(Float value1, Float value2) {
            addCriterion("AveragingWin between", value1, value2, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAveragingwinNotBetween(Float value1, Float value2) {
            addCriterion("AveragingWin not between", value1, value2, "averagingwin");
            return (Criteria) this;
        }

        public Criteria andAkillIsNull() {
            addCriterion("aKill is null");
            return (Criteria) this;
        }

        public Criteria andAkillIsNotNull() {
            addCriterion("aKill is not null");
            return (Criteria) this;
        }

        public Criteria andAkillEqualTo(Integer value) {
            addCriterion("aKill =", value, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillNotEqualTo(Integer value) {
            addCriterion("aKill <>", value, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillGreaterThan(Integer value) {
            addCriterion("aKill >", value, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillGreaterThanOrEqualTo(Integer value) {
            addCriterion("aKill >=", value, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillLessThan(Integer value) {
            addCriterion("aKill <", value, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillLessThanOrEqualTo(Integer value) {
            addCriterion("aKill <=", value, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillIn(List<Integer> values) {
            addCriterion("aKill in", values, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillNotIn(List<Integer> values) {
            addCriterion("aKill not in", values, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillBetween(Integer value1, Integer value2) {
            addCriterion("aKill between", value1, value2, "akill");
            return (Criteria) this;
        }

        public Criteria andAkillNotBetween(Integer value1, Integer value2) {
            addCriterion("aKill not between", value1, value2, "akill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillIsNull() {
            addCriterion("AveragingKill is null");
            return (Criteria) this;
        }

        public Criteria andAveragingkillIsNotNull() {
            addCriterion("AveragingKill is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingkillEqualTo(Float value) {
            addCriterion("AveragingKill =", value, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillNotEqualTo(Float value) {
            addCriterion("AveragingKill <>", value, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillGreaterThan(Float value) {
            addCriterion("AveragingKill >", value, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingKill >=", value, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillLessThan(Float value) {
            addCriterion("AveragingKill <", value, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillLessThanOrEqualTo(Float value) {
            addCriterion("AveragingKill <=", value, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillIn(List<Float> values) {
            addCriterion("AveragingKill in", values, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillNotIn(List<Float> values) {
            addCriterion("AveragingKill not in", values, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillBetween(Float value1, Float value2) {
            addCriterion("AveragingKill between", value1, value2, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andAveragingkillNotBetween(Float value1, Float value2) {
            addCriterion("AveragingKill not between", value1, value2, "averagingkill");
            return (Criteria) this;
        }

        public Criteria andDeathIsNull() {
            addCriterion("Death is null");
            return (Criteria) this;
        }

        public Criteria andDeathIsNotNull() {
            addCriterion("Death is not null");
            return (Criteria) this;
        }

        public Criteria andDeathEqualTo(Integer value) {
            addCriterion("Death =", value, "death");
            return (Criteria) this;
        }

        public Criteria andDeathNotEqualTo(Integer value) {
            addCriterion("Death <>", value, "death");
            return (Criteria) this;
        }

        public Criteria andDeathGreaterThan(Integer value) {
            addCriterion("Death >", value, "death");
            return (Criteria) this;
        }

        public Criteria andDeathGreaterThanOrEqualTo(Integer value) {
            addCriterion("Death >=", value, "death");
            return (Criteria) this;
        }

        public Criteria andDeathLessThan(Integer value) {
            addCriterion("Death <", value, "death");
            return (Criteria) this;
        }

        public Criteria andDeathLessThanOrEqualTo(Integer value) {
            addCriterion("Death <=", value, "death");
            return (Criteria) this;
        }

        public Criteria andDeathIn(List<Integer> values) {
            addCriterion("Death in", values, "death");
            return (Criteria) this;
        }

        public Criteria andDeathNotIn(List<Integer> values) {
            addCriterion("Death not in", values, "death");
            return (Criteria) this;
        }

        public Criteria andDeathBetween(Integer value1, Integer value2) {
            addCriterion("Death between", value1, value2, "death");
            return (Criteria) this;
        }

        public Criteria andDeathNotBetween(Integer value1, Integer value2) {
            addCriterion("Death not between", value1, value2, "death");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathIsNull() {
            addCriterion("AveragingDeath is null");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathIsNotNull() {
            addCriterion("AveragingDeath is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathEqualTo(Float value) {
            addCriterion("AveragingDeath =", value, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathNotEqualTo(Float value) {
            addCriterion("AveragingDeath <>", value, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathGreaterThan(Float value) {
            addCriterion("AveragingDeath >", value, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingDeath >=", value, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathLessThan(Float value) {
            addCriterion("AveragingDeath <", value, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathLessThanOrEqualTo(Float value) {
            addCriterion("AveragingDeath <=", value, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathIn(List<Float> values) {
            addCriterion("AveragingDeath in", values, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathNotIn(List<Float> values) {
            addCriterion("AveragingDeath not in", values, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathBetween(Float value1, Float value2) {
            addCriterion("AveragingDeath between", value1, value2, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingdeathNotBetween(Float value1, Float value2) {
            addCriterion("AveragingDeath not between", value1, value2, "averagingdeath");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedIsNull() {
            addCriterion("AveragingWardPlaced is null");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedIsNotNull() {
            addCriterion("AveragingWardPlaced is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedEqualTo(Integer value) {
            addCriterion("AveragingWardPlaced =", value, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedNotEqualTo(Integer value) {
            addCriterion("AveragingWardPlaced <>", value, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedGreaterThan(Integer value) {
            addCriterion("AveragingWardPlaced >", value, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedGreaterThanOrEqualTo(Integer value) {
            addCriterion("AveragingWardPlaced >=", value, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedLessThan(Integer value) {
            addCriterion("AveragingWardPlaced <", value, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedLessThanOrEqualTo(Integer value) {
            addCriterion("AveragingWardPlaced <=", value, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedIn(List<Integer> values) {
            addCriterion("AveragingWardPlaced in", values, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedNotIn(List<Integer> values) {
            addCriterion("AveragingWardPlaced not in", values, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedBetween(Integer value1, Integer value2) {
            addCriterion("AveragingWardPlaced between", value1, value2, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardplacedNotBetween(Integer value1, Integer value2) {
            addCriterion("AveragingWardPlaced not between", value1, value2, "averagingwardplaced");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledIsNull() {
            addCriterion("AveragingWardKilled is null");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledIsNotNull() {
            addCriterion("AveragingWardKilled is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledEqualTo(Integer value) {
            addCriterion("AveragingWardKilled =", value, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledNotEqualTo(Integer value) {
            addCriterion("AveragingWardKilled <>", value, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledGreaterThan(Integer value) {
            addCriterion("AveragingWardKilled >", value, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledGreaterThanOrEqualTo(Integer value) {
            addCriterion("AveragingWardKilled >=", value, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledLessThan(Integer value) {
            addCriterion("AveragingWardKilled <", value, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledLessThanOrEqualTo(Integer value) {
            addCriterion("AveragingWardKilled <=", value, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledIn(List<Integer> values) {
            addCriterion("AveragingWardKilled in", values, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledNotIn(List<Integer> values) {
            addCriterion("AveragingWardKilled not in", values, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledBetween(Integer value1, Integer value2) {
            addCriterion("AveragingWardKilled between", value1, value2, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveragingwardkilledNotBetween(Integer value1, Integer value2) {
            addCriterion("AveragingWardKilled not between", value1, value2, "averagingwardkilled");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldIsNull() {
            addCriterion("AveragingGold is null");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldIsNotNull() {
            addCriterion("AveragingGold is not null");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldEqualTo(Float value) {
            addCriterion("AveragingGold =", value, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldNotEqualTo(Float value) {
            addCriterion("AveragingGold <>", value, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldGreaterThan(Float value) {
            addCriterion("AveragingGold >", value, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingGold >=", value, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldLessThan(Float value) {
            addCriterion("AveragingGold <", value, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldLessThanOrEqualTo(Float value) {
            addCriterion("AveragingGold <=", value, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldIn(List<Float> values) {
            addCriterion("AveragingGold in", values, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldNotIn(List<Float> values) {
            addCriterion("AveragingGold not in", values, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldBetween(Float value1, Float value2) {
            addCriterion("AveragingGold between", value1, value2, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveraginggoldNotBetween(Float value1, Float value2) {
            addCriterion("AveragingGold not between", value1, value2, "averaginggold");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonIsNull() {
            addCriterion("AveragingSmallDragon is null");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonIsNotNull() {
            addCriterion("AveragingSmallDragon is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonEqualTo(Float value) {
            addCriterion("AveragingSmallDragon =", value, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonNotEqualTo(Float value) {
            addCriterion("AveragingSmallDragon <>", value, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonGreaterThan(Float value) {
            addCriterion("AveragingSmallDragon >", value, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingSmallDragon >=", value, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonLessThan(Float value) {
            addCriterion("AveragingSmallDragon <", value, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonLessThanOrEqualTo(Float value) {
            addCriterion("AveragingSmallDragon <=", value, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonIn(List<Float> values) {
            addCriterion("AveragingSmallDragon in", values, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonNotIn(List<Float> values) {
            addCriterion("AveragingSmallDragon not in", values, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonBetween(Float value1, Float value2) {
            addCriterion("AveragingSmallDragon between", value1, value2, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingsmalldragonNotBetween(Float value1, Float value2) {
            addCriterion("AveragingSmallDragon not between", value1, value2, "averagingsmalldragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonIsNull() {
            addCriterion("AveragingBigDragon is null");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonIsNotNull() {
            addCriterion("AveragingBigDragon is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonEqualTo(Float value) {
            addCriterion("AveragingBigDragon =", value, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonNotEqualTo(Float value) {
            addCriterion("AveragingBigDragon <>", value, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonGreaterThan(Float value) {
            addCriterion("AveragingBigDragon >", value, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingBigDragon >=", value, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonLessThan(Float value) {
            addCriterion("AveragingBigDragon <", value, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonLessThanOrEqualTo(Float value) {
            addCriterion("AveragingBigDragon <=", value, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonIn(List<Float> values) {
            addCriterion("AveragingBigDragon in", values, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonNotIn(List<Float> values) {
            addCriterion("AveragingBigDragon not in", values, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonBetween(Float value1, Float value2) {
            addCriterion("AveragingBigDragon between", value1, value2, "averagingbigdragon");
            return (Criteria) this;
        }

        public Criteria andAveragingbigdragonNotBetween(Float value1, Float value2) {
            addCriterion("AveragingBigDragon not between", value1, value2, "averagingbigdragon");
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