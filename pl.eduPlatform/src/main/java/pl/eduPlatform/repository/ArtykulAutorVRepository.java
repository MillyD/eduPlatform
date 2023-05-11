package pl.eduPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.eduPlatform.repository.model.view.ArtykulAutorV;

@Repository
public interface ArtykulAutorVRepository extends JpaRepository<ArtykulAutorV, ArtykulAutorV> {
}
