package org.example.views;

import org.example.core.calculatingSalaries.CalculatingSalaries;
import org.example.core.employees.Human;

import java.util.ArrayList;

public class View {

    public View() {

    }

    /**
     * task 1
     */
    public void printStuff(ArrayList<CalculatingSalaries> arrayList) {
        System.out.format("%25s%25s%15s", "ФИО", "Тип оплаты", "Сумма\n");
        float sum = 0.0f;
        for (CalculatingSalaries calculatingSalaries : arrayList) {
            System.out.format("%25s%25s%15s",
                    calculatingSalaries.getHuman(),
                    calculatingSalaries.getPaymentType(),
                    calculatingSalaries.takeSalary() + "\n");
            sum += calculatingSalaries.takeSalary();
        }
        System.out.format("%25s%25s%15s", "Итого", "", sum);
    }

    /**
     * task 2/3/4
     */
    public void printStuffTugriks(ArrayList<CalculatingSalaries> arrayList) {
        System.out.format("%25s%25s%15s%25s", "ФИО", "Налог", "Сумма", "К оплате(Рубли/Тугрики)\n");
        for (CalculatingSalaries calculatingSalaries : arrayList) {
            calculatingSalaries.tax();
            System.out.format("%25s%25s%15s%25s",
                    calculatingSalaries.getHuman(),
                    calculatingSalaries.getTax() + "%",
                    calculatingSalaries.takeSalary(),
                    calculatingSalaries.takeSalaryTax() +
                            calculatingSalaries.takeSalaryTugrik() + "\n");
        }
    }

    /**
     * task 5
     */

    public void printStuffOffshore(ArrayList<CalculatingSalaries> arrayList) {
        System.out.format("%25s%25s%15s%25s", "ФИО", "Налог", "Сумма", "К оплате(Рубли/Тугрики)\n");
        for (CalculatingSalaries calculatingSalaries : arrayList) {
            calculatingSalaries.taxOffshore();
            System.out.format("%25s%25s%15s%25s",
                    calculatingSalaries.getHuman(),
                    calculatingSalaries.getTax() + "%",
                    calculatingSalaries.takeSalary(),
                    calculatingSalaries.takeSalaryTax() +
                            calculatingSalaries.takeSalaryTugrik() + "\n");
        }
    }

    public void printStuffPrize(ArrayList<CalculatingSalaries> arrayList) {
        System.out.format("%25s%25s%15s%25s", "ФИО", "Налог", "Сумма", "К оплате(Рубли/Тугрики)\n");
        for (CalculatingSalaries calculatingSalaries : arrayList) {
            calculatingSalaries.taxOffshore();
            System.out.format("%25s%25s%15s%25s",
                    calculatingSalaries.getHuman(),
                    calculatingSalaries.getTax() + "%",
                    calculatingSalaries.takeSalary(),
                    calculatingSalaries.takeSalaryPrize() +
                            calculatingSalaries.takeSalaryTugrik() + "\n");
        }
    }
}
