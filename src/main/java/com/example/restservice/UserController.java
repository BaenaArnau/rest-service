package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    public List<User> readAllUsers() {
        return userService.getAllUseres();
    }

    public User getUserId(Integer id) {
        Optional<User> optionalUser;
        optionalUser = userService.llistaUsers.stream().filter(u -> u.id() == id).findFirst();
        if (optionalUser.isPresent()) return optionalUser.get();
        else return null;
    }

    public void addUser(User user) {
        userService.newUser(user);
    }

    public void deleteUser(Integer id) {
        userService.remove(id);
    }
}
