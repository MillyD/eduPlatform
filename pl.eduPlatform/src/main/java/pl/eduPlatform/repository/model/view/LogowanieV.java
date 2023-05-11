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
@IdClass(LogowanieV.class)
@Entity
@Table(name = "v_Logowanie")
public class LogowanieV implements Serializable {
    @Id
    private Long id;
    @Id
    private String email;
    @Id
    private String haslo;
    @Id
    private String rola;
}
