package se.iths.joakim.springbootovning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.joakim.springbootovning.model.Person;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController {

    @GetMapping("/persons")
    public String personList(Model model) {
        List<Person> persons = List.of(
                new Person(1L, "Jocke", 33, "Jocke@hotmail.com"),
                new Person(2L, "Janne", 45, "Janne@hotmail.com"),
                new Person(3L, "Erik", 25, "Erik@hotmail.com"));
        model.addAttribute("persons", persons);
        return "persons";
    }
}
