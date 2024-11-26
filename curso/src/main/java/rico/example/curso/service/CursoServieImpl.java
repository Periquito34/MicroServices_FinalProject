package rico.example.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import models.entity.Curso;
import rico.example.curso.repository.CursoRepository;
import service.CommonServiceImpl;

import java.util.Optional;

@Service
public class CursoServieImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService{
    @Autowired
    CursoRepository dao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Curso> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Curso> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Curso save(Curso curso) {
        return (Curso) dao.save(curso);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

}
