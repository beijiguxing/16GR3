package com.qhit.gr3.lpy.typeManage.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.gr3.lpy.typeManage.bean.Course;
import com.qhit.gr3.lpy.typeManage.dao.CourseDao;
import com.qhit.gr3.lpy.typeManage.dao.impl.CourseDaoImpl;
import com.qhit.gr3.lpy.typeManage.service.CourseService;

public class CourseServiceImpl implements CourseService {
	CourseDao cd = new CourseDaoImpl();

	@Override
	public List<Course> getCoursesList(Map<String, Object> parameter) {
		return cd.getCoursesList(parameter);
	}
	
}
