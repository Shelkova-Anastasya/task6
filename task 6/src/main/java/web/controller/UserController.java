package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.ServiceUser;


@Controller
public class UserController {

    private ServiceUser serviceUser;
    @Autowired
    public UserController(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @GetMapping(value = "/")
    public String getUsers(Model model) {
        model.addAttribute("users", serviceUser.getUsers());
        return "users123";
    }
    @GetMapping(value = "/addUser")
    public String addUser(Model model){
        model.addAttribute("users", new User());

        return  "userInfo";

    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("users") User users){
        serviceUser.saveUser(users);
        return "redirect:/";
    }

    @RequestMapping( "/updateInfo")
    public String updateUser(@RequestParam("userID") int id, Model model){
        model.addAttribute("users", serviceUser.getUser(id));
    return "userInfo";
}

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userID") int id){
        serviceUser.deleteUser(id);
        return "redirect:/";
    }
}

