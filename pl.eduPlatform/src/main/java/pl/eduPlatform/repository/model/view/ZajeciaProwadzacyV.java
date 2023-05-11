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
@IdClass(ZajeciaProwadzacyV.class)
@Table(name = "v_ZajeciaProwadzacy")
public class ZajeciaProwadzacyV implements Serializable {
    @Id
    private String zajecia;
    @Id
    private String prowadzacy;
}
