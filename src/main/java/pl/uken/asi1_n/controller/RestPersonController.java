package pl.uken.asi1_n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.uken.asi1_n.model.Person;
import pl.uken.asi1_n.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class RestPersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/all")
    public List<Person> getAllPerso(){
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@RequestParam("id") Long id){
        return ResponseEntity.ok().body(personService.getPerson(id));
    }

    // dopisać metody do dodania, usunięcia osoby

}
