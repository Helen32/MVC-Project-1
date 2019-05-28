package com.Ems.Ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.Ems.Ems.domains.Question;

import com.Ems.Ems.repositories.QuestionRepository;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService{
	
@Autowired	
QuestionRepository questionRepository;
@Override
public List<Question> getAllquestions() {
	
	return (List<Question>) questionRepository.findAll();
}
@Override
public Question getQuestionById(long id) {
	
	return questionRepository.findById(id).get();
}

@Override
public void saveOrUpdate(Question question) {
	questionRepository.save(question);
	
	
}
@Override
public void deleteQuestion(long id) {
	questionRepository.deleteById(id);
}


}
