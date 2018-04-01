package com.qhit.gr3.lpy.online.service.impl;

import java.util.Map;

import com.qhit.gr3.lpy.common.bean.PageBean;
import com.qhit.gr3.lpy.online.bean.Paper;
import com.qhit.gr3.lpy.online.dao.PaperDao;
import com.qhit.gr3.lpy.online.dao.impl.PaperDaoImpl;
import com.qhit.gr3.lpy.online.service.PaperService;

public class PaperServiceImpl implements PaperService {
	PaperDao pd = new PaperDaoImpl();
	@Override
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex) {
		// TODO Auto-generated method stub
		return pd.getPaperList(pageBean, parameter, pageIndex);
	}
	
}
