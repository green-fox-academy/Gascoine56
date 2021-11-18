package com.example.chatproject.services.users;

import com.example.chatproject.models.User;
import com.example.chatproject.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean userExistsByName(String userName) {
        return userRepository.existsByUserName(userName);
    }

    @Override
    public boolean userExistsByLogin(String login) {
        return userRepository.existsByLogin(login);
    }

    @Override
    public void createNewUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByLogin(String name) {
        return userRepository.findByLogin(name);
    }

    @Override
    public boolean checkPassword(String userName, String password) {
        return getUserByLogin(userName).getPassword().equals(password);
    }

}
