package pl.eduPlatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.eduPlatform.api_model.Article;
import pl.eduPlatform.api_model.ClassModel;
import pl.eduPlatform.api_model.Course;
import pl.eduPlatform.api_model.Group;
import pl.eduPlatform.service.ProcedureService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/action")
public class ActionController {

    @Autowired
    private ProcedureService procedureService;

    @PostMapping("/add-article-to-course")
    public void addArticleToCourse(@RequestParam String articleTitle, @RequestParam String courseName) {
        procedureService.addArticleToCourse(articleTitle, courseName);
    }
    @PostMapping("/add-article-to-class")
    public void addArticleToClass(@RequestParam String articleTitle, @RequestParam String className) {
        procedureService.addArticleToClass(articleTitle, className);
    }
    @PostMapping("/article-to-container")
    public void addArticleToContainer(@RequestParam String articleTitle, @RequestParam String containerName) {
        procedureService.addArticleToContainer(articleTitle, containerName);
    }
    @PostMapping("/add-group")
    public void addGroup(@RequestBody Group group) {
        procedureService.addGroup(group);
    }
    @PostMapping("/add-group-to-class")
    public void addGroupToClass(@RequestParam String groupName, @RequestParam String className) {
        procedureService.addGroupToClass(groupName, className);
    }
    @PostMapping("/add-user-to-group")
    public void addUserToGroup(@RequestParam String userMail, @RequestParam String groupName) {
        procedureService.addUserToGroup(userMail, groupName);
    }
    @PostMapping("/add-user-to-role")
    public void addUserToRole(@RequestParam String userMail, @RequestParam String roleName) {
        procedureService.addUserToRole(userMail, roleName);
    }
    @DeleteMapping("/del-user-from-group")
    public void delUserFromGroup(@RequestParam String userMail, @RequestParam String groupName) {
        procedureService.delUserFromGroup(userMail, groupName);
    }
    @DeleteMapping("/del-article-from-class")
    public void delArticleFromClass(@RequestParam String articleTitle, @RequestParam String className) {
        procedureService.delArticleFromClass(articleTitle, className);
    }
    @DeleteMapping("/del-article-from-container")
    public void delArticleFromContainer(@RequestParam String articleTitle, @RequestParam String containerName) {
        procedureService.delArticleFromContainer(articleTitle, containerName);
    }
    @DeleteMapping("/del-article-to-course")
    public void delArticleToCourse(@RequestParam String articleTitle, @RequestParam String courseName) {
        procedureService.delArticleToCourse(articleTitle, courseName);
    }
    @DeleteMapping("/del-group-from-class")
    public void delGroupFromClass(@RequestParam String articleTitle, @RequestParam String className) {
        procedureService.delGroupFromClass(articleTitle, className);
    }
    @DeleteMapping("/del-article/{id}")
    public void delArticle(@PathVariable Integer id) {
        procedureService.delArticle(id);
    }
    @DeleteMapping("/del-class/{className}")
    public void delClass(@PathVariable String className) {
        procedureService.delClass(className);
    }
    @DeleteMapping("/del-course/{courseName}")
    public void delCourse(@PathVariable String courseName) {
        procedureService.delCourse(courseName);
    }
    @DeleteMapping("/del-group/{groupName}")
    public void delGroup(@PathVariable String groupName) {
        procedureService.delGroup(groupName);
    }
    @PostMapping("/add-course")
    public void addCourse(@RequestBody Course course) {
        procedureService.addCourse(course);
    }
    @PostMapping("/create-article")
    public void createArticle(@RequestBody Article article) {
        procedureService.createArticle(article);
    }
    @PostMapping("/update-article")
    public void updateArticle(@RequestBody Article article) {
        procedureService.updateArticle(article);
    }
    @PostMapping("/add-class")
    public void addClass(@RequestBody ClassModel classModel) {
        procedureService.addClass(classModel);
    }
}
