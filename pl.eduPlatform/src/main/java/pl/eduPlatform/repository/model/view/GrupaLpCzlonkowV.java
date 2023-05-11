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
@Entity
@IdClass(GrupaLpCzlonkowV.class)
@Table(name = "V_GrupaLpCzlonkow")
public class GrupaLpCzlonkowV implements Serializable {
    @Id
    private String nazwaGrupy;
    @Id
    private Long liczbaCzlonkow;
}
