package com.spring.tutoriasEDU.enmarca;

import com.spring.tutoriasEDU.actividad.Actividad;
import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Enmarca {

	@EmbeddedId 
	private EnmarcaKey id; 
	
	@ManyToOne 
	@MapsId("planId") 
	@JoinColumn(name = "plan_id") 
	private Plan plan; 

	@ManyToOne 
	@MapsId("actividadId") 
	@JoinColumn(name = "actividad_id") 
	private Actividad actividad; 

	private String fecha;

	public EnmarcaKey getId() {
		return id;
	}

	public void setId(EnmarcaKey id) {
		this.id = id;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Enmarca [id=" + id + ", plan=" + plan+ ", act=" + actividad + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
