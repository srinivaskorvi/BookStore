package com.bookStore.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public AuthorExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	protected AuthorExample(AuthorExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table author
	 * @ibatorgenerated  Mon May 18 12:51:21 PDT 2015
	 */
	public static class Criteria {
		protected List<String> criteriaWithoutValue;
		protected List<Map<String, Object>> criteriaWithSingleValue;
		protected List<Map<String, Object>> criteriaWithListValue;
		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList<String>();
			criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
			criteriaWithListValue = new ArrayList<Map<String, Object>>();
			criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List<String> getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List<Map<String, Object>> getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List<Map<String, Object>> getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List<Map<String, Object>> getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andAuthoridIsNull() {
			addCriterion("authorid is null");
			return this;
		}

		public Criteria andAuthoridIsNotNull() {
			addCriterion("authorid is not null");
			return this;
		}

		public Criteria andAuthoridEqualTo(String value) {
			addCriterion("authorid =", value, "authorid");
			return this;
		}

		public Criteria andAuthoridNotEqualTo(String value) {
			addCriterion("authorid <>", value, "authorid");
			return this;
		}

		public Criteria andAuthoridGreaterThan(String value) {
			addCriterion("authorid >", value, "authorid");
			return this;
		}

		public Criteria andAuthoridGreaterThanOrEqualTo(String value) {
			addCriterion("authorid >=", value, "authorid");
			return this;
		}

		public Criteria andAuthoridLessThan(String value) {
			addCriterion("authorid <", value, "authorid");
			return this;
		}

		public Criteria andAuthoridLessThanOrEqualTo(String value) {
			addCriterion("authorid <=", value, "authorid");
			return this;
		}

		public Criteria andAuthoridLike(String value) {
			addCriterion("authorid like", value, "authorid");
			return this;
		}

		public Criteria andAuthoridNotLike(String value) {
			addCriterion("authorid not like", value, "authorid");
			return this;
		}

		public Criteria andAuthoridIn(List<String> values) {
			addCriterion("authorid in", values, "authorid");
			return this;
		}

		public Criteria andAuthoridNotIn(List<String> values) {
			addCriterion("authorid not in", values, "authorid");
			return this;
		}

		public Criteria andAuthoridBetween(String value1, String value2) {
			addCriterion("authorid between", value1, value2, "authorid");
			return this;
		}

		public Criteria andAuthoridNotBetween(String value1, String value2) {
			addCriterion("authorid not between", value1, value2, "authorid");
			return this;
		}

		public Criteria andAuthnameIsNull() {
			addCriterion("authname is null");
			return this;
		}

		public Criteria andAuthnameIsNotNull() {
			addCriterion("authname is not null");
			return this;
		}

		public Criteria andAuthnameEqualTo(String value) {
			addCriterion("authname =", value, "authname");
			return this;
		}

		public Criteria andAuthnameNotEqualTo(String value) {
			addCriterion("authname <>", value, "authname");
			return this;
		}

		public Criteria andAuthnameGreaterThan(String value) {
			addCriterion("authname >", value, "authname");
			return this;
		}

		public Criteria andAuthnameGreaterThanOrEqualTo(String value) {
			addCriterion("authname >=", value, "authname");
			return this;
		}

		public Criteria andAuthnameLessThan(String value) {
			addCriterion("authname <", value, "authname");
			return this;
		}

		public Criteria andAuthnameLessThanOrEqualTo(String value) {
			addCriterion("authname <=", value, "authname");
			return this;
		}

		public Criteria andAuthnameLike(String value) {
			addCriterion("authname like", value, "authname");
			return this;
		}

		public Criteria andAuthnameNotLike(String value) {
			addCriterion("authname not like", value, "authname");
			return this;
		}

		public Criteria andAuthnameIn(List<String> values) {
			addCriterion("authname in", values, "authname");
			return this;
		}

		public Criteria andAuthnameNotIn(List<String> values) {
			addCriterion("authname not in", values, "authname");
			return this;
		}

		public Criteria andAuthnameBetween(String value1, String value2) {
			addCriterion("authname between", value1, value2, "authname");
			return this;
		}

		public Criteria andAuthnameNotBetween(String value1, String value2) {
			addCriterion("authname not between", value1, value2, "authname");
			return this;
		}

		public Criteria andAuthaddressIsNull() {
			addCriterion("authaddress is null");
			return this;
		}

		public Criteria andAuthaddressIsNotNull() {
			addCriterion("authaddress is not null");
			return this;
		}

		public Criteria andAuthaddressEqualTo(String value) {
			addCriterion("authaddress =", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressNotEqualTo(String value) {
			addCriterion("authaddress <>", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressGreaterThan(String value) {
			addCriterion("authaddress >", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressGreaterThanOrEqualTo(String value) {
			addCriterion("authaddress >=", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressLessThan(String value) {
			addCriterion("authaddress <", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressLessThanOrEqualTo(String value) {
			addCriterion("authaddress <=", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressLike(String value) {
			addCriterion("authaddress like", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressNotLike(String value) {
			addCriterion("authaddress not like", value, "authaddress");
			return this;
		}

		public Criteria andAuthaddressIn(List<String> values) {
			addCriterion("authaddress in", values, "authaddress");
			return this;
		}

		public Criteria andAuthaddressNotIn(List<String> values) {
			addCriterion("authaddress not in", values, "authaddress");
			return this;
		}

		public Criteria andAuthaddressBetween(String value1, String value2) {
			addCriterion("authaddress between", value1, value2, "authaddress");
			return this;
		}

		public Criteria andAuthaddressNotBetween(String value1, String value2) {
			addCriterion("authaddress not between", value1, value2,
					"authaddress");
			return this;
		}
	}
}