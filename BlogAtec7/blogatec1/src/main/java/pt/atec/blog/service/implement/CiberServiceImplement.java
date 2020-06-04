package pt.atec.blog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.atec.blog.model.Ciber;
import pt.atec.blog.repository.CiberRepository;
import pt.atec.blog.service.CiberService;


@Service
public class CiberServiceImplement   implements CiberService {
	
	@Autowired
	CiberRepository ciberrepository;
	

	@Override
	public List<Ciber> findAll() {
		
		return ciberrepository.findAll();
	}

	@Override
	public Ciber findById(Long id) {
	
		return ciberrepository.findById(id).get();
	}

	@Override
	public Ciber saveAll(Ciber ciber) {
		
		return ciberrepository.save(ciber);
	}

}// fimd a class
