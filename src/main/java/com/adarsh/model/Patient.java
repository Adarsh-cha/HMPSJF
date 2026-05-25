package com.adarsh.model;

import jakarta.persistence.*;

@Entity
public class Patient {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private int age;
    private String disease;

    // Default Constructor

    public Patient() {
    }

    // Constructor

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}