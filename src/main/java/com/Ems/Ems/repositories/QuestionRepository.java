package com.Ems.Ems.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Ems.Ems.domains.Question;

public interface QuestionRepository  extends CrudRepository<Question, Long>{

}
