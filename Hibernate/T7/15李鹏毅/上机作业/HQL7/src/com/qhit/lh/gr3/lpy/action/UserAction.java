package com.qhit.lh.gr3.lpy.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.lpy.bean.Emp;
import com.qhit.lh.gr3.lpy.bean.User;
import com.qhit.lh.gr3.lpy.sercive.BaseSercive;
import com.qhit.lh.gr3.lpy.sercive.impl.BaseSerciveImpl;


/**
 * 
 * @author 李鹏毅 TODO 处理数据 CRUD 2017年12月13日下午7:13:59
 */
public class UserAction extends ActionSupport {
	private BaseSercive baseSercive = new BaseSerciveImpl();
	
	private User user = new User();
	private Emp emp = new Emp();
	private List list = new ArrayList();
	private List userlist = new ArrayList();
	private String object = "from Emp";
	private String objuser = "from User";

	/*
	 * 准备添加
	 */
	public String toAdd() {
		userlist = baseSercive.getAll(objuser);
		return "add";
	}

	// add添加方法
	public String add() {
		if (emp != null) {
			try {
				emp.setUser(user);
				user.setEmp(emp);
				baseSercive.add(emp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "tolist";
	}

	// deldete 删除方法
	public String delete() {
		try {
			baseSercive.delete(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "tolist";
	}

	// update更新方法
	public String update() {
		if (emp != null) {
			/**
			 * emp对象中是从Update.jsp获取的更改后的新数据对象;
			 * nemp对象中是数据库对应ID为更改的原始数据对象;
			 * 为nemp对象赋值;即调用nemp对象的set方法，并将emp中get获取的值赋予nemp;
			 * 其中user对象，需要先get到user,然后用user的set方法进行赋值;
			 */
			Emp nemp = (Emp) baseSercive.getUserById(emp, emp.getEid());//将未更改的从数据库中得到原始数据保存到nemp;
			nemp.setEname(emp.getEname());//将从emp中获取到的更改后的ename赋值给nemp的ename;下行同理; 
			nemp.setSex(emp.getSex());
			nemp.setBirthday(emp.getBirthday());
			nemp.setDept(emp.getDept());
			nemp.getUser().setUname(user.getUname());//需要先从nemp对象获取已经封装user对象，然后进行赋值.下行同理;
			nemp.getUser().setUpwd(user.getUpwd());
			
			baseSercive.update(nemp);
		}
		return "tolist";
	}

	// toUpdate查询一个指定id的的方法
	public String toUpdate() {
		userlist = baseSercive.getAll(objuser);
		emp = (Emp) baseSercive.getUserById(emp, emp.getEid());
		user = emp.getUser();
		return "update";
	}

	// getAll查询方法
	public String getAll() {
		try {
			String hql="from Emp e where 1=1";
			user.setEmp(emp);
			emp.setUser(user);
			list = baseSercive.getAll(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "list";
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public List getUserlist() {
		return userlist;
	}

	public void setUserlist(List userlist) {
		this.userlist = userlist;
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
