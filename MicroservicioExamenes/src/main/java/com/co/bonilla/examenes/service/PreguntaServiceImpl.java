package com.co.bonilla.examenes.service;

import org.springframework.stereotype.Service;

import com.co.bonilla.common.service.CommonService;
import com.co.bonilla.common.service.implementation.CommonServiceImpl;
import com.co.bonilla.common.usuario.models.entity.Pregunta;
import com.co.bonilla.examenes.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta>{

}
