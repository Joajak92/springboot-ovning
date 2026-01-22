package se.iths.joakim.springbootovning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("index")
    public String greeting(Model model) {
        model.addAttribute("name", "Jocke");
        return "index";
    }
}