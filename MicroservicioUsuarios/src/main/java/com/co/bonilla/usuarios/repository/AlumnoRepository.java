package com.co.bonilla.usuarios.repository;

import org.springframework.data.repository.CrudRepository;
import com.co.bonilla.common.usuario.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
