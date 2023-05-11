package pl.eduPlatform.repository.model.view;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(KursWlascicielV.class)
@Entity
@Table(name = "v_KursWlasciciel")
public class KursWlascicielV implements Serializable {
    @Id
    private String nazwaKursu;
    @Id
    private String wlasciciel;
}
