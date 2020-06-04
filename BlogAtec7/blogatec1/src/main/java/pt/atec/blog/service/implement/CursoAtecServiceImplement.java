package pt.atec.blog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.atec.blog.model.CursoAtec;
import pt.atec.blog.repository.CursoAtecRepository;
import pt.atec.blog.service.CursoAtecService;

@Service // é obrigatorio usar esta anotação, para fazer que é um BEAN do spring
public class CursoAtecServiceImplement  implements CursoAtecService{
	
	
	@Autowired
	CursoAtecRepository postAtecRepository;

	@Override
	public List<CursoAtec> findAll() {
		
		return postAtecRepository.findAll();
	}

	@Override
	public CursoAtec findById(Long id) {
		
		return postAtecRepository.findById(id).get();
	}

	@Override
	public CursoAtec save(CursoAtec postAtec) {
		
		return postAtecRepository.save(postAtec);
	}

//	@Override
//	public PostAtec findByNome(String autor) {
//		// TODO Auto-generated method stub
//		return postAtecRepository.findOne("tony");
//	}

}
