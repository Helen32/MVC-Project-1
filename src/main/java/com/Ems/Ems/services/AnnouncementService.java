package com.Ems.Ems.services;

import java.util.List;
import com.Ems.Ems.domains.*;

public interface AnnouncementService {
	 public List<Announcement> getAllAnnouncements();
	 
public Announcement getAnnouncementById(long id);

public void saveOrUpdate(Announcement announcement);

public void deleteAnnouncement(long id);
}
