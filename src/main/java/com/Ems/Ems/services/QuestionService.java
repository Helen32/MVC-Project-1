package com.Ems.Ems.services;

import java.util.List;

import com.Ems.Ems.domains.Question;

public interface QuestionService {
	 public List<Question> getAllquestions();
	 
	 public Question getQuestionById(long id);

	 public void saveOrUpdate(Question question);

	 public void deleteQuestion(long id);
}
