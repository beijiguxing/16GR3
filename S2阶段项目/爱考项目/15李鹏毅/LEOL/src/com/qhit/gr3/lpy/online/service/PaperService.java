package com.qhit.gr3.lpy.online.service;

import java.util.Map;

import com.qhit.gr3.lpy.common.bean.PageBean;
import com.qhit.gr3.lpy.online.bean.Paper;

public interface PaperService {
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex);
}
