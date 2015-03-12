package com.meng.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.meng.po.Course;
import com.meng.po.Student;
import com.meng.service.CourseService;
import com.meng.service.impl.CourseServiceImpl;

@Controller
@RequestMapping("/course")
public class CourseAction {
	private Course course;
	@Resource
	private CourseService courseService = new CourseServiceImpl();

	@RequestMapping("/select")
	public void select() {
		List<Course> list = courseService.select();
		for (Course c : list) {
			System.out.println(c.getCname());
			for (Student s : c.getStudent()) {
				System.out.println(s.getSname());
			}
		}
	}

	@RequestMapping("/save")
	public ModelAndView save(Course course,HttpServletRequest request,
			HttpServletResponse response) {
		int i = courseService.sava(course);
		System.out.println(course.getCname()+">>>>>>>>>>>>>"+ i);
		ModelAndView m = new ModelAndView();
		m.setViewName("succes");
		m.getModel().put("cname", course.getCname());
		return m;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


}
