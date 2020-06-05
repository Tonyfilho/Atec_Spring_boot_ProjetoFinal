package pt.atec.blog.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;




@Entity
@Table(name = "post_atec")
public class CursoAtec {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	
	private String titulo;
	
	
	private String autor;
	
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") 
	private LocalDate data = LocalDate.now();
	

	private String curso;
	
	@Lob
	private String texto;
	
	@OneToMany(mappedBy = "cursoatec", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Tpsi>  tpsi = new ArrayList<>();
	
	@OneToMany(mappedBy = "cursoatec", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Ciber> ciber = new ArrayList<>();
	
	@OneToMany(mappedBy = "cursoatec",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Mecatronica> mecatronica = new ArrayList<>();
	
	@OneToMany(mappedBy = "cursoatec", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Redes> redes = new ArrayList<>();
	
	@OneToMany(mappedBy = "cursoatec", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Robotica> robotica = new  ArrayList<>();
	
	@OneToMany(mappedBy = "cursoatec", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Automoveis> mecatronicaAutomoveis = new ArrayList<>();
	
	/*********************************************sets e gets*/
	
	
	
	public long getId() {
		return id;
	}

	public List<Automoveis> getMecatronicaAutomoveis() {
		return mecatronicaAutomoveis;
	}

	public void setMecatronicaAutomoveis(List<Automoveis> mecatronicaAutomoveis) {
		this.mecatronicaAutomoveis = mecatronicaAutomoveis;
	}

	public List<Ciber> getCiber() {
		return ciber;
	}

	public void setCiber(List<Ciber> ciber) {
		this.ciber = ciber;
	}

	public List<Mecatronica> getMecatronica() {
		return mecatronica;
	}

	public void setMecatronica(List<Mecatronica> mecatronica) {
		this.mecatronica = mecatronica;
	}

	public List<Redes> getRedes() {
		return redes;
	}

	public void setRedes(List<Redes> redes) {
		this.redes = redes;
	}

	public List<Robotica> getRobotica() {
		return robotica;
	}

	public void setRobotica(List<Robotica> robotica) {
		this.robotica = robotica;
	}

	public void setId(long id) {
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


	public List<Tpsi> getTpsi() {
		return tpsi;
	}

	public void setTpsi(List<Tpsi> tpsi) {
		this.tpsi = tpsi;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
