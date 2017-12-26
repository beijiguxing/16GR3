package com.qhit.lh.gr3.lpy.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.lpy.bean.Role;
import com.qhit.lh.gr3.lpy.bean.User;
import com.qhit.lh.gr3.lpy.sercive.BaseSercive;
import com.qhit.lh.gr3.lpy.sercive.impl.BaseSerciveImpl;
/**
 * 
 * @author 李鹏毅
 *TODO
 *2017年12月20日上午11:47:55
 */
public class UserAction extends ActionSupport {
	private BaseSercive baseSercive = new BaseSerciveImpl();
	
	private Role role;
	private User user;
	private List list = new ArrayList();
	private List deptlist = new ArrayList();
	private String object = "from Role";
	private String objuser = "from User";

	/*
	 * 准备添加
	 */
	public String toAdd() {
		deptlist = baseSercive.getAll(objuser);
		return "add";
	}

	// add添加方法
	public String add() {
		if (role != null) {
			try {
				baseSercive.add(role);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "tolist";
	}

	// deldete 删除方法
	public String delete() {
		try {
			baseSercive.delete(role);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "tolist";
	}

	// update更新方法
	public String update() {
		if (role != null) {
			Role nrole = (Role) baseSercive.getUserById(role, role.getRid());
			nrole.setRname(role.getRname());
			
			user=(User) baseSercive.getUserById(user, role.getRid());
			
			baseSercive.update(nrole);
		}
		return "tolist";
	}

	// toUpdate查询一个指定id的的方法
	public String toUpdate() {
		role = (Role) baseSercive.getUserById(role, role.getRid());
		return "update";
	}

	// getAll查询方法
	public String getAll() {
		try {
			list = baseSercive.getAll(object);
			user.getUname();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "list";
	}


	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public List getUserlist() {
		return deptlist;
	}

	public void setUserlist(List userlist) {
		this.deptlist = userlist;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getObjuser() {
		return objuser;
	}

	public void setObjuser(String objuser) {
		this.objuser = objuser;
	}

}
