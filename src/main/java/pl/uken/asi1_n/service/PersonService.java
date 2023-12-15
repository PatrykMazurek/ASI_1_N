package pl.uken.asi1_n.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.uken.asi1_n.model.Person;
import pl.uken.asi1_n.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    public Person getPerson(long id){
        return personRepository.findById(id).orElse(null);
    }

    public void addPerson(Person newPerson) {
        personRepository.save(newPerson);
    }
}
