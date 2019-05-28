package com.Ems.Ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Ems.Ems.domains.Announcement;
import com.Ems.Ems.domains.Course;
import com.Ems.Ems.services.AnnouncementService;
import com.Ems.Ems.services.CourseService;

@Controller
@RequestMapping(value="/course")
public class CourseController {
	
@Autowired
CourseService courseService;

@RequestMapping(value="/list", method=RequestMethod.GET)
public ModelAndView list() {
	ModelAndView model=new ModelAndView("course_list");
	List<Course> courselist=courseService.getAllCourses();
	model.addObject("courselist", courselist);
	return model;
	
}
@RequestMapping(value="/addCourse/", method=RequestMethod.GET)
public ModelAndView addCourse() {
ModelAndView model=new ModelAndView();
Course course=new Course();


	model.addObject("courseForm", course);
	model.setViewName("course_form");
	return model;
	
}
@RequestMapping(value="/updateCourse/{id}", method=RequestMethod.GET)
public ModelAndView editAnnouncement(@PathVariable long id) {
ModelAndView model=new ModelAndView();
Course course=courseService.getCourseById(id);


	model.addObject("courseForm", course);
	model.setViewName("course_form");
	return model;
	
}
@RequestMapping(value="/saveCourse/", method=RequestMethod.POST)
public ModelAndView save(@ModelAttribute("courseForm") Course course) {
courseService.saveOrUpdate( course);

	return new ModelAndView("redirect:/course/list");
	
}
@RequestMapping(value="/deleteCourse/{id}", method=RequestMethod.POST)
public ModelAndView delete(@PathVariable("id") long id) {
courseService.deleteCourse(id);

	return new ModelAndView("redirect:/course/list");
	
}

}