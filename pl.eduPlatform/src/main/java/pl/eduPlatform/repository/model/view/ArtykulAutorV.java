package pl.eduPlatform.repository.model.view;

import lombok.*;
import jakarta.persistence.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ArtykulAutorV.class)
@Entity
@Table(name = "v_ArtykulAutor")
public class ArtykulAutorV implements Serializable {
    @Id
    private String tytulArtykulu;
    @Id
    private String autor;
}
