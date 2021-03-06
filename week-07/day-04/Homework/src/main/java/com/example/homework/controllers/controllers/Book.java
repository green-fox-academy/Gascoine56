package com.example.homework.controllers.controllers;

public class Book {
    private static int nextId = 0;

    private int id;
    private String title;
    private String author;
    private String releaseYear;

    public Book(String title, String author, String releaseYear) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}