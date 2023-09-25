package org.example.core;

import java.time.LocalDate;

public class MonthlySalary {

    private final int dayOfMonth = LocalDate.now().lengthOfMonth();

    public MonthlySalary() {

    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }
}
