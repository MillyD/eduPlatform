package pl.eduPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.eduPlatform.api_model.User;
import pl.eduPlatform.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createAccount(User user){
        userRepository.callAddUserAccount(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
    }
    public void delUserAccount(String userMail) {
        userRepository.callDelUserAccount(userMail);
    }
}
