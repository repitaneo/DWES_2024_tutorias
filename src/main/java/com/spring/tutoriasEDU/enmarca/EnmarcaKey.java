package com.spring.tutoriasEDU.enmarca;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable 
class EnmarcaKey implements Serializable { 
	
	private static final long serialVersionUID = 1L;

	private Long planId; 
	private Long actividadId;
	
	
	
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getActividadId() {
		return actividadId;
	}
	public void setActividadId(Long actividadId) {
		this.actividadId = actividadId;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(actividadId, planId);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnmarcaKey other = (EnmarcaKey) obj;
		return Objects.equals(actividadId, other.actividadId) && Objects.equals(planId, other.planId);
	}
	
	
	
	
}
