package pt.atec.blog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.atec.blog.model.Redes;
import pt.atec.blog.repository.RedesRepository;
import pt.atec.blog.service.RedesService;

@Service
public class RedesServiceImplement implements RedesService{
	
	@Autowired
	RedesRepository rederepository;

	@Override
	public List<Redes> findAllRedes() {
		// TODO Auto-generated method stub
		return rederepository.findAll();
	}

	@Override
	public Redes findById(Long id) {
		// TODO Auto-generated method stub
		return rederepository.findById(id).get();
	}

	@Override
	public Redes saveAll(Redes redes) {
		// TODO Auto-generated method stub
		return rederepository.save(redes);
	}

}
