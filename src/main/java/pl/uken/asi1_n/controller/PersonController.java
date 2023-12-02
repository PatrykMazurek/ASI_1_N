package pl.uken.asi1_n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.uken.asi1_n.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/list")
    public String shwoPerson(Model model){
        model.addAttribute("persons",
                personService.getAllPerson());
        return "person/index";
    }

}
