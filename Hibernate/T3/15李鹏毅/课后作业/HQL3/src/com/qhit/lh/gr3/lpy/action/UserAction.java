package com.qhit.lh.gr3.lpy.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.lpy.bean.Dept;
import com.qhit.lh.gr3.lpy.bean.Emp;
import com.qhit.lh.gr3.lpy.sercive.BaseSercive;
import com.qhit.lh.gr3.lpy.sercive.impl.BaseSerciveImpl;

/**
 * 
 * @author 李鹏毅 TODO 处理数据 CRUD 2017年12月13日下午7:13:59
 */
public class UserAction extends ActionSupport {
	private BaseSercive baseSercive = new BaseSerciveImpl();
	
	private Dept dept = new Dept();
	private Emp emp = new Emp();
	private List list = new ArrayList();
	private List deptlist = new ArrayList();
	private String object = "from Emp";
	private String objuser = "from Dept";


	/*
	 * 准备添加
	 * 	未理解其作用，发现删去也能达到添加的效果
	 */
	public String toAdd() {
		deptlist = baseSercive.getAll(objuser);
		return "add";
	}

	// add添加方法
	public String add() {
		if (emp != null) {
			try {
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
			dept=(Dept) baseSercive.getUserById(dept, emp.getDid());
			nemp.setDept(dept);
			System.out.println("did:"+emp.getDid());
			
			baseSercive.update(nemp);
		}
		return "tolist";
	}

	// toUpdate查询一个指定id的的方法
	public String toUpdate() {
		emp = (Emp) baseSercive.getUserById(emp, emp.getEid());
		return "update";
	}

	// getAll查询方法
	public String getAll() {
		try {
			list = baseSercive.getAll(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "list";
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
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
