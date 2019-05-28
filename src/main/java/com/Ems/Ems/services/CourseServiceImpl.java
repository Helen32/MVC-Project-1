package com.Ems.Ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Ems.Ems.domains.Course;
import com.Ems.Ems.repositories.CourseRepository;



@Service
@Transactional
public class CourseServiceImpl implements CourseService{
	
@Autowired	
CourseRepository courseRepository;
@Override
public List<Course>  getAllCourses() {
	
	return (List<Course>) courseRepository.findAll();
}
@Override
public Course getCourseById(long id) {
	
	return courseRepository.findById(id).get();
}

@Override
public void saveOrUpdate(Course course) {
	courseRepository.save(course);
	
	
}
@Override
public void deleteCourse(long id) {
	courseRepository.deleteById(id);
}


}

