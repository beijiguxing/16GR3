package com.qhit.lh.gr3.lpy.sercive.impl;

import java.util.List;

import com.qhit.lh.gr3.lpy.dao.BaseDao;
import com.qhit.lh.gr3.lpy.dao.impl.BaseDaoimpl;
import com.qhit.lh.gr3.lpy.sercive.BaseSercive;

public class BaseSerciveImpl implements BaseSercive {
		private BaseDao bd =new BaseDaoimpl();
		@Override
		public void add(Object obj) {
			bd.add(obj);
		}
	
		@Override
		public void delete(Object obj) {
			bd.delete(obj);
		}
	
		@Override
		public void update(Object obj) {
			bd.update(obj);
		}
	
		@Override
		public List<Object> getAll(String fromObject) {
			return bd.getAll(fromObject);
		}

		@Override
		public Object getUserById(Object obj,Integer id) {
			return bd.getUserById(obj, id);
		}

	}
