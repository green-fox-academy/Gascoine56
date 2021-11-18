package com.example.chatproject.services.users;

import com.example.chatproject.models.User;

public interface UserService {

    boolean userExistsByName(String name);
    boolean userExistsByLogin(String name);
    void createNewUser(User user);
    User getUserByLogin(String name);
    boolean checkPassword(String userName, String password);

}
