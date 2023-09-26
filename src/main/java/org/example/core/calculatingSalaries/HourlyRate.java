package org.example.core.calculatingSalaries;

import org.example.core.employees.Human;

public class HourlyRate extends CalculatingSalaries {

    private boolean offshore;
    private int tugrik = 36;
    private String paymentType = "Почасовая";
    private int hour;
    private float salaryInHour;

    @Override
    public Human getHuman() {
        return super.getHuman();
    }
    @Override
    public void setHuman(Human human) {
        super.setHuman(human);
    }
    @Override
    public String getPaymentType() {
        return paymentType;
    }

    private int tax() {
        if (isOffshore()) {
            return 0;
        } else if (getHuman().getNumberOfChildren() == 0) {
            return 25;
        } else {
            return 20;
        }
    }

    @Override
    public boolean isOffshore() {
        return super.isOffshore();
    }

    @Override
    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }

    @Override
    public int getTax() {
        return tax();
    }

    public HourlyRate(int hour, float salaryInHour) {
        this.hour = hour;
        this.salaryInHour = salaryInHour;
    }

    public HourlyRate() {
        super();
    }

    public float getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public float getSalaryInHour() {
        return salaryInHour;
    }

    public void setSalaryInHour(float salaryInHour) {
        this.salaryInHour = salaryInHour;
    }

    @Override
    public float takeSalary() {
        return hour * salaryInHour;
    }
    @Override
    public float takeSalaryTax() {
        return (takeSalary() - ((takeSalary() / 100) * getTax())) / 2;
    }

    @Override
    public String takeSalaryTugrik() {
        return "/" + takeSalaryTax() * tugrik;
    }
}
