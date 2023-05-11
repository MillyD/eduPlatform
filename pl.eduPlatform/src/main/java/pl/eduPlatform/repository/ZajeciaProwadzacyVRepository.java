package pl.eduPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.eduPlatform.repository.model.view.ZajeciaProwadzacyV;

@Repository
public interface ZajeciaProwadzacyVRepository extends JpaRepository<ZajeciaProwadzacyV, ZajeciaProwadzacyV> {
}
