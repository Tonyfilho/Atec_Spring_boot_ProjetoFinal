package pt.atec.blog.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pt.atec.blog.model.CursoAtec;
import pt.atec.blog.model.Robotica;
import pt.atec.blog.service.RoboticaService;

@Controller
public class RoboticaController {
	@Autowired
	RoboticaService roboticaservice;
	
	@RequestMapping(value = "/robotica", method = RequestMethod.GET)
	public ModelAndView getPostRobotica() {		
		ModelAndView mv = new ModelAndView("robotica");
		List<Robotica> robotica = roboticaservice.findAll();
		mv.addObject("pagina", robotica);		
		return mv;
	}
	
	@RequestMapping(value = "/robotica/{pagina}", method = RequestMethod.GET)
	public ModelAndView getCursosRobotica(@PathVariable("pagina") Long id) {		
		ModelAndView mv = new ModelAndView("roboticadetails");
		Robotica robotica = roboticaservice.findById(id);
		mv.addObject("novorobotica", robotica);		
		return mv;
	}
	
	@RequestMapping(value = "/roboticapostform", method = RequestMethod.GET)
	public String redirecionaPagina() {
		
		return "roboticapostform";
	}
	
	@RequestMapping(value = "/roboticapostform", method = RequestMethod.POST)
	public String salvaPost(Robotica robotica, CursoAtec cursoatec) {
		robotica.setCurso("ROBOTICA");
		robotica.setData(LocalDate.now());
//		robotica.setCursoatec(cursoatec);
		roboticaservice.saveAll(robotica);
		
		return "redirect:/robotica";
	}
	
	

}// fim da class
