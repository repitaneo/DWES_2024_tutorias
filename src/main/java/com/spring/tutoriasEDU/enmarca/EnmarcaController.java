package com.spring.tutoriasEDU.enmarca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.tutoriasEDU.actividad.ActividadDao;
import com.spring.tutoriasEDU.planes.Plan;
import com.spring.tutoriasEDU.planes.PlanDao;
import com.spring.tutoriasEDU.tutores.Tutor;

@Controller
public class EnmarcaController {


	
	@Autowired
	EnmarcaDao enmarcaDao;	
	
	
	@Autowired
	PlanDao planDao;	
	
	@Autowired
	ActividadDao actividadDao;	
	
	
	@GetMapping("/enmarca")
	public ModelAndView enmarcas() {
			
		ModelAndView respuesta = new ModelAndView();
		respuesta.addObject("enmarcaciones", enmarcaDao.findAll());
		respuesta.setViewName("enmarca");
		
		return respuesta;
	}
	
	
	@GetMapping("/enmarca/add")
	public ModelAndView enmarcaAdd() {
			
		ModelAndView respuesta = new ModelAndView();
		respuesta.addObject("enmarca", new Enmarca());
		respuesta.addObject("planes", planDao.findAll());
		respuesta.addObject("actividades", actividadDao.findAll());
		
		respuesta.setViewName("formEnmarca");
		
		return respuesta;
	}
	
	
	
	
	
	
	@PostMapping("/enmarca/save")
	public ModelAndView formTutoria(@ModelAttribute Enmarca enmarca) {
	
		
		EnmarcaKey key = new EnmarcaKey();
		key.setActividadId(enmarca.getActividad().getId());
		key.setPlanId(enmarca.getPlan().getId());
		enmarca.setId(key);
		
		enmarcaDao.save(enmarca);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/plan/"+enmarca.getPlan().getId());	
		
		return model;
	}	
	
	
	
	
	@GetMapping("/enmarca/del/{idPlan}/{idActividad}")
	public ModelAndView delPlan(@PathVariable long idPlan, @PathVariable long idActividad) {
				
		
		EnmarcaKey key = new EnmarcaKey();
		key.setActividadId(idActividad);
		key.setPlanId(idPlan);

		enmarcaDao.deleteById(key);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/enmarca");
		
		return model;
	}	
	
	
}
