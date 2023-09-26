package org.example.core;

import org.example.core.calculatingSalaries.CalculatingSalaries;

import java.util.ArrayList;

public class Company {
    ArrayList<CalculatingSalaries> salaries;

    public Company() {

    }

    public Company(ArrayList<CalculatingSalaries> salaries) {
        this.salaries = salaries;
    }

    public Float calculatingTotalSalary() {
        float sum = 0.0f;
        for (CalculatingSalaries salaries1 : salaries) {
            sum += salaries1.takeSalary();
        }
        return sum;
    }
}
