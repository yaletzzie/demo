package com.example.demo.app.users.restcontrollers;

import com.example.demo.app.users.models.User;
import com.example.demo.app.users.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Integer findById(@PathVariable("id")Integer id)
    {
        return id;
    }

    @PostMapping
    public String create(@RequestBody String usuario){
        return usuario;
    }


    @GetMapping
    public List<User>findAll(){
        return  userService.findAll();
    }

}
