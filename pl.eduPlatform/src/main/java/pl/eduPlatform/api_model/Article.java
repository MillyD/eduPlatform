package pl.eduPlatform.api_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Integer idArticle;
    private String title;
    private String authorMail;
    private String abstr;
    private String content;
}
