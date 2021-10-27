package com.example.exercises.GreenFoxClass.repositories;

import java.io.IOException;
import java.util.List;

public interface FoxInterface {
    public List<String> findAll() throws IOException;

    public void save(String student) throws IOException;

    public int count() throws IOException;

    public boolean checkByName(String name) throws IOException;
}
