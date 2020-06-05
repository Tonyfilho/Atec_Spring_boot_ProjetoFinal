package pt.atec.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String paginaPrincipal() {
		
		return "index";
	}
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String redirecionaCursoAtecController() {
		
		return "redirect:/postatec";
	}

}// fim da class
