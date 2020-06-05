package pt.atec.blog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ciber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	private String titulo;
	
	
	private String autor;
	
	
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") 
	private LocalDate data;
	
	
	private String curso;


	@Lob
	private String texto;
	
	@ManyToOne
	private CursoAtec cursoatec;

/************************************************sets e gets*/
	
	
	
	public Long getId() {
		return id;
	}


	public CursoAtec getCursoatec() {
	return cursoatec;
}


public void setCursoatec(CursoAtec cursoatec) {
	this.cursoatec = cursoatec;
}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	


}
