package com.co.bonilla.usuarios.service;

import com.co.bonilla.common.service.CommonService;
import com.co.bonilla.common.service.implementation.CommonServiceImpl;
import com.co.bonilla.common.usuario.models.entity.Alumno;
import com.co.bonilla.usuarios.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements CommonService<Alumno>{

}
