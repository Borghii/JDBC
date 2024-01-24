package org.borghii.jdbc.model;

import java.time.LocalDate;

public class Employee {

    private String name;
    private String surname;
    private LocalDate hireDate;
    enum State{ACTIVE, INACTIVE}
    State state;

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

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
