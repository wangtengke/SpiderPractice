package com.pachong.entity;

import java.util.ArrayList;
import java.util.List;

public class famulei_heross7Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public famulei_heross7Example() {
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

        public Criteria andBlueNameIsNull() {
            addCriterion("blue_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueNameIsNotNull() {
            addCriterion("blue_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueNameEqualTo(String value) {
            addCriterion("blue_name =", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameNotEqualTo(String value) {
            addCriterion("blue_name <>", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameGreaterThan(String value) {
            addCriterion("blue_name >", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_name >=", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameLessThan(String value) {
            addCriterion("blue_name <", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameLessThanOrEqualTo(String value) {
            addCriterion("blue_name <=", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameLike(String value) {
            addCriterion("blue_name like", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameNotLike(String value) {
            addCriterion("blue_name not like", value, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameIn(List<String> values) {
            addCriterion("blue_name in", values, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameNotIn(List<String> values) {
            addCriterion("blue_name not in", values, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameBetween(String value1, String value2) {
            addCriterion("blue_name between", value1, value2, "blueName");
            return (Criteria) this;
        }

        public Criteria andBlueNameNotBetween(String value1, String value2) {
            addCriterion("blue_name not between", value1, value2, "blueName");
            return (Criteria) this;
        }

        public Criteria andRedNameIsNull() {
            addCriterion("red_name is null");
            return (Criteria) this;
        }

        public Criteria andRedNameIsNotNull() {
            addCriterion("red_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedNameEqualTo(String value) {
            addCriterion("red_name =", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotEqualTo(String value) {
            addCriterion("red_name <>", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameGreaterThan(String value) {
            addCriterion("red_name >", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_name >=", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameLessThan(String value) {
            addCriterion("red_name <", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameLessThanOrEqualTo(String value) {
            addCriterion("red_name <=", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameLike(String value) {
            addCriterion("red_name like", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotLike(String value) {
            addCriterion("red_name not like", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameIn(List<String> values) {
            addCriterion("red_name in", values, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotIn(List<String> values) {
            addCriterion("red_name not in", values, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameBetween(String value1, String value2) {
            addCriterion("red_name between", value1, value2, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotBetween(String value1, String value2) {
            addCriterion("red_name not between", value1, value2, "redName");
            return (Criteria) this;
        }

        public Criteria andBlueResultIsNull() {
            addCriterion("blue_result is null");
            return (Criteria) this;
        }

        public Criteria andBlueResultIsNotNull() {
            addCriterion("blue_result is not null");
            return (Criteria) this;
        }

        public Criteria andBlueResultEqualTo(String value) {
            addCriterion("blue_result =", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultNotEqualTo(String value) {
            addCriterion("blue_result <>", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultGreaterThan(String value) {
            addCriterion("blue_result >", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultGreaterThanOrEqualTo(String value) {
            addCriterion("blue_result >=", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultLessThan(String value) {
            addCriterion("blue_result <", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultLessThanOrEqualTo(String value) {
            addCriterion("blue_result <=", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultLike(String value) {
            addCriterion("blue_result like", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultNotLike(String value) {
            addCriterion("blue_result not like", value, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultIn(List<String> values) {
            addCriterion("blue_result in", values, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultNotIn(List<String> values) {
            addCriterion("blue_result not in", values, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultBetween(String value1, String value2) {
            addCriterion("blue_result between", value1, value2, "blueResult");
            return (Criteria) this;
        }

        public Criteria andBlueResultNotBetween(String value1, String value2) {
            addCriterion("blue_result not between", value1, value2, "blueResult");
            return (Criteria) this;
        }

        public Criteria andRedResultIsNull() {
            addCriterion("red_result is null");
            return (Criteria) this;
        }

        public Criteria andRedResultIsNotNull() {
            addCriterion("red_result is not null");
            return (Criteria) this;
        }

        public Criteria andRedResultEqualTo(String value) {
            addCriterion("red_result =", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultNotEqualTo(String value) {
            addCriterion("red_result <>", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultGreaterThan(String value) {
            addCriterion("red_result >", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultGreaterThanOrEqualTo(String value) {
            addCriterion("red_result >=", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultLessThan(String value) {
            addCriterion("red_result <", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultLessThanOrEqualTo(String value) {
            addCriterion("red_result <=", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultLike(String value) {
            addCriterion("red_result like", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultNotLike(String value) {
            addCriterion("red_result not like", value, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultIn(List<String> values) {
            addCriterion("red_result in", values, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultNotIn(List<String> values) {
            addCriterion("red_result not in", values, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultBetween(String value1, String value2) {
            addCriterion("red_result between", value1, value2, "redResult");
            return (Criteria) this;
        }

        public Criteria andRedResultNotBetween(String value1, String value2) {
            addCriterion("red_result not between", value1, value2, "redResult");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameIsNull() {
            addCriterion("blue_hero_a_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameIsNotNull() {
            addCriterion("blue_hero_a_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameEqualTo(String value) {
            addCriterion("blue_hero_a_name =", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameNotEqualTo(String value) {
            addCriterion("blue_hero_a_name <>", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameGreaterThan(String value) {
            addCriterion("blue_hero_a_name >", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_hero_a_name >=", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameLessThan(String value) {
            addCriterion("blue_hero_a_name <", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameLessThanOrEqualTo(String value) {
            addCriterion("blue_hero_a_name <=", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameLike(String value) {
            addCriterion("blue_hero_a_name like", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameNotLike(String value) {
            addCriterion("blue_hero_a_name not like", value, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameIn(List<String> values) {
            addCriterion("blue_hero_a_name in", values, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameNotIn(List<String> values) {
            addCriterion("blue_hero_a_name not in", values, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameBetween(String value1, String value2) {
            addCriterion("blue_hero_a_name between", value1, value2, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroANameNotBetween(String value1, String value2) {
            addCriterion("blue_hero_a_name not between", value1, value2, "blueHeroAName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameIsNull() {
            addCriterion("blue_hero_b_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameIsNotNull() {
            addCriterion("blue_hero_b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameEqualTo(String value) {
            addCriterion("blue_hero_b_name =", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameNotEqualTo(String value) {
            addCriterion("blue_hero_b_name <>", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameGreaterThan(String value) {
            addCriterion("blue_hero_b_name >", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_hero_b_name >=", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameLessThan(String value) {
            addCriterion("blue_hero_b_name <", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameLessThanOrEqualTo(String value) {
            addCriterion("blue_hero_b_name <=", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameLike(String value) {
            addCriterion("blue_hero_b_name like", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameNotLike(String value) {
            addCriterion("blue_hero_b_name not like", value, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameIn(List<String> values) {
            addCriterion("blue_hero_b_name in", values, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameNotIn(List<String> values) {
            addCriterion("blue_hero_b_name not in", values, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameBetween(String value1, String value2) {
            addCriterion("blue_hero_b_name between", value1, value2, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroBNameNotBetween(String value1, String value2) {
            addCriterion("blue_hero_b_name not between", value1, value2, "blueHeroBName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameIsNull() {
            addCriterion("blue_hero_c_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameIsNotNull() {
            addCriterion("blue_hero_c_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameEqualTo(String value) {
            addCriterion("blue_hero_c_name =", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameNotEqualTo(String value) {
            addCriterion("blue_hero_c_name <>", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameGreaterThan(String value) {
            addCriterion("blue_hero_c_name >", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_hero_c_name >=", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameLessThan(String value) {
            addCriterion("blue_hero_c_name <", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameLessThanOrEqualTo(String value) {
            addCriterion("blue_hero_c_name <=", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameLike(String value) {
            addCriterion("blue_hero_c_name like", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameNotLike(String value) {
            addCriterion("blue_hero_c_name not like", value, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameIn(List<String> values) {
            addCriterion("blue_hero_c_name in", values, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameNotIn(List<String> values) {
            addCriterion("blue_hero_c_name not in", values, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameBetween(String value1, String value2) {
            addCriterion("blue_hero_c_name between", value1, value2, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroCNameNotBetween(String value1, String value2) {
            addCriterion("blue_hero_c_name not between", value1, value2, "blueHeroCName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameIsNull() {
            addCriterion("blue_hero_d_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameIsNotNull() {
            addCriterion("blue_hero_d_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameEqualTo(String value) {
            addCriterion("blue_hero_d_name =", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameNotEqualTo(String value) {
            addCriterion("blue_hero_d_name <>", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameGreaterThan(String value) {
            addCriterion("blue_hero_d_name >", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_hero_d_name >=", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameLessThan(String value) {
            addCriterion("blue_hero_d_name <", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameLessThanOrEqualTo(String value) {
            addCriterion("blue_hero_d_name <=", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameLike(String value) {
            addCriterion("blue_hero_d_name like", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameNotLike(String value) {
            addCriterion("blue_hero_d_name not like", value, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameIn(List<String> values) {
            addCriterion("blue_hero_d_name in", values, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameNotIn(List<String> values) {
            addCriterion("blue_hero_d_name not in", values, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameBetween(String value1, String value2) {
            addCriterion("blue_hero_d_name between", value1, value2, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroDNameNotBetween(String value1, String value2) {
            addCriterion("blue_hero_d_name not between", value1, value2, "blueHeroDName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameIsNull() {
            addCriterion("blue_hero_e_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameIsNotNull() {
            addCriterion("blue_hero_e_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameEqualTo(String value) {
            addCriterion("blue_hero_e_name =", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameNotEqualTo(String value) {
            addCriterion("blue_hero_e_name <>", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameGreaterThan(String value) {
            addCriterion("blue_hero_e_name >", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_hero_e_name >=", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameLessThan(String value) {
            addCriterion("blue_hero_e_name <", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameLessThanOrEqualTo(String value) {
            addCriterion("blue_hero_e_name <=", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameLike(String value) {
            addCriterion("blue_hero_e_name like", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameNotLike(String value) {
            addCriterion("blue_hero_e_name not like", value, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameIn(List<String> values) {
            addCriterion("blue_hero_e_name in", values, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameNotIn(List<String> values) {
            addCriterion("blue_hero_e_name not in", values, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameBetween(String value1, String value2) {
            addCriterion("blue_hero_e_name between", value1, value2, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueHeroENameNotBetween(String value1, String value2) {
            addCriterion("blue_hero_e_name not between", value1, value2, "blueHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameIsNull() {
            addCriterion("red_hero_a_name is null");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameIsNotNull() {
            addCriterion("red_hero_a_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameEqualTo(String value) {
            addCriterion("red_hero_a_name =", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameNotEqualTo(String value) {
            addCriterion("red_hero_a_name <>", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameGreaterThan(String value) {
            addCriterion("red_hero_a_name >", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameGreaterThanOrEqualTo(String value) {
            addCriterion("red_hero_a_name >=", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameLessThan(String value) {
            addCriterion("red_hero_a_name <", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameLessThanOrEqualTo(String value) {
            addCriterion("red_hero_a_name <=", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameLike(String value) {
            addCriterion("red_hero_a_name like", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameNotLike(String value) {
            addCriterion("red_hero_a_name not like", value, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameIn(List<String> values) {
            addCriterion("red_hero_a_name in", values, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameNotIn(List<String> values) {
            addCriterion("red_hero_a_name not in", values, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameBetween(String value1, String value2) {
            addCriterion("red_hero_a_name between", value1, value2, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroANameNotBetween(String value1, String value2) {
            addCriterion("red_hero_a_name not between", value1, value2, "redHeroAName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameIsNull() {
            addCriterion("red_hero_b_name is null");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameIsNotNull() {
            addCriterion("red_hero_b_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameEqualTo(String value) {
            addCriterion("red_hero_b_name =", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameNotEqualTo(String value) {
            addCriterion("red_hero_b_name <>", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameGreaterThan(String value) {
            addCriterion("red_hero_b_name >", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_hero_b_name >=", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameLessThan(String value) {
            addCriterion("red_hero_b_name <", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameLessThanOrEqualTo(String value) {
            addCriterion("red_hero_b_name <=", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameLike(String value) {
            addCriterion("red_hero_b_name like", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameNotLike(String value) {
            addCriterion("red_hero_b_name not like", value, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameIn(List<String> values) {
            addCriterion("red_hero_b_name in", values, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameNotIn(List<String> values) {
            addCriterion("red_hero_b_name not in", values, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameBetween(String value1, String value2) {
            addCriterion("red_hero_b_name between", value1, value2, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroBNameNotBetween(String value1, String value2) {
            addCriterion("red_hero_b_name not between", value1, value2, "redHeroBName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameIsNull() {
            addCriterion("red_hero_c_name is null");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameIsNotNull() {
            addCriterion("red_hero_c_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameEqualTo(String value) {
            addCriterion("red_hero_c_name =", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameNotEqualTo(String value) {
            addCriterion("red_hero_c_name <>", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameGreaterThan(String value) {
            addCriterion("red_hero_c_name >", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_hero_c_name >=", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameLessThan(String value) {
            addCriterion("red_hero_c_name <", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameLessThanOrEqualTo(String value) {
            addCriterion("red_hero_c_name <=", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameLike(String value) {
            addCriterion("red_hero_c_name like", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameNotLike(String value) {
            addCriterion("red_hero_c_name not like", value, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameIn(List<String> values) {
            addCriterion("red_hero_c_name in", values, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameNotIn(List<String> values) {
            addCriterion("red_hero_c_name not in", values, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameBetween(String value1, String value2) {
            addCriterion("red_hero_c_name between", value1, value2, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroCNameNotBetween(String value1, String value2) {
            addCriterion("red_hero_c_name not between", value1, value2, "redHeroCName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameIsNull() {
            addCriterion("red_hero_d_name is null");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameIsNotNull() {
            addCriterion("red_hero_d_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameEqualTo(String value) {
            addCriterion("red_hero_d_name =", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameNotEqualTo(String value) {
            addCriterion("red_hero_d_name <>", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameGreaterThan(String value) {
            addCriterion("red_hero_d_name >", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_hero_d_name >=", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameLessThan(String value) {
            addCriterion("red_hero_d_name <", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameLessThanOrEqualTo(String value) {
            addCriterion("red_hero_d_name <=", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameLike(String value) {
            addCriterion("red_hero_d_name like", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameNotLike(String value) {
            addCriterion("red_hero_d_name not like", value, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameIn(List<String> values) {
            addCriterion("red_hero_d_name in", values, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameNotIn(List<String> values) {
            addCriterion("red_hero_d_name not in", values, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameBetween(String value1, String value2) {
            addCriterion("red_hero_d_name between", value1, value2, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroDNameNotBetween(String value1, String value2) {
            addCriterion("red_hero_d_name not between", value1, value2, "redHeroDName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameIsNull() {
            addCriterion("red_hero_e_name is null");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameIsNotNull() {
            addCriterion("red_hero_e_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameEqualTo(String value) {
            addCriterion("red_hero_e_name =", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameNotEqualTo(String value) {
            addCriterion("red_hero_e_name <>", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameGreaterThan(String value) {
            addCriterion("red_hero_e_name >", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameGreaterThanOrEqualTo(String value) {
            addCriterion("red_hero_e_name >=", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameLessThan(String value) {
            addCriterion("red_hero_e_name <", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameLessThanOrEqualTo(String value) {
            addCriterion("red_hero_e_name <=", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameLike(String value) {
            addCriterion("red_hero_e_name like", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameNotLike(String value) {
            addCriterion("red_hero_e_name not like", value, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameIn(List<String> values) {
            addCriterion("red_hero_e_name in", values, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameNotIn(List<String> values) {
            addCriterion("red_hero_e_name not in", values, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameBetween(String value1, String value2) {
            addCriterion("red_hero_e_name between", value1, value2, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andRedHeroENameNotBetween(String value1, String value2) {
            addCriterion("red_hero_e_name not between", value1, value2, "redHeroEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameIsNull() {
            addCriterion("blue_star_a_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameIsNotNull() {
            addCriterion("blue_star_a_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameEqualTo(String value) {
            addCriterion("blue_star_a_name =", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameNotEqualTo(String value) {
            addCriterion("blue_star_a_name <>", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameGreaterThan(String value) {
            addCriterion("blue_star_a_name >", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_star_a_name >=", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameLessThan(String value) {
            addCriterion("blue_star_a_name <", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameLessThanOrEqualTo(String value) {
            addCriterion("blue_star_a_name <=", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameLike(String value) {
            addCriterion("blue_star_a_name like", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameNotLike(String value) {
            addCriterion("blue_star_a_name not like", value, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameIn(List<String> values) {
            addCriterion("blue_star_a_name in", values, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameNotIn(List<String> values) {
            addCriterion("blue_star_a_name not in", values, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameBetween(String value1, String value2) {
            addCriterion("blue_star_a_name between", value1, value2, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarANameNotBetween(String value1, String value2) {
            addCriterion("blue_star_a_name not between", value1, value2, "blueStarAName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameIsNull() {
            addCriterion("blue_star_b_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameIsNotNull() {
            addCriterion("blue_star_b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameEqualTo(String value) {
            addCriterion("blue_star_b_name =", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameNotEqualTo(String value) {
            addCriterion("blue_star_b_name <>", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameGreaterThan(String value) {
            addCriterion("blue_star_b_name >", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_star_b_name >=", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameLessThan(String value) {
            addCriterion("blue_star_b_name <", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameLessThanOrEqualTo(String value) {
            addCriterion("blue_star_b_name <=", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameLike(String value) {
            addCriterion("blue_star_b_name like", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameNotLike(String value) {
            addCriterion("blue_star_b_name not like", value, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameIn(List<String> values) {
            addCriterion("blue_star_b_name in", values, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameNotIn(List<String> values) {
            addCriterion("blue_star_b_name not in", values, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameBetween(String value1, String value2) {
            addCriterion("blue_star_b_name between", value1, value2, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarBNameNotBetween(String value1, String value2) {
            addCriterion("blue_star_b_name not between", value1, value2, "blueStarBName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameIsNull() {
            addCriterion("blue_star_c_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameIsNotNull() {
            addCriterion("blue_star_c_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameEqualTo(String value) {
            addCriterion("blue_star_c_name =", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameNotEqualTo(String value) {
            addCriterion("blue_star_c_name <>", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameGreaterThan(String value) {
            addCriterion("blue_star_c_name >", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_star_c_name >=", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameLessThan(String value) {
            addCriterion("blue_star_c_name <", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameLessThanOrEqualTo(String value) {
            addCriterion("blue_star_c_name <=", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameLike(String value) {
            addCriterion("blue_star_c_name like", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameNotLike(String value) {
            addCriterion("blue_star_c_name not like", value, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameIn(List<String> values) {
            addCriterion("blue_star_c_name in", values, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameNotIn(List<String> values) {
            addCriterion("blue_star_c_name not in", values, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameBetween(String value1, String value2) {
            addCriterion("blue_star_c_name between", value1, value2, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarCNameNotBetween(String value1, String value2) {
            addCriterion("blue_star_c_name not between", value1, value2, "blueStarCName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameIsNull() {
            addCriterion("blue_star_d_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameIsNotNull() {
            addCriterion("blue_star_d_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameEqualTo(String value) {
            addCriterion("blue_star_d_name =", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameNotEqualTo(String value) {
            addCriterion("blue_star_d_name <>", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameGreaterThan(String value) {
            addCriterion("blue_star_d_name >", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_star_d_name >=", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameLessThan(String value) {
            addCriterion("blue_star_d_name <", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameLessThanOrEqualTo(String value) {
            addCriterion("blue_star_d_name <=", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameLike(String value) {
            addCriterion("blue_star_d_name like", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameNotLike(String value) {
            addCriterion("blue_star_d_name not like", value, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameIn(List<String> values) {
            addCriterion("blue_star_d_name in", values, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameNotIn(List<String> values) {
            addCriterion("blue_star_d_name not in", values, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameBetween(String value1, String value2) {
            addCriterion("blue_star_d_name between", value1, value2, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarDNameNotBetween(String value1, String value2) {
            addCriterion("blue_star_d_name not between", value1, value2, "blueStarDName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameIsNull() {
            addCriterion("blue_star_e_name is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameIsNotNull() {
            addCriterion("blue_star_e_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameEqualTo(String value) {
            addCriterion("blue_star_e_name =", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameNotEqualTo(String value) {
            addCriterion("blue_star_e_name <>", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameGreaterThan(String value) {
            addCriterion("blue_star_e_name >", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameGreaterThanOrEqualTo(String value) {
            addCriterion("blue_star_e_name >=", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameLessThan(String value) {
            addCriterion("blue_star_e_name <", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameLessThanOrEqualTo(String value) {
            addCriterion("blue_star_e_name <=", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameLike(String value) {
            addCriterion("blue_star_e_name like", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameNotLike(String value) {
            addCriterion("blue_star_e_name not like", value, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameIn(List<String> values) {
            addCriterion("blue_star_e_name in", values, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameNotIn(List<String> values) {
            addCriterion("blue_star_e_name not in", values, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameBetween(String value1, String value2) {
            addCriterion("blue_star_e_name between", value1, value2, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarENameNotBetween(String value1, String value2) {
            addCriterion("blue_star_e_name not between", value1, value2, "blueStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameIsNull() {
            addCriterion("red_star_a_name is null");
            return (Criteria) this;
        }

        public Criteria andRedStarANameIsNotNull() {
            addCriterion("red_star_a_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarANameEqualTo(String value) {
            addCriterion("red_star_a_name =", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameNotEqualTo(String value) {
            addCriterion("red_star_a_name <>", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameGreaterThan(String value) {
            addCriterion("red_star_a_name >", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameGreaterThanOrEqualTo(String value) {
            addCriterion("red_star_a_name >=", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameLessThan(String value) {
            addCriterion("red_star_a_name <", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameLessThanOrEqualTo(String value) {
            addCriterion("red_star_a_name <=", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameLike(String value) {
            addCriterion("red_star_a_name like", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameNotLike(String value) {
            addCriterion("red_star_a_name not like", value, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameIn(List<String> values) {
            addCriterion("red_star_a_name in", values, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameNotIn(List<String> values) {
            addCriterion("red_star_a_name not in", values, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameBetween(String value1, String value2) {
            addCriterion("red_star_a_name between", value1, value2, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarANameNotBetween(String value1, String value2) {
            addCriterion("red_star_a_name not between", value1, value2, "redStarAName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameIsNull() {
            addCriterion("red_star_b_name is null");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameIsNotNull() {
            addCriterion("red_star_b_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameEqualTo(String value) {
            addCriterion("red_star_b_name =", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameNotEqualTo(String value) {
            addCriterion("red_star_b_name <>", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameGreaterThan(String value) {
            addCriterion("red_star_b_name >", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_star_b_name >=", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameLessThan(String value) {
            addCriterion("red_star_b_name <", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameLessThanOrEqualTo(String value) {
            addCriterion("red_star_b_name <=", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameLike(String value) {
            addCriterion("red_star_b_name like", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameNotLike(String value) {
            addCriterion("red_star_b_name not like", value, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameIn(List<String> values) {
            addCriterion("red_star_b_name in", values, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameNotIn(List<String> values) {
            addCriterion("red_star_b_name not in", values, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameBetween(String value1, String value2) {
            addCriterion("red_star_b_name between", value1, value2, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarBNameNotBetween(String value1, String value2) {
            addCriterion("red_star_b_name not between", value1, value2, "redStarBName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameIsNull() {
            addCriterion("red_star_c_name is null");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameIsNotNull() {
            addCriterion("red_star_c_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameEqualTo(String value) {
            addCriterion("red_star_c_name =", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameNotEqualTo(String value) {
            addCriterion("red_star_c_name <>", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameGreaterThan(String value) {
            addCriterion("red_star_c_name >", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_star_c_name >=", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameLessThan(String value) {
            addCriterion("red_star_c_name <", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameLessThanOrEqualTo(String value) {
            addCriterion("red_star_c_name <=", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameLike(String value) {
            addCriterion("red_star_c_name like", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameNotLike(String value) {
            addCriterion("red_star_c_name not like", value, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameIn(List<String> values) {
            addCriterion("red_star_c_name in", values, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameNotIn(List<String> values) {
            addCriterion("red_star_c_name not in", values, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameBetween(String value1, String value2) {
            addCriterion("red_star_c_name between", value1, value2, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarCNameNotBetween(String value1, String value2) {
            addCriterion("red_star_c_name not between", value1, value2, "redStarCName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameIsNull() {
            addCriterion("red_star_d_name is null");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameIsNotNull() {
            addCriterion("red_star_d_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameEqualTo(String value) {
            addCriterion("red_star_d_name =", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameNotEqualTo(String value) {
            addCriterion("red_star_d_name <>", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameGreaterThan(String value) {
            addCriterion("red_star_d_name >", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_star_d_name >=", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameLessThan(String value) {
            addCriterion("red_star_d_name <", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameLessThanOrEqualTo(String value) {
            addCriterion("red_star_d_name <=", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameLike(String value) {
            addCriterion("red_star_d_name like", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameNotLike(String value) {
            addCriterion("red_star_d_name not like", value, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameIn(List<String> values) {
            addCriterion("red_star_d_name in", values, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameNotIn(List<String> values) {
            addCriterion("red_star_d_name not in", values, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameBetween(String value1, String value2) {
            addCriterion("red_star_d_name between", value1, value2, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarDNameNotBetween(String value1, String value2) {
            addCriterion("red_star_d_name not between", value1, value2, "redStarDName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameIsNull() {
            addCriterion("red_star_e_name is null");
            return (Criteria) this;
        }

        public Criteria andRedStarENameIsNotNull() {
            addCriterion("red_star_e_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarENameEqualTo(String value) {
            addCriterion("red_star_e_name =", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameNotEqualTo(String value) {
            addCriterion("red_star_e_name <>", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameGreaterThan(String value) {
            addCriterion("red_star_e_name >", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameGreaterThanOrEqualTo(String value) {
            addCriterion("red_star_e_name >=", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameLessThan(String value) {
            addCriterion("red_star_e_name <", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameLessThanOrEqualTo(String value) {
            addCriterion("red_star_e_name <=", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameLike(String value) {
            addCriterion("red_star_e_name like", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameNotLike(String value) {
            addCriterion("red_star_e_name not like", value, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameIn(List<String> values) {
            addCriterion("red_star_e_name in", values, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameNotIn(List<String> values) {
            addCriterion("red_star_e_name not in", values, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameBetween(String value1, String value2) {
            addCriterion("red_star_e_name between", value1, value2, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andRedStarENameNotBetween(String value1, String value2) {
            addCriterion("red_star_e_name not between", value1, value2, "redStarEName");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPIsNull() {
            addCriterion("blue_star_a_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPIsNotNull() {
            addCriterion("blue_star_a_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPEqualTo(Float value) {
            addCriterion("blue_star_a_atk_p =", value, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPNotEqualTo(Float value) {
            addCriterion("blue_star_a_atk_p <>", value, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPGreaterThan(Float value) {
            addCriterion("blue_star_a_atk_p >", value, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_a_atk_p >=", value, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPLessThan(Float value) {
            addCriterion("blue_star_a_atk_p <", value, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_a_atk_p <=", value, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPIn(List<Float> values) {
            addCriterion("blue_star_a_atk_p in", values, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPNotIn(List<Float> values) {
            addCriterion("blue_star_a_atk_p not in", values, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPBetween(Float value1, Float value2) {
            addCriterion("blue_star_a_atk_p between", value1, value2, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarAAtkPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_a_atk_p not between", value1, value2, "blueStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPIsNull() {
            addCriterion("blue_star_b_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPIsNotNull() {
            addCriterion("blue_star_b_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPEqualTo(Float value) {
            addCriterion("blue_star_b_atk_p =", value, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPNotEqualTo(Float value) {
            addCriterion("blue_star_b_atk_p <>", value, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPGreaterThan(Float value) {
            addCriterion("blue_star_b_atk_p >", value, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_b_atk_p >=", value, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPLessThan(Float value) {
            addCriterion("blue_star_b_atk_p <", value, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_b_atk_p <=", value, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPIn(List<Float> values) {
            addCriterion("blue_star_b_atk_p in", values, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPNotIn(List<Float> values) {
            addCriterion("blue_star_b_atk_p not in", values, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPBetween(Float value1, Float value2) {
            addCriterion("blue_star_b_atk_p between", value1, value2, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBAtkPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_b_atk_p not between", value1, value2, "blueStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPIsNull() {
            addCriterion("blue_star_c_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPIsNotNull() {
            addCriterion("blue_star_c_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPEqualTo(Float value) {
            addCriterion("blue_star_c_atk_p =", value, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPNotEqualTo(Float value) {
            addCriterion("blue_star_c_atk_p <>", value, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPGreaterThan(Float value) {
            addCriterion("blue_star_c_atk_p >", value, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_c_atk_p >=", value, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPLessThan(Float value) {
            addCriterion("blue_star_c_atk_p <", value, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_c_atk_p <=", value, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPIn(List<Float> values) {
            addCriterion("blue_star_c_atk_p in", values, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPNotIn(List<Float> values) {
            addCriterion("blue_star_c_atk_p not in", values, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPBetween(Float value1, Float value2) {
            addCriterion("blue_star_c_atk_p between", value1, value2, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCAtkPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_c_atk_p not between", value1, value2, "blueStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPIsNull() {
            addCriterion("blue_star_d_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPIsNotNull() {
            addCriterion("blue_star_d_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPEqualTo(Float value) {
            addCriterion("blue_star_d_atk_p =", value, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPNotEqualTo(Float value) {
            addCriterion("blue_star_d_atk_p <>", value, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPGreaterThan(Float value) {
            addCriterion("blue_star_d_atk_p >", value, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_d_atk_p >=", value, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPLessThan(Float value) {
            addCriterion("blue_star_d_atk_p <", value, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_d_atk_p <=", value, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPIn(List<Float> values) {
            addCriterion("blue_star_d_atk_p in", values, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPNotIn(List<Float> values) {
            addCriterion("blue_star_d_atk_p not in", values, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPBetween(Float value1, Float value2) {
            addCriterion("blue_star_d_atk_p between", value1, value2, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDAtkPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_d_atk_p not between", value1, value2, "blueStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPIsNull() {
            addCriterion("blue_star_e_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPIsNotNull() {
            addCriterion("blue_star_e_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPEqualTo(Float value) {
            addCriterion("blue_star_e_atk_p =", value, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPNotEqualTo(Float value) {
            addCriterion("blue_star_e_atk_p <>", value, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPGreaterThan(Float value) {
            addCriterion("blue_star_e_atk_p >", value, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_e_atk_p >=", value, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPLessThan(Float value) {
            addCriterion("blue_star_e_atk_p <", value, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_e_atk_p <=", value, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPIn(List<Float> values) {
            addCriterion("blue_star_e_atk_p in", values, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPNotIn(List<Float> values) {
            addCriterion("blue_star_e_atk_p not in", values, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPBetween(Float value1, Float value2) {
            addCriterion("blue_star_e_atk_p between", value1, value2, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEAtkPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_e_atk_p not between", value1, value2, "blueStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPIsNull() {
            addCriterion("red_star_a_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPIsNotNull() {
            addCriterion("red_star_a_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPEqualTo(Float value) {
            addCriterion("red_star_a_atk_p =", value, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPNotEqualTo(Float value) {
            addCriterion("red_star_a_atk_p <>", value, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPGreaterThan(Float value) {
            addCriterion("red_star_a_atk_p >", value, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_a_atk_p >=", value, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPLessThan(Float value) {
            addCriterion("red_star_a_atk_p <", value, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_a_atk_p <=", value, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPIn(List<Float> values) {
            addCriterion("red_star_a_atk_p in", values, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPNotIn(List<Float> values) {
            addCriterion("red_star_a_atk_p not in", values, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPBetween(Float value1, Float value2) {
            addCriterion("red_star_a_atk_p between", value1, value2, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarAAtkPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_a_atk_p not between", value1, value2, "redStarAAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPIsNull() {
            addCriterion("red_star_b_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPIsNotNull() {
            addCriterion("red_star_b_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPEqualTo(Float value) {
            addCriterion("red_star_b_atk_p =", value, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPNotEqualTo(Float value) {
            addCriterion("red_star_b_atk_p <>", value, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPGreaterThan(Float value) {
            addCriterion("red_star_b_atk_p >", value, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_b_atk_p >=", value, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPLessThan(Float value) {
            addCriterion("red_star_b_atk_p <", value, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_b_atk_p <=", value, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPIn(List<Float> values) {
            addCriterion("red_star_b_atk_p in", values, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPNotIn(List<Float> values) {
            addCriterion("red_star_b_atk_p not in", values, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPBetween(Float value1, Float value2) {
            addCriterion("red_star_b_atk_p between", value1, value2, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarBAtkPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_b_atk_p not between", value1, value2, "redStarBAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPIsNull() {
            addCriterion("red_star_c_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPIsNotNull() {
            addCriterion("red_star_c_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPEqualTo(Float value) {
            addCriterion("red_star_c_atk_p =", value, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPNotEqualTo(Float value) {
            addCriterion("red_star_c_atk_p <>", value, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPGreaterThan(Float value) {
            addCriterion("red_star_c_atk_p >", value, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_c_atk_p >=", value, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPLessThan(Float value) {
            addCriterion("red_star_c_atk_p <", value, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_c_atk_p <=", value, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPIn(List<Float> values) {
            addCriterion("red_star_c_atk_p in", values, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPNotIn(List<Float> values) {
            addCriterion("red_star_c_atk_p not in", values, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPBetween(Float value1, Float value2) {
            addCriterion("red_star_c_atk_p between", value1, value2, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarCAtkPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_c_atk_p not between", value1, value2, "redStarCAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPIsNull() {
            addCriterion("red_star_d_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPIsNotNull() {
            addCriterion("red_star_d_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPEqualTo(Float value) {
            addCriterion("red_star_d_atk_p =", value, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPNotEqualTo(Float value) {
            addCriterion("red_star_d_atk_p <>", value, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPGreaterThan(Float value) {
            addCriterion("red_star_d_atk_p >", value, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_d_atk_p >=", value, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPLessThan(Float value) {
            addCriterion("red_star_d_atk_p <", value, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_d_atk_p <=", value, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPIn(List<Float> values) {
            addCriterion("red_star_d_atk_p in", values, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPNotIn(List<Float> values) {
            addCriterion("red_star_d_atk_p not in", values, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPBetween(Float value1, Float value2) {
            addCriterion("red_star_d_atk_p between", value1, value2, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarDAtkPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_d_atk_p not between", value1, value2, "redStarDAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPIsNull() {
            addCriterion("red_star_e_atk_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPIsNotNull() {
            addCriterion("red_star_e_atk_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPEqualTo(Float value) {
            addCriterion("red_star_e_atk_p =", value, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPNotEqualTo(Float value) {
            addCriterion("red_star_e_atk_p <>", value, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPGreaterThan(Float value) {
            addCriterion("red_star_e_atk_p >", value, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_e_atk_p >=", value, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPLessThan(Float value) {
            addCriterion("red_star_e_atk_p <", value, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_e_atk_p <=", value, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPIn(List<Float> values) {
            addCriterion("red_star_e_atk_p in", values, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPNotIn(List<Float> values) {
            addCriterion("red_star_e_atk_p not in", values, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPBetween(Float value1, Float value2) {
            addCriterion("red_star_e_atk_p between", value1, value2, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andRedStarEAtkPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_e_atk_p not between", value1, value2, "redStarEAtkP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPIsNull() {
            addCriterion("blue_star_a_def_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPIsNotNull() {
            addCriterion("blue_star_a_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPEqualTo(Float value) {
            addCriterion("blue_star_a_def_p =", value, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPNotEqualTo(Float value) {
            addCriterion("blue_star_a_def_p <>", value, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPGreaterThan(Float value) {
            addCriterion("blue_star_a_def_p >", value, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_a_def_p >=", value, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPLessThan(Float value) {
            addCriterion("blue_star_a_def_p <", value, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_a_def_p <=", value, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPIn(List<Float> values) {
            addCriterion("blue_star_a_def_p in", values, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPNotIn(List<Float> values) {
            addCriterion("blue_star_a_def_p not in", values, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPBetween(Float value1, Float value2) {
            addCriterion("blue_star_a_def_p between", value1, value2, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarADefPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_a_def_p not between", value1, value2, "blueStarADefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPIsNull() {
            addCriterion("blue_star_b_def_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPIsNotNull() {
            addCriterion("blue_star_b_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPEqualTo(Float value) {
            addCriterion("blue_star_b_def_p =", value, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPNotEqualTo(Float value) {
            addCriterion("blue_star_b_def_p <>", value, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPGreaterThan(Float value) {
            addCriterion("blue_star_b_def_p >", value, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_b_def_p >=", value, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPLessThan(Float value) {
            addCriterion("blue_star_b_def_p <", value, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_b_def_p <=", value, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPIn(List<Float> values) {
            addCriterion("blue_star_b_def_p in", values, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPNotIn(List<Float> values) {
            addCriterion("blue_star_b_def_p not in", values, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPBetween(Float value1, Float value2) {
            addCriterion("blue_star_b_def_p between", value1, value2, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarBDefPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_b_def_p not between", value1, value2, "blueStarBDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPIsNull() {
            addCriterion("blue_star_c_def_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPIsNotNull() {
            addCriterion("blue_star_c_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPEqualTo(Float value) {
            addCriterion("blue_star_c_def_p =", value, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPNotEqualTo(Float value) {
            addCriterion("blue_star_c_def_p <>", value, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPGreaterThan(Float value) {
            addCriterion("blue_star_c_def_p >", value, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_c_def_p >=", value, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPLessThan(Float value) {
            addCriterion("blue_star_c_def_p <", value, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_c_def_p <=", value, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPIn(List<Float> values) {
            addCriterion("blue_star_c_def_p in", values, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPNotIn(List<Float> values) {
            addCriterion("blue_star_c_def_p not in", values, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPBetween(Float value1, Float value2) {
            addCriterion("blue_star_c_def_p between", value1, value2, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarCDefPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_c_def_p not between", value1, value2, "blueStarCDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPIsNull() {
            addCriterion("blue_star_d_def_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPIsNotNull() {
            addCriterion("blue_star_d_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPEqualTo(Float value) {
            addCriterion("blue_star_d_def_p =", value, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPNotEqualTo(Float value) {
            addCriterion("blue_star_d_def_p <>", value, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPGreaterThan(Float value) {
            addCriterion("blue_star_d_def_p >", value, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_d_def_p >=", value, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPLessThan(Float value) {
            addCriterion("blue_star_d_def_p <", value, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_d_def_p <=", value, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPIn(List<Float> values) {
            addCriterion("blue_star_d_def_p in", values, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPNotIn(List<Float> values) {
            addCriterion("blue_star_d_def_p not in", values, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPBetween(Float value1, Float value2) {
            addCriterion("blue_star_d_def_p between", value1, value2, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarDDefPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_d_def_p not between", value1, value2, "blueStarDDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPIsNull() {
            addCriterion("blue_star_e_def_p is null");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPIsNotNull() {
            addCriterion("blue_star_e_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPEqualTo(Float value) {
            addCriterion("blue_star_e_def_p =", value, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPNotEqualTo(Float value) {
            addCriterion("blue_star_e_def_p <>", value, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPGreaterThan(Float value) {
            addCriterion("blue_star_e_def_p >", value, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("blue_star_e_def_p >=", value, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPLessThan(Float value) {
            addCriterion("blue_star_e_def_p <", value, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPLessThanOrEqualTo(Float value) {
            addCriterion("blue_star_e_def_p <=", value, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPIn(List<Float> values) {
            addCriterion("blue_star_e_def_p in", values, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPNotIn(List<Float> values) {
            addCriterion("blue_star_e_def_p not in", values, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPBetween(Float value1, Float value2) {
            addCriterion("blue_star_e_def_p between", value1, value2, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andBlueStarEDefPNotBetween(Float value1, Float value2) {
            addCriterion("blue_star_e_def_p not between", value1, value2, "blueStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPIsNull() {
            addCriterion("red_star_a_def_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPIsNotNull() {
            addCriterion("red_star_a_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPEqualTo(Float value) {
            addCriterion("red_star_a_def_p =", value, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPNotEqualTo(Float value) {
            addCriterion("red_star_a_def_p <>", value, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPGreaterThan(Float value) {
            addCriterion("red_star_a_def_p >", value, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_a_def_p >=", value, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPLessThan(Float value) {
            addCriterion("red_star_a_def_p <", value, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_a_def_p <=", value, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPIn(List<Float> values) {
            addCriterion("red_star_a_def_p in", values, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPNotIn(List<Float> values) {
            addCriterion("red_star_a_def_p not in", values, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPBetween(Float value1, Float value2) {
            addCriterion("red_star_a_def_p between", value1, value2, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarADefPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_a_def_p not between", value1, value2, "redStarADefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPIsNull() {
            addCriterion("red_star_b_def_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPIsNotNull() {
            addCriterion("red_star_b_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPEqualTo(Float value) {
            addCriterion("red_star_b_def_p =", value, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPNotEqualTo(Float value) {
            addCriterion("red_star_b_def_p <>", value, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPGreaterThan(Float value) {
            addCriterion("red_star_b_def_p >", value, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_b_def_p >=", value, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPLessThan(Float value) {
            addCriterion("red_star_b_def_p <", value, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_b_def_p <=", value, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPIn(List<Float> values) {
            addCriterion("red_star_b_def_p in", values, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPNotIn(List<Float> values) {
            addCriterion("red_star_b_def_p not in", values, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPBetween(Float value1, Float value2) {
            addCriterion("red_star_b_def_p between", value1, value2, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarBDefPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_b_def_p not between", value1, value2, "redStarBDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPIsNull() {
            addCriterion("red_star_c_def_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPIsNotNull() {
            addCriterion("red_star_c_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPEqualTo(Float value) {
            addCriterion("red_star_c_def_p =", value, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPNotEqualTo(Float value) {
            addCriterion("red_star_c_def_p <>", value, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPGreaterThan(Float value) {
            addCriterion("red_star_c_def_p >", value, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_c_def_p >=", value, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPLessThan(Float value) {
            addCriterion("red_star_c_def_p <", value, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_c_def_p <=", value, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPIn(List<Float> values) {
            addCriterion("red_star_c_def_p in", values, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPNotIn(List<Float> values) {
            addCriterion("red_star_c_def_p not in", values, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPBetween(Float value1, Float value2) {
            addCriterion("red_star_c_def_p between", value1, value2, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarCDefPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_c_def_p not between", value1, value2, "redStarCDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPIsNull() {
            addCriterion("red_star_d_def_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPIsNotNull() {
            addCriterion("red_star_d_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPEqualTo(Float value) {
            addCriterion("red_star_d_def_p =", value, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPNotEqualTo(Float value) {
            addCriterion("red_star_d_def_p <>", value, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPGreaterThan(Float value) {
            addCriterion("red_star_d_def_p >", value, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_d_def_p >=", value, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPLessThan(Float value) {
            addCriterion("red_star_d_def_p <", value, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_d_def_p <=", value, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPIn(List<Float> values) {
            addCriterion("red_star_d_def_p in", values, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPNotIn(List<Float> values) {
            addCriterion("red_star_d_def_p not in", values, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPBetween(Float value1, Float value2) {
            addCriterion("red_star_d_def_p between", value1, value2, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarDDefPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_d_def_p not between", value1, value2, "redStarDDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPIsNull() {
            addCriterion("red_star_e_def_p is null");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPIsNotNull() {
            addCriterion("red_star_e_def_p is not null");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPEqualTo(Float value) {
            addCriterion("red_star_e_def_p =", value, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPNotEqualTo(Float value) {
            addCriterion("red_star_e_def_p <>", value, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPGreaterThan(Float value) {
            addCriterion("red_star_e_def_p >", value, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPGreaterThanOrEqualTo(Float value) {
            addCriterion("red_star_e_def_p >=", value, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPLessThan(Float value) {
            addCriterion("red_star_e_def_p <", value, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPLessThanOrEqualTo(Float value) {
            addCriterion("red_star_e_def_p <=", value, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPIn(List<Float> values) {
            addCriterion("red_star_e_def_p in", values, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPNotIn(List<Float> values) {
            addCriterion("red_star_e_def_p not in", values, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPBetween(Float value1, Float value2) {
            addCriterion("red_star_e_def_p between", value1, value2, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andRedStarEDefPNotBetween(Float value1, Float value2) {
            addCriterion("red_star_e_def_p not between", value1, value2, "redStarEDefP");
            return (Criteria) this;
        }

        public Criteria andGameTimeMIsNull() {
            addCriterion("game_time_m is null");
            return (Criteria) this;
        }

        public Criteria andGameTimeMIsNotNull() {
            addCriterion("game_time_m is not null");
            return (Criteria) this;
        }

        public Criteria andGameTimeMEqualTo(Integer value) {
            addCriterion("game_time_m =", value, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMNotEqualTo(Integer value) {
            addCriterion("game_time_m <>", value, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMGreaterThan(Integer value) {
            addCriterion("game_time_m >", value, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_time_m >=", value, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMLessThan(Integer value) {
            addCriterion("game_time_m <", value, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMLessThanOrEqualTo(Integer value) {
            addCriterion("game_time_m <=", value, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMIn(List<Integer> values) {
            addCriterion("game_time_m in", values, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMNotIn(List<Integer> values) {
            addCriterion("game_time_m not in", values, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMBetween(Integer value1, Integer value2) {
            addCriterion("game_time_m between", value1, value2, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeMNotBetween(Integer value1, Integer value2) {
            addCriterion("game_time_m not between", value1, value2, "gameTimeM");
            return (Criteria) this;
        }

        public Criteria andGameTimeSIsNull() {
            addCriterion("game_time_s is null");
            return (Criteria) this;
        }

        public Criteria andGameTimeSIsNotNull() {
            addCriterion("game_time_s is not null");
            return (Criteria) this;
        }

        public Criteria andGameTimeSEqualTo(Integer value) {
            addCriterion("game_time_s =", value, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSNotEqualTo(Integer value) {
            addCriterion("game_time_s <>", value, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSGreaterThan(Integer value) {
            addCriterion("game_time_s >", value, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_time_s >=", value, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSLessThan(Integer value) {
            addCriterion("game_time_s <", value, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSLessThanOrEqualTo(Integer value) {
            addCriterion("game_time_s <=", value, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSIn(List<Integer> values) {
            addCriterion("game_time_s in", values, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSNotIn(List<Integer> values) {
            addCriterion("game_time_s not in", values, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSBetween(Integer value1, Integer value2) {
            addCriterion("game_time_s between", value1, value2, "gameTimeS");
            return (Criteria) this;
        }

        public Criteria andGameTimeSNotBetween(Integer value1, Integer value2) {
            addCriterion("game_time_s not between", value1, value2, "gameTimeS");
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