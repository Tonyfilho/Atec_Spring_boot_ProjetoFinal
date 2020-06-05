package pt.atec.blog.service;

import java.util.List;

import pt.atec.blog.model.Automoveis;

public interface AutomoveisService {
	
	List<Automoveis>listAll();
	
	Automoveis listById(Long id);
	
	Automoveis salveAll(Automoveis automoveis);

	Automoveis findByTitulo(String titulo);

}
