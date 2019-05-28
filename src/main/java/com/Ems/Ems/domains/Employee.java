package com.Ems.Ems.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(name="firstname")
private String firstname;
@Column(name="lastname")
private String lastname;
@Column(name="sex")
private String sex;
@Column(name="jobtitle")
private String jobtitle;

}

