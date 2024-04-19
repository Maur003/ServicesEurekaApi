package com.co.bonilla.usuarios.repository;

import com.co.bonilla.usuarios.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
