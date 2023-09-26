package org.example.core.calculatingSalaries;

import org.example.core.employees.Human;

public abstract class CalculatingSalaries {

    private int tax;

    private boolean offshore;

    private String paymentType;

    private Human human;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public boolean isOffshore() {
        return offshore;
    }

    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }


    public CalculatingSalaries() {

    }

    public float takeSalary(){
        return 0;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public float takeSalaryTax() {
        return 0;
    }

    public String takeSalaryTugrik() {
        return "";
    }

    public float takeSalaryOffshore() {
        return 0;
    }

    public int tax() {
        return 0;
    }

    public int taxOffshore() {
        return 0;
    }

}
