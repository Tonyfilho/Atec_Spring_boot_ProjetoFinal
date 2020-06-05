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

import pt.atec.blog.model.Redes;
import pt.atec.blog.service.RedesService;

@Controller
public class RedesController {
	
	@Autowired
	RedesService redeservice;
	
	
	@RequestMapping(value = "/redes", method = RequestMethod.GET) 
	public ModelAndView getBancoRedes () {
		ModelAndView mv = new ModelAndView("redes"); // minha VIEW redes.HTML
		List<Redes> redes = redeservice.findAllRedes();
		mv.addObject("pagina",redes);		
		return mv;
	}

	@RequestMapping(value = "/redes/{pagina}", method = RequestMethod.GET) 
	public ModelAndView getCursosRedes(@PathVariable("pagina") Long id) {
		ModelAndView mv = new ModelAndView("redesdetails"); // minha VIEW redes.HTML
		Redes redes = redeservice.findById(id);
		mv.addObject("novoredes", redes);		
		return mv;
	}
	

	@RequestMapping(value = "/redespostform", method = RequestMethod.GET) 
	public String redirecionaPagina () {
		
		return  "/redespostform";
	}
	
//	@RequestMapping(value = "/redespostform", method = RequestMethod.POST) 
//	public String saveAllRedes(@Valid Redes redes, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {			
//			return "redirect:/redespostform";
//		}
//		redes.setData(LocalDate.now());
//		redes.setCurso("REDES");
//		redeservice.saveAll(redes);
//		
//		return "redirect:/redes";
//	}
	@RequestMapping(value = "/redespostform", method = RequestMethod.POST) 
	public String saveAllRedes(@Valid Redes rede, BindingResult result, RedirectAttributes attributes){
//		if(result.hasErrors()){
//			 System.out.println("TEVE ERRO");
//			attributes.addFlashAttribute("mensagem", "Os campos são de preenchimento obrigatorio");
//			return "redirect:/redespostform";
//		}
//		 System.out.println("TUDO CERTO");
		rede.setData(LocalDate.now());
		rede.setCurso("Rede");
		redeservice.saveAll(rede);
		return "redirect:/redes";
	}
	
	
	
	
	
	
	
}// fim da class
