package pt.atec.blog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.atec.blog.model.Mecatronica;
import pt.atec.blog.repository.MecatronicaRepository;
import pt.atec.blog.service.MecatronicaService;


@Service
public class MecatronicaServiceImplement  implements MecatronicaService{

	@Autowired
	MecatronicaRepository mecatronicarepository;
	
	@Override
	public List<Mecatronica> findAll() {
		
		return mecatronicarepository.findAll();
	}

	@Override
	public Mecatronica findById(Long id) {
		
		return mecatronicarepository.findById(id).get();
	}

	@Override
	public Mecatronica saveAll(Mecatronica mecatronica) {
		
		return mecatronicarepository.save(mecatronica);
	}

}
