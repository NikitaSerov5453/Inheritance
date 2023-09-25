package org.example.core.employees;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected String patronymic;

    public Employee(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Employee() {
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

    public float takeSalary(){
        return 0;
    }


    public int compareTo(Employee o2) {
        return compareTo(o2);
    }
}
