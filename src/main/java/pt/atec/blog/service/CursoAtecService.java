package pt.atec.blog.service;

import java.util.List;

import pt.atec.blog.model.CursoAtec;

public interface CursoAtecService  {
	
	
	List<CursoAtec> findAll();
	
	
	CursoAtec findById(Long id);
	
	
	CursoAtec save(CursoAtec cursoAtec);
	
	


}
