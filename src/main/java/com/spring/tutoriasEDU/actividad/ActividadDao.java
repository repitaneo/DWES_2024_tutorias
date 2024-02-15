package com.spring.tutoriasEDU.actividad;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.tutoriasEDU.Curso.Curso;

public interface ActividadDao extends CrudRepository<Actividad, Long> {

	@Query(value="select * from actividad a where a.id NOT IN  (SELECT e.actividad_id FROM enmarca e where e.plan_id = :id)", nativeQuery = true)
	List<Actividad> findNotLinkPlan(long id);

}
