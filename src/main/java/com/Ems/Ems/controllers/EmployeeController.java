package com.Ems.Ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Ems.Ems.domains.Employee;
import com.Ems.Ems.services.EmployeeService;


@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired 
	private EmployeeService employeeService;

	

   @RequestMapping(value = "/list", method = RequestMethod.GET)
   public ModelAndView list() {

   ModelAndView model=new ModelAndView("/user/employee_list");
   List<Employee> employeelist= employeeService.getAllemployees();
   model.addObject("employeelist",employeelist);
  
   return model;
   
	}
   @RequestMapping(value = "/addEmployee/", method = RequestMethod.GET)
   public ModelAndView addEmployee() {

    ModelAndView model=new ModelAndView();
    Employee employee=new Employee();
    
    model.addObject("employeeForm",employee);
    model.setViewName("/user/employee_form");
    return model;
   
	}
   @RequestMapping(value = "/updateEmployee/{id}", method = RequestMethod.GET)
   public ModelAndView editEmployee(@PathVariable long id) {

        ModelAndView model=new ModelAndView();
        Employee employee=employeeService.getEmployeeById(id);
        
        model.addObject( "employeeForm",employee);
        model.setViewName("/user/employee_form");
        return model;
       
		}
   @RequestMapping(value ="/saveEmployee/", method = RequestMethod.POST)
   public ModelAndView save(@ModelAttribute("employeeForm") Employee employee) {

        employeeService.saveOrUpdate(employee);
        return new ModelAndView("redirect:/employee/list");
       
		}
   @RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.GET)
   public ModelAndView delete(@PathVariable("id") long id) {

        employeeService.deleteEmployee(id);
        return new ModelAndView("redirect:/employee/list");
       
		}




}

