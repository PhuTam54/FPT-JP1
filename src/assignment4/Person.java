package assignment4;

import Practice.Student;

import java.util.List;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    int telephone;
    String address;

    public Person() {

    }
    public Person(String name, int age, int telephone, String address) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
