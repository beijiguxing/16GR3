package com.qhit.gr3.lpy.typeManage.dao;

import java.util.List;
import java.util.Map;

import com.qhit.gr3.lpy.typeManage.bean.Course;

public interface CourseDao {
	public List<Course> getCoursesList(Map<String, Object> parameter);
}
