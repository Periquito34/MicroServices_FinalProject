package com.andresrico.usuario.service;

import models.entity.Alumno;

import com.andresrico.usuario.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoRepository dao;

   @Override
   @Transactional(readOnly = true)
    public Iterable<Alumno> findAll() {
         return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Alumno save(Alumno alumno) {
        return (Alumno) dao.save(alumno);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

}
