package com.spring.tutoriasEDU.actividad;

import org.springframework.data.repository.CrudRepository;

import com.spring.tutoriasEDU.Curso.Curso;

public interface ActividadDao extends CrudRepository<Actividad, Long> {

}
