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
@IdClass(UzytkownikNazwaGrupyV.class)
@Entity
@Table(name = "v_UzytkownikNazwaGrupy")
public class UzytkownikNazwaGrupyV implements Serializable {
    @Id
    private String nazwaGrupy;

    @Id
    private String czlonekGrupy;
}
