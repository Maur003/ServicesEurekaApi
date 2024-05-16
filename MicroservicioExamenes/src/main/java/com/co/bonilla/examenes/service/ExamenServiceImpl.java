package com.co.bonilla.examenes.service;

import org.springframework.stereotype.Service;

import com.co.bonilla.common.service.CommonService;
import com.co.bonilla.common.service.implementation.CommonServiceImpl;
import com.co.bonilla.common.usuario.models.entity.Examen;
import com.co.bonilla.examenes.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen>{

}
