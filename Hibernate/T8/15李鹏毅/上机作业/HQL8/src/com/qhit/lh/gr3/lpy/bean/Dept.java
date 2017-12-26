package com.qhit.lh.gr3.lpy.bean;

	/**
	 * @author 李鹏毅
	 *TODO
	 *2017年12月26日上午10:43:37
	 */
public class Dept implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(Integer did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}