package org.example.core.employees;

import org.example.core.Journal;
import org.example.core.calculatingSalaries.FixedRate;
import org.example.core.calculatingSalaries.HourlyRate;
import org.example.core.calculatingSalaries.PieceworkRate;

public class Employee {

    public Employee() {

    }

    public FixedRate fixRateEmployee(Human human, int workDay, float salaryInDay, boolean offshore) {
        FixedRate fixedRate = new FixedRate();
        fixedRate.workDay(workDay);
        fixedRate.setSalaryInDay(salaryInDay);
        fixedRate.setHuman(human);
        fixedRate.setOffshore(offshore);
        Journal.setStaff(fixedRate);

        return fixedRate;
    }

    public HourlyRate hourlyRateEmployee(Human human, int hour, float salaryInHour, boolean offshore) {
        HourlyRate hourlyRate = new HourlyRate();
        hourlyRate.setHour(hour);
        hourlyRate.setSalaryInHour(salaryInHour);
        hourlyRate.setHuman(human);
        hourlyRate.setOffshore(offshore);
        Journal.setStaff(hourlyRate);

        return hourlyRate;
    }

    public PieceworkRate pieceworkRate(Human human, int task, float salaryInTask, boolean offshore){
        PieceworkRate pieceworkRate = new PieceworkRate();
        pieceworkRate.setTask(task);
        pieceworkRate.setSalaryInTask(salaryInTask);
        pieceworkRate.setHuman(human);
        pieceworkRate.setOffshore(offshore);
        Journal.setStaff(pieceworkRate);

        return pieceworkRate;
    }


}
