package pl.eduPlatform.repository.model.view;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ArtykulKursZajeciaV.class)
@Entity
@Table(name = "v_ArtykulKursZajecia")
public class ArtykulKursZajeciaV implements Serializable {
    @Id
    private String artykul;
    @Id
    private String kurs;
    @Id
    private String zajecia;

}
