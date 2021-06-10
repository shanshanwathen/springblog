package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users/all")
    public String getAllUsers(Model model) {
        List<User> users = new ArrayList<>();

        users.add(new User("Samuel", "Moore"));
        users.add(new User("Andrew", "Walsh"));


        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/user")
    public String getUserString(Model model) {
        model.addAttribute("user", new User("Douglas", "Hirsh"));
        return "users";
    }

}