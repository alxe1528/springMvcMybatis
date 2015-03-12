package com.meng.dao;

import java.util.List;

import com.meng.po.Course;

public interface CourseDao {
	public List<Course> select();

	public int save(Course c);
}
