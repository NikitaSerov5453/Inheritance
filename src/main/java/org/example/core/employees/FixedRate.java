package org.example.core.employees;

/**
 * ставка – указывается, сколько сотрудник получает за
 * рабочий день; для каждого сотрудника записывается,
 * сколько дней он отработал в месяце;
 */

public class FixedRate extends Employee {

    private float workDay;
    private int salaryInMonth;

    public FixedRate(String name, String surname, String patronymic, float workDay, int salaryInHour) {
        super(name, surname, patronymic);
        this.workDay = workDay;
        this.salaryInMonth = salaryInHour;
    }

    public FixedRate() {
        super();
    }

    public float getHour() {
        return workDay;
    }

    public void setHour(float workDay) {
        this.workDay = workDay;
    }

    public int getSalaryInHour() {
        return salaryInMonth;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInMonth = salaryInHour;
    }

    @Override
    public float takeSalary() {
        return workDay * salaryInMonth;
    }
}
