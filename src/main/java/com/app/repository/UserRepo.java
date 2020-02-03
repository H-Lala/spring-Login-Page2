package com.app.repository;


import com.app.entities.users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<users, Integer> {
    Optional<users> findByUsernameAndPassword(String username, int password);
}
