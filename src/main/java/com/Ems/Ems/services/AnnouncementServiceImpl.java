package com.Ems.Ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Ems.Ems.domains.Announcement;
import com.Ems.Ems.repositories.AnnouncementRepository;

@Service
@Transactional
public class AnnouncementServiceImpl implements AnnouncementService{
	
@Autowired	
AnnouncementRepository announcementRepository;
@Override
public List<Announcement> getAllAnnouncements() {
	
	return (List<Announcement>) announcementRepository.findAll();
}
@Override
public Announcement getAnnouncementById(long id) {
	
	return announcementRepository.findById(id).get();
}

@Override
public void saveOrUpdate(Announcement announcement) {
	announcementRepository.save(announcement);
	
	
}
@Override
public void deleteAnnouncement(long id) {
	announcementRepository.deleteById(id);
}


}
