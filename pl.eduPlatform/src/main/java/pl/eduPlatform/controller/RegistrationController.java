package pl.eduPlatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.eduPlatform.api_model.User;
import pl.eduPlatform.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user){
        userService.createAccount(user);
    }

    @DeleteMapping("/delete/{userMail}")
    public void registerUser(@PathVariable String userMail){
        userService.delUserAccount(userMail);
    }
}