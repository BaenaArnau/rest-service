package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> llistaUsers = new ArrayList<>();

    public UserService() {
        llistaUsers.add(new User(4, "email4@email.com","User 4","1234"));
        llistaUsers.add(new User(2, "email2@email.com","User 2","1234"));
    }

    public List<User> getAllUseres() {
        return llistaUsers;
    }

    public void newUser(User user) {
        llistaUsers.add(user);
    }

    public void remove(Integer id) {
        llistaUsers.removeIf(u -> u.id() == id);
    }
}
