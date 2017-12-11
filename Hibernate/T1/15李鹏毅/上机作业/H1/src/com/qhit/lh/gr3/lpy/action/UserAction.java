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
	private String fromObject ="UserBean";
		public String add(){
			if(userbean!=null){
			try {
				baseSercive.add(userbean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			return "tolist";
		}
		
		public String update(){
			if(userbean!=null){
				try {
					baseSercive.update(userbean.getId());;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return "tolist";
		}
		
		public String delete(){
			try {
				baseSercive.delete(userbean.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "tolist";
		}
		public String getAll(){
			try {
				list=baseSercive.getAll(fromObject);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return "list";
		}
		public UserBean getUserbean() {
			return userbean;
		}
		
		public void setUserbean(UserBean userbean) {
			this.userbean = userbean;
		}
		
		public List<UserBean> getList() {
			return list;
		}
		
		public void setList(List<UserBean> list) {
			this.list = list;
		}

}
