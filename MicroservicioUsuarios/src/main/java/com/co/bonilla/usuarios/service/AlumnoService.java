package com.co.bonilla.usuarios.service;

import com.co.bonilla.common.service.CommonService;
import com.co.bonilla.common.usuario.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {

    public Alumno save(Alumno alumno);

    public void deleteById(Long id);
}
