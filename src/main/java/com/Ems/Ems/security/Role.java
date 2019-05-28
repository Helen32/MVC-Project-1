package com.Ems.Ems.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "role")
public class Role {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="role_id")
	 private int id;
	 
	 @Column(name="role")
	 private String role;
	
	

}
