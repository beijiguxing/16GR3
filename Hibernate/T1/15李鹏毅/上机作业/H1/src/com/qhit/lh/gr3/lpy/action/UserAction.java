package com.qhit.lh.gr3.lpy.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.lpy.bean.UserBean;
import com.qhit.lh.gr3.lpy.sercive.BaseSercive;
import com.qhit.lh.gr3.lpy.sercive.impl.BaseSerciveImpl;

public class UserAction extends ActionSupport {
	private BaseSercive baseSercive =new BaseSerciveImpl();
	private UserBean userbean = new UserBean();
	private List list = new ArrayList();
	private String object ="from UserBean";
		//add添加方法
		public String add(){
			if(userbean!=null){
			try {
				baseSercive.add(userbean);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			return "tolist";
		}
		
		//deldete 删除方法
		public String delete(){
			try {
				baseSercive.delete(userbean);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "tolist";
		}
		//update更新方法
		public String update(){
			if(userbean!=null){
				try {
					baseSercive.update(userbean);;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return "tolist";
		}
		
		//toUpdate查询一个指定id的userbean的方法
		public String toUpdate(){
			userbean=(UserBean) baseSercive.getUserById(userbean, userbean.getId());
			return "update";
		}
		
		
		//getAll查询方法
		public String getAll(){
			try {
				list=baseSercive.getAll(object);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "list";
		}

		public BaseSercive getBaseSercive() {
			return baseSercive;
		}

		public void setBaseSercive(BaseSercive baseSercive) {
			this.baseSercive = baseSercive;
		}

		public UserBean getUserbean() {
			return userbean;
		}

		public void setUserbean(UserBean userbean) {
			this.userbean = userbean;
		}

		public List getList() {
			return list;
		}

		public void setList(List list) {
			this.list = list;
		}

		public String getObject() {
			return object;
		}

		public void setObject(String object) {
			this.object = object;
		}
	
}
