package com.example.reddit.services.users;

import com.example.reddit.models.User;
import com.example.reddit.repositories.UserRepository;
import com.example.reddit.services.users.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean userExists(User user) {
       return userRepository.findAll().contains(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User getByName(String name) {
        return userRepository.findByUserName(name);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean existsByName(String name) {
        return userRepository.existsByUserName(name);
    }
}
