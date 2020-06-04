package pt.atec.blog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.atec.blog.model.Tpsi;
import pt.atec.blog.repository.TpsiRepository;
import pt.atec.blog.service.TpsiService;

@Service // é obrigatorio usar esta anotação, para fazer que é um BEAN do spring
public class TpsiServiceImplement implements TpsiService {
	
	@Autowired
	TpsiRepository tpsirepository;

	@Override
	public List<Tpsi> findAll() {
		
		return tpsirepository.findAll();
	}

	@Override
	public Tpsi findById(Long id) {
		
		return tpsirepository.findById(id).get();
	}

	@Override
	public Tpsi save(Tpsi tpsi) {
		
		return tpsirepository.save(tpsi);
	}

}
