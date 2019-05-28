package com.Ems.Ems.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
@Table(name="question")
public class Question {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@NotBlank(message="Description can't be null")
@Column(name="description")
private String Description;
@Column(name="title")
private String Title;





}
