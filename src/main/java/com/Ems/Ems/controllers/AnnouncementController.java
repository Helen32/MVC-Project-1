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
import com.Ems.Ems.services.AnnouncementService;

@Controller
@RequestMapping(value="/announcement")
public class AnnouncementController {
	
@Autowired
AnnouncementService announcementService;

@RequestMapping(value="/list", method=RequestMethod.GET)
public ModelAndView list() {
	ModelAndView model=new ModelAndView("announcement_list");
	List<Announcement> announcementlist=announcementService.getAllAnnouncements();
	model.addObject("announcementlist", announcementlist);
	return model;
	
}
@RequestMapping(value="/addAnnouncement/", method=RequestMethod.GET)
public ModelAndView addAnnouncement() {
ModelAndView model=new ModelAndView();
Announcement announcement=new Announcement();


	model.addObject("announcement Form", announcement);
	model.setViewName("announcement_form");
	return model;
	
}
@RequestMapping(value="/updateAnnouncement/{id}", method=RequestMethod.GET)
public ModelAndView editAnnouncement(@PathVariable long id) {
ModelAndView model=new ModelAndView();
Announcement announcement=announcementService.getAnnouncementById(id);


	model.addObject("announcement Form", announcement);
	model.setViewName("announcement_form");
	return model;
	
}
@RequestMapping(value="/saveAnnouncement/", method=RequestMethod.POST)
public ModelAndView save(@ModelAttribute("announcementForm") Announcement announcement) {
announcementService.saveOrUpdate(announcement);

	return new ModelAndView("redirect:/announcement/list");
	
}
@RequestMapping(value="/deleteAnnouncement/{id}", method=RequestMethod.POST)
public ModelAndView delete(@PathVariable("id") long id) {
announcementService.deleteAnnouncement(id);

	return new ModelAndView("redirect:/announcement/list");
	
}

}