package pl.eduPlatform.repository.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PublikacjeV.class)
@Entity
@Table(name = "v_Publikacje")
public class PublikacjeV implements Serializable{
    @Id
    private String tytul;
    @Id
    private String tresc;
    @Id
    private String kontener;
}
