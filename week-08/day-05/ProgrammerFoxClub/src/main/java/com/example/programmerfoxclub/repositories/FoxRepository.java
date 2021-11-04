package com.example.programmerfoxclub.repositories;

import com.example.programmerfoxclub.models.Fox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends JpaRepository<Fox, Long> {

    Fox findByName(String name);
}