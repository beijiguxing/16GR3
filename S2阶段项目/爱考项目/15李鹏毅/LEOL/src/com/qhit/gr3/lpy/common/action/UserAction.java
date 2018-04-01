package com.qhit.gr3.lpy.common.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.gr3.lpy.common.bean.User;
import com.qhit.gr3.lpy.common.service.UserService;
import com.qhit.gr3.lpy.common.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport {
	private User user;
	private UserService Us= new UserServiceImpl();
	private List userlist = new ArrayList();
	public String Login(){
		user =Us.login(user);
		String name=user.getName();
		System.out.println(name);
		if(user!=null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			System.out.println("Successful!");
		return "loginSuccess";
		}else{
			System.out.println("Failful!:登入失败");
			super.addActionError("登入失败！");
			return "loginFail";
		}
	}
		public String logout(){
			ServletActionContext.getRequest().getSession().invalidate();
			return "outSuccess";
		}
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List getUserlist() {
		return userlist;
	}
	public void setUserlist(List userlist) {
		this.userlist = userlist;
	}
}
