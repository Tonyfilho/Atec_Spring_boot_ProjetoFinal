package pt.atec.blog.service;

import java.util.List;

import pt.atec.blog.model.Tpsi;

public interface TpsiService {
	
	List<Tpsi> findAll();
	
	Tpsi findById(Long id);
	
	Tpsi save(Tpsi tpsi);

}
