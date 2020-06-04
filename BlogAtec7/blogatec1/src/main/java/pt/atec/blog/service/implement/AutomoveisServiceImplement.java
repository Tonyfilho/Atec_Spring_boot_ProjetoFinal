package pt.atec.blog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.atec.blog.model.Automoveis;
import pt.atec.blog.repository.AutomoveisRepository;
import pt.atec.blog.service.AutomoveisService;

@Service
public class AutomoveisServiceImplement implements AutomoveisService {
	@Autowired
	AutomoveisRepository automoveisrepository;

	@Override
	public List<Automoveis> listAll() {
		
		return automoveisrepository.findAll();
	}

	@Override
	public Automoveis listById(Long id) {
		
		return automoveisrepository.findById(id).get();
	}

	@Override
	public Automoveis salveAll(Automoveis automoveis) {
		
		return automoveisrepository.save(automoveis);
	}

	@Override
	public Automoveis findByTitulo(String titulo) {
		// TODO Auto-generated method stub
		return automoveisrepository.findByTitulo(titulo);
	}
	
	
	
	

}// fim da class
