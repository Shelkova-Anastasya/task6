package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.ServiceUser;

import java.util.List;

@Controller
public class UserController {

    private ServiceUser serviceUser;
    @Autowired
    public UserController(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @GetMapping(value = "/")
    public String getUsers(Model model) {
        List<User> users = serviceUser.getUsers();
        model.addAttribute("users", users);
        return "users123";
    }
    @GetMapping(value = "/addUser")
    public String addUser(Model model){
        User users = new User();
        model.addAttribute("users", users);

        return  "userInfo";

    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("users") User users){
        serviceUser.saveUser(users);
        return "redirect:/";
    }

    @RequestMapping( "/updateInfo")
    public String updateUser(@RequestParam("userID") int id, Model model){
        User user=serviceUser.getUser(id);
        model.addAttribute("users", user);
    return "userInfo";
}

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userID") int id){
        serviceUser.deleteUser(id);
        return "redirect:/";
    }
}

