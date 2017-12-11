package com.qhit.lh.gr3.lpy.sercive.impl;

import java.util.List;

import com.qhit.lh.gr3.lpy.dao.BaseDao;
import com.qhit.lh.gr3.lpy.dao.impl.BaseDaoimpl;
import com.qhit.lh.gr3.lpy.sercive.BaseSercive;

public class BaseSerciveImpl implements BaseSercive {
		private BaseDao baseDao =new BaseDaoimpl();
		@Override
		public void add(Object obj) {
		}
	
		@Override
		public void delete(Object obj) {
		}
	
		@Override
		public void update(Object obj) {
		}
	
		@Override
		public List<Object> getAll(String fromObject) {
			return baseDao.getAll(fromObject);
		}

	}
