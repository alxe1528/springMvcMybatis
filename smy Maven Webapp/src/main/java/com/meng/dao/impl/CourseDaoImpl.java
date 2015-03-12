package com.meng.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.meng.dao.CourseDao;
import com.meng.po.Course;
import com.meng.util.BaseDaoImpl;

@Repository("courseDao")
public class CourseDaoImpl extends BaseDaoImpl<Course> implements CourseDao{

	public List<Course> select() {
		// TODO Auto-generated method stub
		return this.select("com.meng.po.Course.stuAndCou",null);
	}

	public int save(Course c) {
		// TODO Auto-generated method stub
		return this.save("com.meng.po.Course.courseInsert",c);
	}
	

}
