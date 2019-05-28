package com.Ems.Ems.services;

import java.util.List;

import com.Ems.Ems.domains.Course;
import com.Ems.Ems.domains.Question;

public interface CourseService {
	 public List<Course> getAllCourses();
	 
	 public Course getCourseById(long id);

	 public void saveOrUpdate(Course course);

	 public void deleteCourse(long id);
}
