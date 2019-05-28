create database Emss_db;
use Emss_db;
CREATE USER 'rrr'@'localhost' IDENTIFIED BY 'helen';
# Database Grants
GRANT SELECT ON Emss_db.* to 'rrr'@'localhost';
GRANT INSERT ON Emss_db.* to 'rrr'@'localhost';
GRANT UPDATE ON Emss_db.* to 'rrr'@'localhost';
GRANT DELETE ON Emss_db.* to 'rrr'@'localhost';

DROP TABLE IF EXISTS `course`;
CREATE TABLE  `course` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL, 
   `catagory` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE  `user` (
  `id` int(11) NOT NULL auto_increment,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `active` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE  `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY  (`user_id`,`role_id`),
  KEY `user_role_key` (`role_id`),
  CONSTRAINT `user_userrole` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `role_userrole` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `question`;
CREATE TABLE  `question` (
  `id` int(64) NOT NULL auto_increment,
  `description` varchar(64) NOT NULL,
  `question_num` int(64) NOT NULL,
  
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role`;
CREATE TABLE  `role` (
  `role_id` int(11) NOT NULL auto_increment,
  `role` varchar(255) default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
DROP TABLE IF EXISTS `employee`;
CREATE TABLE  `employee` (
  `id` int(11) NOT NULL auto_increment,
  `firstname` varchar(255) default NULL,
 `lastname` varchar(255) default NULL,
 `sex` varchar(255) default NULL,
 `jobtitle` varchar(255) default NULL

  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE  `announcement` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(255)
  ) ENGINE=InnoDB  DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE  `persistent_logins` (
  `username` varchar(64) NOT NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(64) NOT NULL,
  `last_used` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `role` VALUES (1,'ADMIN');