package com.qhit.gr3.lpy.common.dao;

import org.hibernate.Session;

import com.qhit.gr3.lpy.common.utils.HibernateSessionFactory;

public class BaseDao {
	public static Session getSession(){
		
		return HibernateSessionFactory.getSession();
		
	}
}
