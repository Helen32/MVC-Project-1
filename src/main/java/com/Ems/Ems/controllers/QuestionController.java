package com.Ems.Ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Ems.Ems.domains.Question;
import com.Ems.Ems.services.QuestionService;

@Controller
	@RequestMapping(value="/question")
	public class QuestionController {



		@Autowired 
		private QuestionService questionService;

		

	   @RequestMapping(value = "/list", method = RequestMethod.GET)
       public ModelAndView list() {

       ModelAndView model=new ModelAndView("/user/question_list");
       List<Question> questionlist= questionService.getAllquestions();
       model.addObject("questionlist",questionlist);
      
       return model;
       
		}
	   @RequestMapping(value = "/addQuestion/", method = RequestMethod.GET)
       public ModelAndView addquestion() {

        ModelAndView model=new ModelAndView();
        Question question=new Question();
        
        model.addObject("questionForm",question);
        model.setViewName("/user/question_form");
        return model;
       
		}
	   @RequestMapping(value = "/updateQuestion/{id}", method = RequestMethod.GET)
	   public ModelAndView editQuestion(@PathVariable long id) {

	        ModelAndView model=new ModelAndView();
	        Question question=questionService.getQuestionById(id);
	        
	        model.addObject( "questionForm",question);
	        model.setViewName("/user/question_form");
	        return model;
	       
			}
	   @RequestMapping(value ="/saveQuestion/", method = RequestMethod.POST)
	   public ModelAndView save(@ModelAttribute("questionForm") Question question) {

	        questionService.saveOrUpdate(question);
	        return new ModelAndView("redirect:/question/list");
	       
			}
	   @RequestMapping(value = "/deleteQuestion/{id}", method = RequestMethod.GET)
	   public ModelAndView delete(@PathVariable("id") long id) {

	        questionService.deleteQuestion(id);
	        return new ModelAndView("redirect:/question/list");
	       
			}

	


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

