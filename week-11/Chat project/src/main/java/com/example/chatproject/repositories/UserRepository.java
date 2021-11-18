package com.example.chatproject.repositories;

import com.example.chatproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUserName(String name);
    boolean existsByLogin(String name);
    User findByLogin(String name);


}
