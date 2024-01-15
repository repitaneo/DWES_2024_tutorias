package com.spring.tutoriasEDU.planes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;






@Controller
public class PlanController {	
	
	
	
	@GetMapping("/plan")
	public ModelAndView tutorias() {

		ModelAndView model = new ModelAndView();
		model.setViewName("planes");
		
		return model;
	}
	

	
	
	
	@GetMapping("/plan/{id}")
	public ModelAndView tutoria(@PathVariable long id) {
		
		return null;
	}	
	
	
	
	
	
	@GetMapping("/plan/add")
	public ModelAndView addPlan() {
				
		return null;
	}	

	

	
	@GetMapping("/plan/edit/{id}")
	public ModelAndView editPlan(@PathVariable long id) {
				
		return null;
	}	
	
	
	
	
	
	@GetMapping("/plan/del/{id}")
	public ModelAndView delPlan(@PathVariable long id) {
				
		return null;
	}	
	
	
	
	
	
	@GetMapping("/plan/tutor/del/{idPlan}")
	public ModelAndView eliminarTutoriaTutor(@PathVariable long idPlan) {
		
		return null;
	}
	
	
	
	
	
	
	
	@PostMapping("/plan/save")
	public ModelAndView formTutoria(@ModelAttribute Plan plan) {
				
		return null;
	}	
	
}
