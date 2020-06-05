package pt.atec.blog.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pt.atec.blog.model.Mecatronica;
import pt.atec.blog.service.MecatronicaService;

@Controller
public class MecatronicaController {
	
	@Autowired
	MecatronicaService mecatronicaservice;
	
	
	@RequestMapping(value = "/mecatronica" , method = RequestMethod.GET)
	public ModelAndView getpostMecatronica() {
		List<Mecatronica> mecatronica = mecatronicaservice.findAll();
		ModelAndView mv = new ModelAndView("mecatronica");
		mv.addObject("pagina", mecatronica);		
		return mv;
	}
	
	@RequestMapping(value = "/mecatronica/{pagina}" , method = RequestMethod.GET)
	public ModelAndView getCursosMecatronica(@PathVariable("pagina") Long id) {
		Mecatronica mecatronica = mecatronicaservice.findById(id);
		ModelAndView mv = new ModelAndView("mecatronicadetails");
		mv.addObject("novomecatronica", mecatronica);		
		return mv;
	}
	
	@RequestMapping(value = "/mecatronicapostform", method = RequestMethod.GET)
	public String redirecionaPost() {
		return "mecatronicapostform";
	}
	
	@RequestMapping(value = "/mecatronicapostform", method = RequestMethod.POST)
	public String salvaAllMecatronica(Mecatronica mecatronica) {
		mecatronica.setCurso("MECATRÔNICA");
		mecatronica.setData(LocalDate.now());
		mecatronicaservice.saveAll(mecatronica);
		
		return "redirect:/mecatronica";
	}
	
	

}// fim da class
