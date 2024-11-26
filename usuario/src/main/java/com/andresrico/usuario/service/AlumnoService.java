package com.andresrico.usuario.service;

import models.entity.Alumno;

import service.CommonService;

import java.util.Optional;

public interface AlumnoService extends CommonService<Alumno> {

    public Alumno save(Alumno alumno);
    public void deleteById(Long id);
}
