package com.example.stringbootapi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/user")
public class UserController {

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;

    @GetMapping
    public List<User> getUser(){
       return userService.getUser();
    }

    @PostMapping
    public void createUSer(@RequestBody User user){
        userService.createUser(user);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String firstname,
            @RequestParam(required = false) String lastname,
            @RequestParam(required = false) Integer age

    ){
        userService.updateUser(userId , firstname , lastname , age);
    }

    @DeleteMapping(path =  "{userId}")
    public void deleteUser(
             @PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }



}
