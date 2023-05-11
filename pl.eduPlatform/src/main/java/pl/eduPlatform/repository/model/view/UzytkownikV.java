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
@IdClass(UzytkownikV.class)
@Table(name = "v_uzytkownik")
public class UzytkownikV implements Serializable {
    @Id
    private String imieNazwisko;
    @Id
    private String email;
}
