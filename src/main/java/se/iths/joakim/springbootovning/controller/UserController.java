package se.iths.joakim.springbootovning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.joakim.springbootovning.model.User;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping("/users")
    private String userList(Model model) {
        List<User> users = List.of(
                new User(1L, "Lewkus", "Halloj", "Lewkus@hotmail.com"),
                new User(2L, "Jocke", "Hejhej", "Jocke@hotmail.com"));
        model.addAttribute("users", users);
        return "users";
    }

}
