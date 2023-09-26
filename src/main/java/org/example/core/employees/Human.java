package org.example.core.employees;

public class Human {
    protected String name;
    protected String surname;
    protected String patronymic;
    protected int numberOfChildren;

    public Human(String name, String surname, String patronymic, int numberOfChildren) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.numberOfChildren = numberOfChildren;
    }

    public Human() {

    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic;
    }
}
