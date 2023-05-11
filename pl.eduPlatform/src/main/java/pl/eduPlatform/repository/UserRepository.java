package pl.eduPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pl.eduPlatform.repository.model.procedure.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Procedure("add_useraccount")
    void callAddUserAccount(String name, String lastName, String mail, String password);

    @Procedure("del_useraccount")
    void callDelUserAccount(String userMail);
}
