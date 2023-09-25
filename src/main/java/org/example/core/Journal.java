package org.example.core;

import org.example.core.employees.Staff;

import java.util.ArrayList;

public class Journal {

    public Journal() {

    }

    private static final ArrayList<Staff> staff = new ArrayList<>();

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        Journal.staff.add(staff);
    }
}
