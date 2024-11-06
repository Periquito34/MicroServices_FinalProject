package com.andresrico.usuario.repository;

import com.andresrico.usuario.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
