package uz.najottalim.springbootonetomnymanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.springbootonetomnymanytomany.model.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
