package org.example.core.calculatingSalaries;

import org.example.core.employees.Human;

public class PieceworkRate extends CalculatingSalaries {
    private int tax;
    private boolean offshore = true;
    private String paymentType = "Сдельная";
    private int task;
    private float salaryInTask;

    public PieceworkRate(int hour, float salaryInTask) {
        this.task = hour;
        this.salaryInTask = salaryInTask;
    }
    public int tax() {
        if (getHuman().getNumberOfChildren() == 0) {
            return this.tax = 20;
        } else {
            return this.tax = 15;
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

    @Override
    public int getTax() {
        return tax;
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
    public String getPaymentType() {
        return paymentType;
    }

    public PieceworkRate() {
        super();
    }

    public float getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }

    public float getSalaryInTask() {
        return salaryInTask;
    }

    public void setSalaryInTask(float salaryInTask) {
        this.salaryInTask = salaryInTask;
    }

    @Override
    public float takeSalary() {
        return task * salaryInTask;
    }

    @Override
    public float takeSalaryTax() {
        return takeSalary() - ((takeSalary() / 100) * getTax());
    }

}
