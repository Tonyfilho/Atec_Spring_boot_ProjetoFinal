package pt.atec.blog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.atec.blog.model.Robotica;
import pt.atec.blog.repository.RoboticaRepository;
import pt.atec.blog.service.RoboticaService;

@Service
public class RoboticaServiceImplement implements RoboticaService  {

	@Autowired
	RoboticaRepository roboticarepository;

	@Override
	public List<Robotica> findAll() {
		
		return roboticarepository.findAll();
	}

	@Override
	public Robotica findById(Long id) {
		
		return roboticarepository.findById(id).get();
	}

	@Override
	public Robotica saveAll(Robotica robotica) {
		
		return roboticarepository.save(robotica);
		
	}
	
	
	
	
}// fim d a class
