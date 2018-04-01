package com.qhit.gr3.lpy.common.service.impl;

import com.qhit.gr3.lpy.common.bean.User;
import com.qhit.gr3.lpy.common.dao.UserDao;
import com.qhit.gr3.lpy.common.dao.impl.UserDaoImpl;
import com.qhit.gr3.lpy.common.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao ud = new UserDaoImpl();
	
	public User login(User user){
		return ud.login(user);
	}
}
