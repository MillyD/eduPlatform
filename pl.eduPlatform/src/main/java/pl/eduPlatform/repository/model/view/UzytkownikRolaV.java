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
@IdClass(UzytkownikRolaV.class)
@Table(name = "v_UzytkownikRola")
public class UzytkownikRolaV implements Serializable {
    @Id
    private String uzytkownik;
    @Id
    private String email;
    @Id
    private String rola;
}
