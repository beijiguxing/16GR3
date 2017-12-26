package com.qhit.lh.gr3.lpy.bean;

/**
 * @author 李鹏毅
 *TODO
 *2017年12月26日上午10:44:11
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	private String sex;
	private String birthday;
	private Integer did;
	
	private Dept dept;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer eid, String ename, String sex, String birthday, Integer did, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.did = did;
		this.dept = dept;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}


}