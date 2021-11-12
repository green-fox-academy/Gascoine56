package com.example.reddit.services.users;

import com.example.reddit.models.User;

public interface UserService {

    boolean userExists(User user);
    User getById(Long id);
    User getByName(String name);
    void addUser(User user);
    boolean existsByName(String name);

}
