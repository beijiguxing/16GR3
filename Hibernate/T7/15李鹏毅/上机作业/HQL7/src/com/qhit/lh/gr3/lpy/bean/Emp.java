package com.qhit.lh.gr3.lpy.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	private String sex;
	private String birthday;
	private Integer dept;
	
	private User user;

	// Constructors

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String ename, String sex, String birthday, Integer dept) {
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.dept = dept;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDept() {
		return this.dept;
	}

	public void setDept(Integer dept) {
		this.dept = dept;
	}

}