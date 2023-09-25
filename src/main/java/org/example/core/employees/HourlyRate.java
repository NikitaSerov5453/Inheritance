package org.example.core.employees;

public class HourlyRate extends Employee  {
    private float hour;
    private int salaryInHour;

    public HourlyRate(String name, String surname, String patronymic, float hour, int salaryInHour) {
        super(name, surname, patronymic);
        this.hour = hour;
        this.salaryInHour = salaryInHour;
    }

    public HourlyRate(){
        super();
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public int getSalaryInHour() {
        return salaryInHour;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInHour = salaryInHour;
    }

    @Override
    public float takeSalary() {
        return hour*salaryInHour;
    }




}
