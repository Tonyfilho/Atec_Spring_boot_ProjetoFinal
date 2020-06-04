package pt.atec.blog.service;

import java.util.List;

import pt.atec.blog.model.Redes;

public interface RedesService {
	
	List<Redes>findAllRedes();
	
	Redes findById (Long id);
	
	Redes saveAll (Redes redes);

}
