package com.qhit.lh.gr3.lpy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.lpy.dao.BaseDao;
import com.qhit.lh.gr3.lpy.utils.HibernateSessionFactory;

public class BaseDaoimpl implements BaseDao {
	@Override
	public void add(Object obj) {
		Session session =HibernateSessionFactory.getSession();//获取session对象
		Transaction ts =session.beginTransaction();//开启事务;
		session.save(obj);//执行;
		ts.commit();//提交事务;
		HibernateSessionFactory.closeSession();//释放资源;
	}

	@Override
	public void delete(Object obj) {
		Session session =HibernateSessionFactory.getSession();//获取session对象
		Transaction ts =session.beginTransaction();//开启事务;
		session.delete(obj);//执行;
		ts.commit();//提交事务;
		HibernateSessionFactory.closeSession();//释放资源;	
		}

	@Override
	public void update(Object obj) {
		Session session =HibernateSessionFactory.getSession();//获取session对象
		Transaction ts =session.beginTransaction();//开启事务;
		session.update(obj);//执行;
		ts.commit();//提交事务;
		HibernateSessionFactory.closeSession();//释放资源;	
		}

	@Override
	public List<Object> getAll(String fromObject) {
		List<Object> list =new ArrayList<Object>();//new 一个List集合;
		Session session =HibernateSessionFactory.getSession();//获取session对象
		Transaction ts =session.beginTransaction();//开启事务;
		//获取查询器对象
		Query query = session.createQuery(fromObject);
		list=query.list();//放入List集合;
		ts.commit();//提交事务;
		HibernateSessionFactory.closeSession();//释放资源;
		return list;
	}



	@Override
	public Object getUserById(Object obj, Integer id) {
		//TODO
		Session session = HibernateSessionFactory.getSession();
		Transaction ts =session.beginTransaction();
		Object s=session.get(obj.getClass(), id);
		HibernateSessionFactory.closeSession();
		return s;
	}
}

	
