package models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "alumno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alumno)) {
            return false;
        }
        Alumno a = (Alumno) obj;
        return this.id != null && this.id.equals(a.getId());
    }

    @PrePersist
    private void prePersist() {
        this.createAt = new Date();
    }


}
