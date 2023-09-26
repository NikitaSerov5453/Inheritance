package org.example.core;

import org.example.core.calculatingSalaries.CalculatingSalaries;
import org.example.core.employees.Human;

import java.util.ArrayList;

public class Journal {

    public Journal() {

    }

    private static final ArrayList<CalculatingSalaries> staff = new ArrayList<>();

    public static ArrayList<CalculatingSalaries> getStaff() {
        return staff;
    }

    public static void setStaff(CalculatingSalaries staff) {
        Journal.staff.add(staff);
    }

}
