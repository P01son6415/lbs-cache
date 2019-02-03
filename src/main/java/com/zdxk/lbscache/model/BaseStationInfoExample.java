package com.zdxk.lbscache.model;

import java.util.ArrayList;
import java.util.List;

public class BaseStationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseStationInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMccIsNull() {
            addCriterion("mcc is null");
            return (Criteria) this;
        }

        public Criteria andMccIsNotNull() {
            addCriterion("mcc is not null");
            return (Criteria) this;
        }

        public Criteria andMccEqualTo(String value) {
            addCriterion("mcc =", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotEqualTo(String value) {
            addCriterion("mcc <>", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThan(String value) {
            addCriterion("mcc >", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThanOrEqualTo(String value) {
            addCriterion("mcc >=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThan(String value) {
            addCriterion("mcc <", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThanOrEqualTo(String value) {
            addCriterion("mcc <=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLike(String value) {
            addCriterion("mcc like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotLike(String value) {
            addCriterion("mcc not like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccIn(List<String> values) {
            addCriterion("mcc in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotIn(List<String> values) {
            addCriterion("mcc not in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccBetween(String value1, String value2) {
            addCriterion("mcc between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotBetween(String value1, String value2) {
            addCriterion("mcc not between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMncIsNull() {
            addCriterion("mnc is null");
            return (Criteria) this;
        }

        public Criteria andMncIsNotNull() {
            addCriterion("mnc is not null");
            return (Criteria) this;
        }

        public Criteria andMncEqualTo(String value) {
            addCriterion("mnc =", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotEqualTo(String value) {
            addCriterion("mnc <>", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThan(String value) {
            addCriterion("mnc >", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThanOrEqualTo(String value) {
            addCriterion("mnc >=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThan(String value) {
            addCriterion("mnc <", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThanOrEqualTo(String value) {
            addCriterion("mnc <=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLike(String value) {
            addCriterion("mnc like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotLike(String value) {
            addCriterion("mnc not like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncIn(List<String> values) {
            addCriterion("mnc in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotIn(List<String> values) {
            addCriterion("mnc not in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncBetween(String value1, String value2) {
            addCriterion("mnc between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotBetween(String value1, String value2) {
            addCriterion("mnc not between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andLacIsNull() {
            addCriterion("lac is null");
            return (Criteria) this;
        }

        public Criteria andLacIsNotNull() {
            addCriterion("lac is not null");
            return (Criteria) this;
        }

        public Criteria andLacEqualTo(String value) {
            addCriterion("lac =", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotEqualTo(String value) {
            addCriterion("lac <>", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThan(String value) {
            addCriterion("lac >", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThanOrEqualTo(String value) {
            addCriterion("lac >=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThan(String value) {
            addCriterion("lac <", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThanOrEqualTo(String value) {
            addCriterion("lac <=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLike(String value) {
            addCriterion("lac like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotLike(String value) {
            addCriterion("lac not like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacIn(List<String> values) {
            addCriterion("lac in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotIn(List<String> values) {
            addCriterion("lac not in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacBetween(String value1, String value2) {
            addCriterion("lac between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotBetween(String value1, String value2) {
            addCriterion("lac not between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andCiIsNull() {
            addCriterion("ci is null");
            return (Criteria) this;
        }

        public Criteria andCiIsNotNull() {
            addCriterion("ci is not null");
            return (Criteria) this;
        }

        public Criteria andCiEqualTo(String value) {
            addCriterion("ci =", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotEqualTo(String value) {
            addCriterion("ci <>", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThan(String value) {
            addCriterion("ci >", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThanOrEqualTo(String value) {
            addCriterion("ci >=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThan(String value) {
            addCriterion("ci <", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThanOrEqualTo(String value) {
            addCriterion("ci <=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLike(String value) {
            addCriterion("ci like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotLike(String value) {
            addCriterion("ci not like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiIn(List<String> values) {
            addCriterion("ci in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotIn(List<String> values) {
            addCriterion("ci not in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiBetween(String value1, String value2) {
            addCriterion("ci between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotBetween(String value1, String value2) {
            addCriterion("ci not between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("lon like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("lon not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andCoordIsNull() {
            addCriterion("coord is null");
            return (Criteria) this;
        }

        public Criteria andCoordIsNotNull() {
            addCriterion("coord is not null");
            return (Criteria) this;
        }

        public Criteria andCoordEqualTo(String value) {
            addCriterion("coord =", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordNotEqualTo(String value) {
            addCriterion("coord <>", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordGreaterThan(String value) {
            addCriterion("coord >", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordGreaterThanOrEqualTo(String value) {
            addCriterion("coord >=", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordLessThan(String value) {
            addCriterion("coord <", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordLessThanOrEqualTo(String value) {
            addCriterion("coord <=", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordLike(String value) {
            addCriterion("coord like", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordNotLike(String value) {
            addCriterion("coord not like", value, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordIn(List<String> values) {
            addCriterion("coord in", values, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordNotIn(List<String> values) {
            addCriterion("coord not in", values, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordBetween(String value1, String value2) {
            addCriterion("coord between", value1, value2, "coord");
            return (Criteria) this;
        }

        public Criteria andCoordNotBetween(String value1, String value2) {
            addCriterion("coord not between", value1, value2, "coord");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("radius is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("radius is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(String value) {
            addCriterion("radius =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(String value) {
            addCriterion("radius <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(String value) {
            addCriterion("radius >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(String value) {
            addCriterion("radius >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(String value) {
            addCriterion("radius <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(String value) {
            addCriterion("radius <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLike(String value) {
            addCriterion("radius like", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotLike(String value) {
            addCriterion("radius not like", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<String> values) {
            addCriterion("radius in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<String> values) {
            addCriterion("radius not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(String value1, String value2) {
            addCriterion("radius between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(String value1, String value2) {
            addCriterion("radius not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCacheAgeIsNull() {
            addCriterion("cacheAge is null");
            return (Criteria) this;
        }

        public Criteria andCacheAgeIsNotNull() {
            addCriterion("cacheAge is not null");
            return (Criteria) this;
        }

        public Criteria andCacheAgeEqualTo(String value) {
            addCriterion("cacheAge =", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeNotEqualTo(String value) {
            addCriterion("cacheAge <>", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeGreaterThan(String value) {
            addCriterion("cacheAge >", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeGreaterThanOrEqualTo(String value) {
            addCriterion("cacheAge >=", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeLessThan(String value) {
            addCriterion("cacheAge <", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeLessThanOrEqualTo(String value) {
            addCriterion("cacheAge <=", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeLike(String value) {
            addCriterion("cacheAge like", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeNotLike(String value) {
            addCriterion("cacheAge not like", value, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeIn(List<String> values) {
            addCriterion("cacheAge in", values, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeNotIn(List<String> values) {
            addCriterion("cacheAge not in", values, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeBetween(String value1, String value2) {
            addCriterion("cacheAge between", value1, value2, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andCacheAgeNotBetween(String value1, String value2) {
            addCriterion("cacheAge not between", value1, value2, "cacheAge");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNull() {
            addCriterion("reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNotNull() {
            addCriterion("reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved2EqualTo(String value) {
            addCriterion("reserved2 =", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotEqualTo(String value) {
            addCriterion("reserved2 <>", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThan(String value) {
            addCriterion("reserved2 >", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("reserved2 >=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThan(String value) {
            addCriterion("reserved2 <", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThanOrEqualTo(String value) {
            addCriterion("reserved2 <=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Like(String value) {
            addCriterion("reserved2 like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotLike(String value) {
            addCriterion("reserved2 not like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2In(List<String> values) {
            addCriterion("reserved2 in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotIn(List<String> values) {
            addCriterion("reserved2 not in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Between(String value1, String value2) {
            addCriterion("reserved2 between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotBetween(String value1, String value2) {
            addCriterion("reserved2 not between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved3IsNull() {
            addCriterion("reserved3 is null");
            return (Criteria) this;
        }

        public Criteria andReserved3IsNotNull() {
            addCriterion("reserved3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved3EqualTo(String value) {
            addCriterion("reserved3 =", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotEqualTo(String value) {
            addCriterion("reserved3 <>", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3GreaterThan(String value) {
            addCriterion("reserved3 >", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3GreaterThanOrEqualTo(String value) {
            addCriterion("reserved3 >=", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3LessThan(String value) {
            addCriterion("reserved3 <", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3LessThanOrEqualTo(String value) {
            addCriterion("reserved3 <=", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3Like(String value) {
            addCriterion("reserved3 like", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotLike(String value) {
            addCriterion("reserved3 not like", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3In(List<String> values) {
            addCriterion("reserved3 in", values, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotIn(List<String> values) {
            addCriterion("reserved3 not in", values, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3Between(String value1, String value2) {
            addCriterion("reserved3 between", value1, value2, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotBetween(String value1, String value2) {
            addCriterion("reserved3 not between", value1, value2, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved4IsNull() {
            addCriterion("reserved4 is null");
            return (Criteria) this;
        }

        public Criteria andReserved4IsNotNull() {
            addCriterion("reserved4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved4EqualTo(String value) {
            addCriterion("reserved4 =", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotEqualTo(String value) {
            addCriterion("reserved4 <>", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4GreaterThan(String value) {
            addCriterion("reserved4 >", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4GreaterThanOrEqualTo(String value) {
            addCriterion("reserved4 >=", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4LessThan(String value) {
            addCriterion("reserved4 <", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4LessThanOrEqualTo(String value) {
            addCriterion("reserved4 <=", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4Like(String value) {
            addCriterion("reserved4 like", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotLike(String value) {
            addCriterion("reserved4 not like", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4In(List<String> values) {
            addCriterion("reserved4 in", values, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotIn(List<String> values) {
            addCriterion("reserved4 not in", values, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4Between(String value1, String value2) {
            addCriterion("reserved4 between", value1, value2, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotBetween(String value1, String value2) {
            addCriterion("reserved4 not between", value1, value2, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved5IsNull() {
            addCriterion("reserved5 is null");
            return (Criteria) this;
        }

        public Criteria andReserved5IsNotNull() {
            addCriterion("reserved5 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved5EqualTo(String value) {
            addCriterion("reserved5 =", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotEqualTo(String value) {
            addCriterion("reserved5 <>", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5GreaterThan(String value) {
            addCriterion("reserved5 >", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5GreaterThanOrEqualTo(String value) {
            addCriterion("reserved5 >=", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5LessThan(String value) {
            addCriterion("reserved5 <", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5LessThanOrEqualTo(String value) {
            addCriterion("reserved5 <=", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5Like(String value) {
            addCriterion("reserved5 like", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotLike(String value) {
            addCriterion("reserved5 not like", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5In(List<String> values) {
            addCriterion("reserved5 in", values, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotIn(List<String> values) {
            addCriterion("reserved5 not in", values, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5Between(String value1, String value2) {
            addCriterion("reserved5 between", value1, value2, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotBetween(String value1, String value2) {
            addCriterion("reserved5 not between", value1, value2, "reserved5");
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