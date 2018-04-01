package com.qhit.gr3.lpy.common.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.qhit.gr3.lpy.common.bean.User;
import com.qhit.gr3.lpy.common.dao.BaseDao;

public class UserDaoImpl extends BaseDao implements com.qhit.gr3.lpy.common.dao.UserDao {

	@Override
	public User login(User user) {
		String hql = "select user from User user "
				+ "where user.name =? and "
				+ "user.pwd = ? and "
				+ "user.role = ?";
		Query query =getSession().createQuery(hql);
		query.setString(0, user.getName());
		query.setString(1, user.getPwd());
		query.setInteger(2, user.getRole());
		List<User> list = (List<User>)query.list();
		if(list!=null&&list.size()==1){
			return list.get(0);
		}
		
		return null;
	}

}
