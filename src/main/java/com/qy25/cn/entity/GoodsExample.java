package com.qy25.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Long value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Long value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Long value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Long value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Long value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Long> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Long> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Long value1, Long value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Long value1, Long value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyIsNull() {
            addCriterion("goods_bazaar_money is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyIsNotNull() {
            addCriterion("goods_bazaar_money is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyEqualTo(Double value) {
            addCriterion("goods_bazaar_money =", value, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyNotEqualTo(Double value) {
            addCriterion("goods_bazaar_money <>", value, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyGreaterThan(Double value) {
            addCriterion("goods_bazaar_money >", value, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_bazaar_money >=", value, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyLessThan(Double value) {
            addCriterion("goods_bazaar_money <", value, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyLessThanOrEqualTo(Double value) {
            addCriterion("goods_bazaar_money <=", value, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyIn(List<Double> values) {
            addCriterion("goods_bazaar_money in", values, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyNotIn(List<Double> values) {
            addCriterion("goods_bazaar_money not in", values, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyBetween(Double value1, Double value2) {
            addCriterion("goods_bazaar_money between", value1, value2, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsBazaarMoneyNotBetween(Double value1, Double value2) {
            addCriterion("goods_bazaar_money not between", value1, value2, "goodsBazaarMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyIsNull() {
            addCriterion("goods_shopping_money is null");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyIsNotNull() {
            addCriterion("goods_shopping_money is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyEqualTo(Double value) {
            addCriterion("goods_shopping_money =", value, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyNotEqualTo(Double value) {
            addCriterion("goods_shopping_money <>", value, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyGreaterThan(Double value) {
            addCriterion("goods_shopping_money >", value, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_shopping_money >=", value, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyLessThan(Double value) {
            addCriterion("goods_shopping_money <", value, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyLessThanOrEqualTo(Double value) {
            addCriterion("goods_shopping_money <=", value, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyIn(List<Double> values) {
            addCriterion("goods_shopping_money in", values, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyNotIn(List<Double> values) {
            addCriterion("goods_shopping_money not in", values, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyBetween(Double value1, Double value2) {
            addCriterion("goods_shopping_money between", value1, value2, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShoppingMoneyNotBetween(Double value1, Double value2) {
            addCriterion("goods_shopping_money not between", value1, value2, "goodsShoppingMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryIsNull() {
            addCriterion("goods_inventory is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryIsNotNull() {
            addCriterion("goods_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryEqualTo(Long value) {
            addCriterion("goods_inventory =", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryNotEqualTo(Long value) {
            addCriterion("goods_inventory <>", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryGreaterThan(Long value) {
            addCriterion("goods_inventory >", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_inventory >=", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryLessThan(Long value) {
            addCriterion("goods_inventory <", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryLessThanOrEqualTo(Long value) {
            addCriterion("goods_inventory <=", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryIn(List<Long> values) {
            addCriterion("goods_inventory in", values, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryNotIn(List<Long> values) {
            addCriterion("goods_inventory not in", values, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryBetween(Long value1, Long value2) {
            addCriterion("goods_inventory between", value1, value2, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryNotBetween(Long value1, Long value2) {
            addCriterion("goods_inventory not between", value1, value2, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Integer value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Integer value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Integer value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Integer value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Integer> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Integer> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Integer value1, Integer value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIsNull() {
            addCriterion("goods_brand is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIsNotNull() {
            addCriterion("goods_brand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandEqualTo(Long value) {
            addCriterion("goods_brand =", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandNotEqualTo(Long value) {
            addCriterion("goods_brand <>", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandGreaterThan(Long value) {
            addCriterion("goods_brand >", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_brand >=", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandLessThan(Long value) {
            addCriterion("goods_brand <", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandLessThanOrEqualTo(Long value) {
            addCriterion("goods_brand <=", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIn(List<Long> values) {
            addCriterion("goods_brand in", values, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandNotIn(List<Long> values) {
            addCriterion("goods_brand not in", values, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandBetween(Long value1, Long value2) {
            addCriterion("goods_brand between", value1, value2, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandNotBetween(Long value1, Long value2) {
            addCriterion("goods_brand not between", value1, value2, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
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