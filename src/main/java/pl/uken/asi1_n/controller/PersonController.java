package pl.uken.asi1_n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.uken.asi1_n.model.Person;
import pl.uken.asi1_n.service.PersonService;

import javax.validation.Valid;

@Controller
@RequestMapping("/person")
public class PersonController implements WebMvcConfigurer {

    @Autowired
    PersonService personService;

    @GetMapping("/list")
    public String shwoPerson(Model model){
        model.addAttribute("persons",
                personService.getAllPerson());
        return "person/index";
    }

    @GetMapping("/add")
    public String showNewPersonForm(Model model){
        model.addAttribute("newPerson", new Person());
        return "person/add-person";
    }

    @PostMapping("/save")
    public String addNewPerson(@Valid @ModelAttribute("newPerson") Person newPerson,
                               BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "person/add-person";
        }

        personService.addPerson(newPerson);
        return "redirect:/person/list";
    }

    @GetMapping("/{id}")
    public String showPerson(@PathVariable("id") long id, Model model){
        Person person = personService.getPerson(id);
        model.addAttribute("person", person);
        return "person/info-person";
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
    }
}
