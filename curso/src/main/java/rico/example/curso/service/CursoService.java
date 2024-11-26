package rico.example.curso.service;

import org.springframework.stereotype.Service;
import models.entity.Curso;
import service.CommonService;

public interface CursoService extends CommonService<Curso> {

    public Curso save(Curso curso);

}
