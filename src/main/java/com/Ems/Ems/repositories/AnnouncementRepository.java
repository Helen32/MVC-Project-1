package com.Ems.Ems.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Ems.Ems.domains.Announcement;


public interface AnnouncementRepository extends CrudRepository <Announcement, Long> {


}
