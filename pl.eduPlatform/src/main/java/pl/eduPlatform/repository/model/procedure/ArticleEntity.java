package pl.eduPlatform.repository.model.procedure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ARTICLE")
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;
    private String title;
    private String authorId;
    @Column(name="ABSTRACT")
    private String abstr;
    private String content;
    private byte[] attachment;
}

