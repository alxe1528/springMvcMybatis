package com.meng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.meng.dao.CourseDao;
import com.meng.dao.impl.CourseDaoImpl;
import com.meng.po.Course;
import com.meng.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Resource
	private CourseDao courseDao = new CourseDaoImpl();

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public List<Course> select() {
		// TODO Auto-generated method stub
		return courseDao.select();
	}

	public int sava(Course c) {
		// TODO Auto-generated method stub
		return courseDao.save(c);
	}

}
