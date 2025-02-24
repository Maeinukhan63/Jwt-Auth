package JWT.Example.JWT.Example.controllers;

import JWT.Example.JWT.Example.entities.User;
import JWT.Example.JWT.Example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        return this.userService.getUsers();
    }

    @GetMapping("/curr-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
