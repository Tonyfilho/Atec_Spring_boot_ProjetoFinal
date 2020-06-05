package pt.atec.blog.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pt.atec.blog.model.Automoveis;
import pt.atec.blog.service.AutomoveisService;

@Controller
public class AutomoveisController {
	
	@Autowired
	AutomoveisService automoveisservice;
	
//	@RequestMapping(value = "/automoveis", method = RequestMethod.GET)
//	public ModelAndView pegaTitulo(String titulo) {
//		ModelAndView mv = new ModelAndView("automoveis");
//		Automoveis automoveis = automoveisservice.findByTitulo(titulo);
//		mv.addObject("pegatitulo", automoveis);
//		
//		return mv;
//	}
	
	@RequestMapping(value = "/automoveis", method = RequestMethod.GET)
	public ModelAndView listaTodos() {
	ModelAndView mv = new ModelAndView("automoveis");
	List<Automoveis> automoveis = automoveisservice.listAll();
	mv.addObject("pagina", automoveis);	

	ModelAndView mv2 = new ModelAndView("automoveis");
		return mv;
	}	

	@RequestMapping(value = "/automoveis{id}", method = RequestMethod.GET)
	public ModelAndView listaUmPost(Long id) {
	ModelAndView mv = new ModelAndView("automoveisdetails");
	Automoveis  automoveis = automoveisservice.listById(id);
	mv.addObject("novoautomoveis", automoveis);		
		return mv;
	}
	
	@RequestMapping(value = "/automoveispostform", method = RequestMethod.GET)
	public String redireciona() {
		return "automoveispostform";
	}
	
	@RequestMapping(value = "automoveispostform", method = RequestMethod.POST)
	public String saveAll (Automoveis automoveis) {
		automoveis.setCurso("AUTOMOVEIS");
		automoveis.setData(LocalDate.now());
		automoveisservice.salveAll(automoveis);		
		return "redirect:/automoveis";
	}
	
	
}// fim da class
