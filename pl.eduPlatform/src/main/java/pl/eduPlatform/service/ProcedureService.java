package pl.eduPlatform.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.eduPlatform.api_model.Article;
import pl.eduPlatform.api_model.ClassModel;
import pl.eduPlatform.repository.ProcedureRepository;
import pl.eduPlatform.api_model.Course;
import pl.eduPlatform.api_model.Group;

@Service
public class ProcedureService {

    @Autowired
    private ProcedureRepository procedureRepository;

    public void addArticleToCourse(String articleTitle, String courseName) {
        procedureRepository.callAddArticleToCourse(articleTitle, courseName);
    }

    public void addArticleToClass(String articleTitle, String className) {
        procedureRepository.callAddArticleToClass(articleTitle, className);
    }

    public void addArticleToContainer(String articleTitle, String containerName) {
        procedureRepository.callAddArticleToContainer(articleTitle, containerName);
    }

    public void addGroup(Group group) {
        procedureRepository.callAddGroup(group.getGroupName(), group.getManagerEmail());
    }

    public void addGroupToClass(String groupName, String className) {
        procedureRepository.callAddGroupToClass(groupName, className);
    }

    public void addUserToGroup(String userMail, String groupName) {
        procedureRepository.callAddUserToGroup(userMail, groupName);
    }

    public void addUserToRole(String userMail, String roleName) {
        procedureRepository.callAddUserToRole(userMail, roleName);
    }

    public void delUserFromGroup(String userMail, String groupName) {
        procedureRepository.callDelUserFromGroup(userMail, groupName);
    }

    public void delArticleFromClass(String articleTitle, String className) {
        procedureRepository.callDelArticleFromClass(articleTitle, className);
    }

    public void delArticleFromContainer(String articleTitle, String containerName) {
        procedureRepository.callDelArticleFromContainer(articleTitle, containerName);
    }

    public void delArticleToCourse(String articleTitle, String courseName) {
        procedureRepository.callDelArticleToCourse(articleTitle, courseName);
    }

    public void delGroupFromClass(String articleTitle, String className) {
        procedureRepository.callDelGroupFromClass(articleTitle, className);
    }

    public void delArticle(Integer id) {
        procedureRepository.callDelArticle(id);
    }

    public void delClass(String className) {
        procedureRepository.callDelClass(className);
    }

    public void delCourse(String courseName) {
        procedureRepository.callDelCourse(courseName);
    }

    public void delGroup(String groupName) {
        procedureRepository.callDelGroup(groupName);
    }

    public void addCourse(Course course) {
        procedureRepository.callAddCourse(course.getCourseName(), course.getOwnerEmail(), course.getCourseDescription());
    }

    public void createArticle(Article article) {
        procedureRepository.callCreateArticle(article.getTitle(), article.getAuthorMail(), article.getAbstr(), article.getContent());
    }

    public void updateArticle(Article article) {
        procedureRepository.callUpdateArticle(article.getIdArticle(), article.getTitle(), article.getAuthorMail(), article.getAbstr(), article.getContent());
    }

    public void addClass(ClassModel classModel) {
        procedureRepository.callAddClass(classModel.getClassName(),
                classModel.getPresenterEmail(), classModel.getPlacesAvailable(),
                classModel.getStartData(), classModel.getStopData());
    }
}
