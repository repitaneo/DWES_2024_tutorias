package com.spring.tutoriasEDU.planes;

import java.util.List;

import com.spring.tutoriasEDU.Curso.Curso;
import com.spring.tutoriasEDU.enmarca.Enmarca;
import com.spring.tutoriasEDU.tutores.Tutor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
public class Plan {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Size(min=4,max=15, message="pon los caracteres adecuados patán")
	private String nombre;
	
	
	@OneToOne(targetEntity=Tutor.class,mappedBy="plan")
	private Tutor tutor;

	
	@ManyToOne
	@JoinColumn(name="FK_CURSO")
	private Curso curso;
	
	@OneToMany(targetEntity=Enmarca.class,mappedBy="plan",cascade = CascadeType.ALL)
	private List<Enmarca> enmarcaciones;
	
	
	
	
	
	public List<Enmarca> getEnmarcaciones() {
		return enmarcaciones;
	}

	public void setEnmarcaciones(List<Enmarca> enmarcaciones) {
		this.enmarcaciones = enmarcaciones;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", nombre=" + nombre + ", tutor=" + tutor + ", curso=" + curso + "]";
	}
	
	
	
	
	
	
}
