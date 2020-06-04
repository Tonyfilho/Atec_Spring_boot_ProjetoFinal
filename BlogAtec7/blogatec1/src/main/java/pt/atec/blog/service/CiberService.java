package pt.atec.blog.service;

import java.util.List;

import pt.atec.blog.model.Ciber;

public interface CiberService {
	
	List<Ciber>findAll();
	
	Ciber findById(Long id);
	
	Ciber saveAll(Ciber ciber);
	
	

}
