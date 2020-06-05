package pt.atec.blog.controller;


import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pt.atec.blog.model.Ciber;
import pt.atec.blog.model.CursoAtec;
import pt.atec.blog.service.CiberService;

@Controller
public class CiberController {

	@Autowired
	CiberService ciberservice;
	
	
	@RequestMapping(value = "/ciber", method = RequestMethod.GET)
	public ModelAndView GetpostCiber() {
		ModelAndView mv = new ModelAndView("ciber");
		List<Ciber>ciber = ciberservice.findAll();
		mv.addObject("pagina", ciber);		
		return mv;
	}
	
	
	
	@RequestMapping(value = "/ciber/{pagina}", method = RequestMethod.GET)
	public ModelAndView getCursosCiber(@PathVariable("pagina") Long id) {
		ModelAndView mv = new ModelAndView("ciberdetails");
		Ciber ciber = ciberservice.findById(id);
		mv.addObject("novociber", ciber);		
		return mv;
	}
	
	/*metodo para redirecionamento para pagina ciberpostform*/
	@RequestMapping(value = "/ciberpostform", method = RequestMethod.GET)
	public String getPostFormCiber() {
		
		return "ciberpostform";
		
	}
	
	@RequestMapping(value = "/ciberpostform", method = RequestMethod.POST)
	public String saveAllCiber(@Valid Ciber ciber, BindingResult result, RedirectAttributes attributes) {

		ciber.setData(LocalDate.now());
		ciber.setCurso("CIBER");
		ciberservice.saveAll(ciber);		
		return "redirect:/ciber";
	}
	
	
	
	
	
}// fim da class
