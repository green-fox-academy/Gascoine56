package com.example.programmerfoxclub.repositories;

import com.example.programmerfoxclub.models.Trick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TricksRepository extends JpaRepository<Trick, Long> {

    Trick findByName(String name);
}