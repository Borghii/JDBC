package org.borghii.jdbc.model;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private int id;//add TableView
    private LocalDate unHireDate;

    private String name;
    private String surname;
    private LocalDate hireDate;
    enum State{ACTIVE, INACTIVE}
    State state;

    public Employee(int id, LocalDate unHireDate, String name, String surname, LocalDate hireDate, State state) {
        this.id = id;
        this.unHireDate = unHireDate;
        this.name = name;
        this.surname = surname;
        this.hireDate = hireDate;
        this.state = state;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.hireDate = LocalDate.now();
        this.state = State.ACTIVE;
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

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public State getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public LocalDate getUnHireDate() {
        return unHireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", unHireDate=" + unHireDate +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hireDate=" + hireDate +
                ", state=" + state +
                '}';
    }
}
