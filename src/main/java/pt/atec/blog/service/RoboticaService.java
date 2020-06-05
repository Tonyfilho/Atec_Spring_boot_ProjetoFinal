package pt.atec.blog.service;

import java.util.List;

import pt.atec.blog.model.Robotica;

public interface RoboticaService {
	
	List<Robotica>findAll();
	
	Robotica findById(Long id);
	
	Robotica saveAll(Robotica robotica);

}
