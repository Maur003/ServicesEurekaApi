package com.co.bonilla.curso.service;

import org.springframework.stereotype.Service;


import com.co.bonilla.common.service.CommonService;
import com.co.bonilla.common.service.implementation.CommonServiceImpl;
import com.co.bonilla.common.usuario.models.entity.Curso;
import com.co.bonilla.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso>{

}
