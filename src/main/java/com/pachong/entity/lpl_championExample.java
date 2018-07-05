package com.pachong.entity;

import java.util.ArrayList;
import java.util.List;

public class lpl_championExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public lpl_championExample() {
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

        public Criteria andIchampionidIsNull() {
            addCriterion("iChampionId is null");
            return (Criteria) this;
        }

        public Criteria andIchampionidIsNotNull() {
            addCriterion("iChampionId is not null");
            return (Criteria) this;
        }

        public Criteria andIchampionidEqualTo(Integer value) {
            addCriterion("iChampionId =", value, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidNotEqualTo(Integer value) {
            addCriterion("iChampionId <>", value, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidGreaterThan(Integer value) {
            addCriterion("iChampionId >", value, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iChampionId >=", value, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidLessThan(Integer value) {
            addCriterion("iChampionId <", value, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidLessThanOrEqualTo(Integer value) {
            addCriterion("iChampionId <=", value, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidIn(List<Integer> values) {
            addCriterion("iChampionId in", values, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidNotIn(List<Integer> values) {
            addCriterion("iChampionId not in", values, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidBetween(Integer value1, Integer value2) {
            addCriterion("iChampionId between", value1, value2, "ichampionid");
            return (Criteria) this;
        }

        public Criteria andIchampionidNotBetween(Integer value1, Integer value2) {
            addCriterion("iChampionId not between", value1, value2, "ichampionid");
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

        public Criteria andAveragingpickIsNull() {
            addCriterion("AveragingPick is null");
            return (Criteria) this;
        }

        public Criteria andAveragingpickIsNotNull() {
            addCriterion("AveragingPick is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingpickEqualTo(Float value) {
            addCriterion("AveragingPick =", value, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickNotEqualTo(Float value) {
            addCriterion("AveragingPick <>", value, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickGreaterThan(Float value) {
            addCriterion("AveragingPick >", value, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingPick >=", value, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickLessThan(Float value) {
            addCriterion("AveragingPick <", value, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickLessThanOrEqualTo(Float value) {
            addCriterion("AveragingPick <=", value, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickIn(List<Float> values) {
            addCriterion("AveragingPick in", values, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickNotIn(List<Float> values) {
            addCriterion("AveragingPick not in", values, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickBetween(Float value1, Float value2) {
            addCriterion("AveragingPick between", value1, value2, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingpickNotBetween(Float value1, Float value2) {
            addCriterion("AveragingPick not between", value1, value2, "averagingpick");
            return (Criteria) this;
        }

        public Criteria andAveragingbanIsNull() {
            addCriterion("AveragingBan is null");
            return (Criteria) this;
        }

        public Criteria andAveragingbanIsNotNull() {
            addCriterion("AveragingBan is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingbanEqualTo(Float value) {
            addCriterion("AveragingBan =", value, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanNotEqualTo(Float value) {
            addCriterion("AveragingBan <>", value, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanGreaterThan(Float value) {
            addCriterion("AveragingBan >", value, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingBan >=", value, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanLessThan(Float value) {
            addCriterion("AveragingBan <", value, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanLessThanOrEqualTo(Float value) {
            addCriterion("AveragingBan <=", value, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanIn(List<Float> values) {
            addCriterion("AveragingBan in", values, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanNotIn(List<Float> values) {
            addCriterion("AveragingBan not in", values, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanBetween(Float value1, Float value2) {
            addCriterion("AveragingBan between", value1, value2, "averagingban");
            return (Criteria) this;
        }

        public Criteria andAveragingbanNotBetween(Float value1, Float value2) {
            addCriterion("AveragingBan not between", value1, value2, "averagingban");
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

        public Criteria andAssistsIsNull() {
            addCriterion("Assists is null");
            return (Criteria) this;
        }

        public Criteria andAssistsIsNotNull() {
            addCriterion("Assists is not null");
            return (Criteria) this;
        }

        public Criteria andAssistsEqualTo(Integer value) {
            addCriterion("Assists =", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsNotEqualTo(Integer value) {
            addCriterion("Assists <>", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsGreaterThan(Integer value) {
            addCriterion("Assists >", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Assists >=", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsLessThan(Integer value) {
            addCriterion("Assists <", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsLessThanOrEqualTo(Integer value) {
            addCriterion("Assists <=", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsIn(List<Integer> values) {
            addCriterion("Assists in", values, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsNotIn(List<Integer> values) {
            addCriterion("Assists not in", values, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsBetween(Integer value1, Integer value2) {
            addCriterion("Assists between", value1, value2, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsNotBetween(Integer value1, Integer value2) {
            addCriterion("Assists not between", value1, value2, "assists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsIsNull() {
            addCriterion("AveragingAssists is null");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsIsNotNull() {
            addCriterion("AveragingAssists is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsEqualTo(Float value) {
            addCriterion("AveragingAssists =", value, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsNotEqualTo(Float value) {
            addCriterion("AveragingAssists <>", value, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsGreaterThan(Float value) {
            addCriterion("AveragingAssists >", value, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingAssists >=", value, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsLessThan(Float value) {
            addCriterion("AveragingAssists <", value, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsLessThanOrEqualTo(Float value) {
            addCriterion("AveragingAssists <=", value, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsIn(List<Float> values) {
            addCriterion("AveragingAssists in", values, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsNotIn(List<Float> values) {
            addCriterion("AveragingAssists not in", values, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsBetween(Float value1, Float value2) {
            addCriterion("AveragingAssists between", value1, value2, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingassistsNotBetween(Float value1, Float value2) {
            addCriterion("AveragingAssists not between", value1, value2, "averagingassists");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateIsNull() {
            addCriterion("AveragingOfferedRate is null");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateIsNotNull() {
            addCriterion("AveragingOfferedRate is not null");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateEqualTo(Float value) {
            addCriterion("AveragingOfferedRate =", value, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateNotEqualTo(Float value) {
            addCriterion("AveragingOfferedRate <>", value, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateGreaterThan(Float value) {
            addCriterion("AveragingOfferedRate >", value, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateGreaterThanOrEqualTo(Float value) {
            addCriterion("AveragingOfferedRate >=", value, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateLessThan(Float value) {
            addCriterion("AveragingOfferedRate <", value, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateLessThanOrEqualTo(Float value) {
            addCriterion("AveragingOfferedRate <=", value, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateIn(List<Float> values) {
            addCriterion("AveragingOfferedRate in", values, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateNotIn(List<Float> values) {
            addCriterion("AveragingOfferedRate not in", values, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateBetween(Float value1, Float value2) {
            addCriterion("AveragingOfferedRate between", value1, value2, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andAveragingofferedrateNotBetween(Float value1, Float value2) {
            addCriterion("AveragingOfferedRate not between", value1, value2, "averagingofferedrate");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameIsNull() {
            addCriterion("OftenMemberName is null");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameIsNotNull() {
            addCriterion("OftenMemberName is not null");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameEqualTo(String value) {
            addCriterion("OftenMemberName =", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameNotEqualTo(String value) {
            addCriterion("OftenMemberName <>", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameGreaterThan(String value) {
            addCriterion("OftenMemberName >", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameGreaterThanOrEqualTo(String value) {
            addCriterion("OftenMemberName >=", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameLessThan(String value) {
            addCriterion("OftenMemberName <", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameLessThanOrEqualTo(String value) {
            addCriterion("OftenMemberName <=", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameLike(String value) {
            addCriterion("OftenMemberName like", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameNotLike(String value) {
            addCriterion("OftenMemberName not like", value, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameIn(List<String> values) {
            addCriterion("OftenMemberName in", values, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameNotIn(List<String> values) {
            addCriterion("OftenMemberName not in", values, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameBetween(String value1, String value2) {
            addCriterion("OftenMemberName between", value1, value2, "oftenmembername");
            return (Criteria) this;
        }

        public Criteria andOftenmembernameNotBetween(String value1, String value2) {
            addCriterion("OftenMemberName not between", value1, value2, "oftenmembername");
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