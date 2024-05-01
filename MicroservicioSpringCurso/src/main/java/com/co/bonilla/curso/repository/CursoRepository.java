package com.co.bonilla.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.bonilla.common.usuario.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
