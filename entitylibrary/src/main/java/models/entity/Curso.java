package models.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table( name= "cursos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Alumno> alumnos;

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void removeAlumno(Alumno alumno){
        this.alumnos.remove(alumno);
    }

    @PrePersist
    private void prePersist() {
        this.createAt = new Date();
    }

}
