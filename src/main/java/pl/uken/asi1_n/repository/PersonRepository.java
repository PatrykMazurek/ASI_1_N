package pl.uken.asi1_n.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.uken.asi1_n.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


}
