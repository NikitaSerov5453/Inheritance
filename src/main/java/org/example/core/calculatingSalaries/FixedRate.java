package org.example.core.calculatingSalaries;

import org.example.core.employees.Human;

/**
 * ставка – указывается, сколько сотрудник получает за
 * рабочий день; для каждого сотрудника записывается,
 * сколько дней он отработал в месяце;
 */

public class FixedRate extends CalculatingSalaries {

    private int tax;
    private boolean offshore = false;
    private String paymentType = "Фиксированая ставка";
    private int workDay;
    private float salaryInDay;


    public FixedRate(int workDay, float salaryInMonth) {
        this.workDay = workDay;
        this.salaryInDay = salaryInMonth;
    }

    @Override
    public int tax() {
        if (getHuman().getNumberOfChildren() == 0) {
            return this.tax = 25;
        } else {
            return this.tax = 20;
        }
    }

    @Override
    public int taxOffshore() {
        if (isOffshore()) {
            return this.tax = 0;
        } else {
            return tax();
        }
    }

    @Override
    public boolean isOffshore() {
        return offshore;
    }

    @Override
    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }


    public FixedRate() {
        super();
    }
    @Override
    public String getPaymentType() {
        return paymentType;
    }
    @Override
    public Human getHuman() {
        return super.getHuman();
    }

    @Override
    public void setHuman(Human human) {
        super.setHuman(human);
    }

    @Override
    public int getTax() {
        return tax;
    }

    public float workDay() {
        return workDay;
    }

    public void workDay(int workDay) {
        this.workDay = workDay;
    }

    public float getSalaryInDay() {
        return salaryInDay;
    }

    public void setSalaryInDay(float salaryInDay) {
        this.salaryInDay = salaryInDay;
    }

    @Override
    public float takeSalary() {
        return workDay * salaryInDay;
    }

    @Override
    public float takeSalaryTax() {
        return takeSalary() - ((takeSalary() / 100) * getTax());
    }
}
