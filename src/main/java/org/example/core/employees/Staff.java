package org.example.core.employees;


public class Staff  extends Employee{

    private int salary;

    public Staff() {
        super();
    }

    public Staff(String name, String surname, String patronymic, int salary) {
        super(name, surname, patronymic);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public float takeSalary() {
        return (float) salary;
    }

}
