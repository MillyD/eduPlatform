package pl.eduPlatform.api_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * represents data required to add_class procedure <p>
 * used for insert data to CLASS table
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassModel {
    private String className;
    private String presenterEmail;
    private Integer placesAvailable;
    private LocalDateTime startData;
    private LocalDateTime stopData;
}
