package com.app.service;


import com.app.entities.users;
import com.app.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Iterable<users> getAll() {
        return userRepo.findAll();
    }

    public void add(users newUsers) {
        userRepo.save(newUsers);
    }

    public Optional<users> findByusernameAndPassword(String username, int password) {
        return userRepo.findByUsernameAndPassword(username, password);
    }
    public Optional<users> findById(int id){
         return userRepo.findById(id);
    }

}
