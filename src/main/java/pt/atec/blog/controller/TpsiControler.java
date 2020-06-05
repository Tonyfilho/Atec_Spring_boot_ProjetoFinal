package pt.atec.blog.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pt.atec.blog.model.Tpsi;
import pt.atec.blog.service.TpsiService;

@Controller
public class TpsiControler {
	
	@Autowired
	TpsiService tpsiservice;
	
	@RequestMapping(value = "/tpsi", method = RequestMethod.GET)
	public ModelAndView getPostTpsi() {
		ModelAndView mv = new ModelAndView("tpsi");
		List<Tpsi>tpsi = tpsiservice.findAll();
		mv.addObject("pagina", tpsi);	
		return mv;			
	}// fim getPost
	

	
	@RequestMapping(value = "/tpsi/{pagina}", method = RequestMethod.GET)
	public ModelAndView getCursosTpsi(@PathVariable("pagina") Long id) {   
    
    	ModelAndView mv = new ModelAndView("tpsidetails");//nome da pagina
		Tpsi tpsi = tpsiservice.findById(id);
		mv.addObject("novotpsi", tpsi);	//nosso MODEL "novos", nossa VIEW tpsi
		return mv;	 	
    
  
	}// fim getPost
	
	
	@RequestMapping(value="/tpsipostform",  method=RequestMethod.POST)
//	BindingResult result, RedirectAttributes erro
	public String savePostTpsi(@Valid Tpsi tpsi ,BindingResult result, RedirectAttributes attributes) {
//			if(result.hasErrors()){
// //           attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
//	            return "redirect:/newtpsi";
//	        }
    		
		tpsi.setData(LocalDate.now()); //setando a data
		tpsi.setCurso("TPSI");
		tpsiservice.save(tpsi);	
		return "redirect:/tpsi";
	}	
	
	/***********************************criaremos um metodo de chamar a pagina do post*/
	@RequestMapping(value = "/tpsipostform", method=RequestMethod.GET)
	public String getPostFormTpsi() {		
			return "tpsipostform";			
		
	}//getPostForm
	

	/***********************************criaremos um metodo de SALVAR a pagina do post*/



}// fim da class
