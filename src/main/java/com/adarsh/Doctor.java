package com.adarsh;

public class Doctor extends Person {

    String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    @Override
    void display() {
        System.out.println(
                "Doctor ID : " + id +
                        "\nName : " + name +
                        "\nAge : " + age +
                        "\nSpecialization : " + specialization
        );
    }
}
