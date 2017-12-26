package com.qhit.lh.gr3.lpy.bean;

/**
 * user entity. @author MyEclipse Persistence Tools
 */

public class user implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String upwd;
	private emp emp;
	public emp getEmp() {
		return emp;
	}

	public void setEmp(emp emp) {
		this.emp = emp;
	}


	/** default constructor */
	public user() {
	}

	/** full constructor */
	public user(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}