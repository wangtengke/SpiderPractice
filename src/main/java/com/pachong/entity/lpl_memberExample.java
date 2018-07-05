package com.pachong.entity;

import java.util.ArrayList;
import java.util.List;

public class lpl_memberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public lpl_memberExample() {
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

        public Criteria andMemberidIsNull() {
            addCriterion("MemberId is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("MemberId is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("MemberId =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("MemberId <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("MemberId >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MemberId >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("MemberId <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("MemberId <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("MemberId in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("MemberId not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("MemberId between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("MemberId not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNull() {
            addCriterion("MemberName is null");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNotNull() {
            addCriterion("MemberName is not null");
            return (Criteria) this;
        }

        public Criteria andMembernameEqualTo(String value) {
            addCriterion("MemberName =", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotEqualTo(String value) {
            addCriterion("MemberName <>", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThan(String value) {
            addCriterion("MemberName >", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("MemberName >=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThan(String value) {
            addCriterion("MemberName <", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThanOrEqualTo(String value) {
            addCriterion("MemberName <=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLike(String value) {
            addCriterion("MemberName like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotLike(String value) {
            addCriterion("MemberName not like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameIn(List<String> values) {
            addCriterion("MemberName in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotIn(List<String> values) {
            addCriterion("MemberName not in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameBetween(String value1, String value2) {
            addCriterion("MemberName between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotBetween(String value1, String value2) {
            addCriterion("MemberName not between", value1, value2, "membername");
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

        public Criteria andAveraginglastlasthitIsNull() {
            addCriterion("AveragingLastLasthit is null");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitIsNotNull() {
            addCriterion("AveragingLastLasthit is not null");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitEqualTo(Integer value) {
            addCriterion("AveragingLastLasthit =", value, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitNotEqualTo(Integer value) {
            addCriterion("AveragingLastLasthit <>", value, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitGreaterThan(Integer value) {
            addCriterion("AveragingLastLasthit >", value, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitGreaterThanOrEqualTo(Integer value) {
            addCriterion("AveragingLastLasthit >=", value, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitLessThan(Integer value) {
            addCriterion("AveragingLastLasthit <", value, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitLessThanOrEqualTo(Integer value) {
            addCriterion("AveragingLastLasthit <=", value, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitIn(List<Integer> values) {
            addCriterion("AveragingLastLasthit in", values, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitNotIn(List<Integer> values) {
            addCriterion("AveragingLastLasthit not in", values, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitBetween(Integer value1, Integer value2) {
            addCriterion("AveragingLastLasthit between", value1, value2, "averaginglastlasthit");
            return (Criteria) this;
        }

        public Criteria andAveraginglastlasthitNotBetween(Integer value1, Integer value2) {
            addCriterion("AveragingLastLasthit not between", value1, value2, "averaginglastlasthit");
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

        public Criteria andLastlasthitIsNull() {
            addCriterion("LastLasthit is null");
            return (Criteria) this;
        }

        public Criteria andLastlasthitIsNotNull() {
            addCriterion("LastLasthit is not null");
            return (Criteria) this;
        }

        public Criteria andLastlasthitEqualTo(Float value) {
            addCriterion("LastLasthit =", value, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitNotEqualTo(Float value) {
            addCriterion("LastLasthit <>", value, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitGreaterThan(Float value) {
            addCriterion("LastLasthit >", value, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitGreaterThanOrEqualTo(Float value) {
            addCriterion("LastLasthit >=", value, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitLessThan(Float value) {
            addCriterion("LastLasthit <", value, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitLessThanOrEqualTo(Float value) {
            addCriterion("LastLasthit <=", value, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitIn(List<Float> values) {
            addCriterion("LastLasthit in", values, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitNotIn(List<Float> values) {
            addCriterion("LastLasthit not in", values, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitBetween(Float value1, Float value2) {
            addCriterion("LastLasthit between", value1, value2, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andLastlasthitNotBetween(Float value1, Float value2) {
            addCriterion("LastLasthit not between", value1, value2, "lastlasthit");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosIsNull() {
            addCriterion("FavoriteHeros is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosIsNotNull() {
            addCriterion("FavoriteHeros is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosEqualTo(String value) {
            addCriterion("FavoriteHeros =", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosNotEqualTo(String value) {
            addCriterion("FavoriteHeros <>", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosGreaterThan(String value) {
            addCriterion("FavoriteHeros >", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosGreaterThanOrEqualTo(String value) {
            addCriterion("FavoriteHeros >=", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosLessThan(String value) {
            addCriterion("FavoriteHeros <", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosLessThanOrEqualTo(String value) {
            addCriterion("FavoriteHeros <=", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosLike(String value) {
            addCriterion("FavoriteHeros like", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosNotLike(String value) {
            addCriterion("FavoriteHeros not like", value, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosIn(List<String> values) {
            addCriterion("FavoriteHeros in", values, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosNotIn(List<String> values) {
            addCriterion("FavoriteHeros not in", values, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosBetween(String value1, String value2) {
            addCriterion("FavoriteHeros between", value1, value2, "favoriteheros");
            return (Criteria) this;
        }

        public Criteria andFavoriteherosNotBetween(String value1, String value2) {
            addCriterion("FavoriteHeros not between", value1, value2, "favoriteheros");
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