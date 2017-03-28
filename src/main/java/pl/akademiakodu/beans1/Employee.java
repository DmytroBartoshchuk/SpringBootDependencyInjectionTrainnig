package pl.akademiakodu.beans1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by DmytroBartoshchuk on 28.03.2017.
 */
@Component
public class Employee {
    private String name;
    private String surname;
    private double salary;

    @Autowired
    private Message message;

    public Employee() {
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Message getMessage() {
        return message;
    }
}
