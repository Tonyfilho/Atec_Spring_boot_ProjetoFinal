package pt.atec.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.atec.blog.model.Automoveis;

public interface AutomoveisRepository  extends JpaRepository<Automoveis, Long>{

	Automoveis findByTitulo(String titulo);
}
