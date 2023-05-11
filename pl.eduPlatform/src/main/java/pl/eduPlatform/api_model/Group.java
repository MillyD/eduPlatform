package pl.eduPlatform.api_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * represents data required to add_group procedure <p>
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    private String groupName;
    private String managerEmail;
}
