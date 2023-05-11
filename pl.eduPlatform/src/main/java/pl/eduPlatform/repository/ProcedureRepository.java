package pl.eduPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pl.eduPlatform.repository.model.procedure.ArticleEntity;
import pl.eduPlatform.repository.model.procedure.UserEntity;

import java.time.LocalDateTime;

@Repository
public interface ProcedureRepository extends JpaRepository<ArticleEntity, Long> {
    @Procedure("add_articletocourse")
    void callAddArticleToCourse(String articleTitle, String courseName);
    @Procedure("add_articletoclass")
    void callAddArticleToClass(String articleTitle, String className);
    @Procedure("add_articletocontainer")
    void callAddArticleToContainer(String articleTitle, String containerName);
    @Procedure("add_group")
    void callAddGroup(String groupName, String managerMail);
    @Procedure("add_grouptoclass")
    void callAddGroupToClass(String groupName, String className);
    @Procedure("add_usertogroup")
    void callAddUserToGroup(String userMail, String groupName);
    @Procedure("add_usertorole")
    void callAddUserToRole(String userMail, String roleName);
    @Procedure("del_userfromgroup")
    void callDelUserFromGroup(String userMail, String groupName);
    @Procedure("del_articlefromclass")
    void callDelArticleFromClass(String articleTitle, String className);
    @Procedure("del_articlefromcontainer")
    void callDelArticleFromContainer(String articleTitle, String containerName);
    @Procedure("del_articletocourse")
    void callDelArticleToCourse(String articleTitle, String courseName);
    @Procedure("del_groupfromclass")
    void callDelGroupFromClass(String articleTitle, String className);
    @Procedure("del_article")
    void callDelArticle(Integer id);
    @Procedure("del_class")
    void callDelClass(String className);
    @Procedure("del_course")
    void callDelCourse(String courseName);
    @Procedure("del_group")
    void callDelGroup(String groupName);
    @Procedure("add_course")
    void callAddCourse(String courseName, String ownerName, String courseDesc);
    @Procedure("create_article")
    void callCreateArticle(String title, String authorMail, String abstr, String content);
    @Procedure("update_article")
    void callUpdateArticle(Integer id, String articleTitle, String authorMail, String abstr, String content);
    @Procedure("add_class")
    void callAddClass(String className, String presenterMail, Integer availablePlaces, LocalDateTime startDate , LocalDateTime stopDate);
}
