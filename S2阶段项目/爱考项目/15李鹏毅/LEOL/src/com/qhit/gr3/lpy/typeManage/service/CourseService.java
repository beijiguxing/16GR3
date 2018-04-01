package com.qhit.gr3.lpy.typeManage.service;

import java.util.List;
import java.util.Map;

import com.qhit.gr3.lpy.typeManage.bean.Course;

public interface CourseService {
	public List<Course> getCoursesList(Map<String, Object> parameter);
}
