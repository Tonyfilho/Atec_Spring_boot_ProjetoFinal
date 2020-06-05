package pt.atec.blog.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import pt.atec.blog.model.CursoAtec;
import pt.atec.blog.model.Tpsi;
import pt.atec.blog.service.CursoAtecService;
import pt.atec.blog.service.TpsiService;

@Controller
public class CursoAtecController {
 int  tipoDeCurso = 0;
	@Autowired
	CursoAtecService cursoAtecService;
	
	
	@RequestMapping(value = "/postatec", method = RequestMethod.GET)
	public ModelAndView getPostAtec() {
		ModelAndView mv = new ModelAndView("postatec");
		List<CursoAtec>postatec = cursoAtecService.findAll();
		mv.addObject("postatec", postatec);	
		return mv;			
	}// fim getPost
	

	
	@RequestMapping(value = "/postatec/{pagina}", method = RequestMethod.GET)
	public ModelAndView getCursos(@PathVariable("pagina") Long id) {
    if(id == 1) {
    	tipoDeCurso = 1;
    	ModelAndView mv = new ModelAndView("tpsicurso");//nome da pagina
		CursoAtec postatec = cursoAtecService.findById(id);
		mv.addObject("novotpsi", postatec);	//nosso MODEL "novos", nossa VIEW postatec
		return mv;	
    	
    }
    if(id == 2) {
    	tipoDeCurso = 2;
    	ModelAndView mv = new ModelAndView("cibercurso");//nome da pagina
		CursoAtec postatec = cursoAtecService.findById(id);
		mv.addObject("novocyber", postatec);	//nosso MODEL "novos", nossa VIEW postatec
		return mv;	
    	
    }
    if(id == 3) {
    	tipoDeCurso = 3;
    	ModelAndView mv = new ModelAndView("redescurso");//nome da pagina
		CursoAtec postatec = cursoAtecService.findById(id);
		mv.addObject("novoredes", postatec);	//nosso MODEL "novos", nossa VIEW postatec
		return mv;	
    	
    }
    if(id == 4) {
    	tipoDeCurso = 4;
    	ModelAndView mv = new ModelAndView("mecatronicacurso");//nome da pagina
		CursoAtec postatec = cursoAtecService.findById(id);
		mv.addObject("novomecatronica", postatec);	//nosso MODEL "novos", nossa VIEW postatec
		return mv;	
    	
    }
    if(id == 5) {
    	tipoDeCurso = 5;
    	ModelAndView mv = new ModelAndView("roboticacurso");//nome da pagina
		CursoAtec postatec = cursoAtecService.findById(id);
		mv.addObject("novorobotica", postatec);	//nosso MODEL "novos", nossa VIEW postatec
		return mv;	
    	
    }
    if(id == 6) {
    	tipoDeCurso = 6;
    	ModelAndView mv = new ModelAndView("automoveiscurso");//nome da pagina
		CursoAtec postatec = cursoAtecService.findById(id);
		mv.addObject("novoautomoveis", postatec);	//nosso MODEL "novos", nossa VIEW postatec
		return mv;	
    	
    }
    tipoDeCurso = 0;
    ModelAndView mv = new ModelAndView("postatec");//nome da pagina
	CursoAtec postatec = cursoAtecService.findById(id);
	mv.addObject("postatec", postatec);	//nosso MODEL "novos", nossa VIEW postatec
	return mv;	
    
	}// fim getPost
	
	/***********************************criaremos um metodo de chamar a pagina do post*/
	@RequestMapping(value = "/newpost", method = RequestMethod.GET)
	public String getPostForm() {
//		if(tipoDeCurso == 1) {
//			return "tpsipostform";
//		}
//		else if (tipoDeCurso == 2) {
//			return "ciberpostform";
//		}
//		else if (tipoDeCurso == 3) {
//			return "redespostform";
//		}
		
		return "postatec";
	}//getPostForm
	
	
	/***********************************criaremos um metodo de SALVAR a pagina do post*/
	@RequestMapping(value = "/newpost", method = RequestMethod.POST)
	public String CriaCurso(@Valid CursoAtec postatec, BindingResult result, RedirectAttributes rede) {
		if(result.hasErrors()) {
			return "redirect:/newpost";			
		}
		
		else if (tipoDeCurso == 1) {
			
			return "redirect:/postatec/1";
			
		}
		
		postatec.setData(LocalDate.now()); //setando a data
		cursoAtecService.save(postatec);
		
		
		return "redirect:/postatec";
	}
	
}// fim da class
