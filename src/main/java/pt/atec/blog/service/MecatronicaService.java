package pt.atec.blog.service;

import java.util.List;

import pt.atec.blog.model.Mecatronica;

public interface MecatronicaService {
	
	List<Mecatronica> findAll();
	
	Mecatronica  findById(Long id);
	
	Mecatronica saveAll(Mecatronica mecatronica);
		
	
}// fim da interface