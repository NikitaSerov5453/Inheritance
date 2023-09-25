package org.example.core.employees;

public class PieceworkRate extends Employee {
    private int task;
    private int salaryInTask;

    public PieceworkRate(String name, String surname, String patronymic, int hour, int salaryInTask) {
        super(name, surname, patronymic);
        this.task = hour;
        this.salaryInTask = salaryInTask;
    }

    public PieceworkRate() {
        super();
    }

    public float getHour() {
        return task;
    }

    public void setHour(int hour) {
        this.task = hour;
    }

    public int getSalaryInHour() {
        return salaryInTask;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInTask = salaryInHour;
    }

    @Override
    public float takeSalary() {
        return task * salaryInTask;
    }
}
