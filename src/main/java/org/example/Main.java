package org.example;

import org.example.core.*;
import org.example.core.employees.Employee;
import org.example.core.employees.FixedRate;
import org.example.core.employees.HourlyRate;
import org.example.core.employees.Staff;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *Задание 1
 * Разработать и протестировать набор классов для решения задачи подсчета зароботной платы сотрудников некоторой фирмы.
 * На фирме есть несколько способов оплаты труда:
 * ■ ставка – указывается, сколько сотрудник получает за
 * рабочий день; для каждого сотрудника записывается,
 * сколько дней он отработал в месяце;
 * ■ почасовая – указывается, сколько сотрудник получает в
 * час, для каждого сотрудника; записывается, сколько часов
 * он отработал в месяце
 * ■ сдельная – указывается, сколько сотрудник получит за
 * выполненнуюработу; для каждогосотрудника записываются
 * суммы для каждой работы, что он успел сделать за месяц.
 * Программа должна уметь выводить отчет по всем сотрудникам фирмы о заработной плате в виде:
 * ФИО      Вид оплаты  Сумма
 * Иванов   ставка      3000 грн
 * Сидоров  почасовая   800 грн
 * Петров   сдельная    5500 грн
 * Итого                9300 грн
 */

public class Main {
    public static void main(String[] args) {
        HourlyRate employee = new HourlyRate("Ivan", "Иванов", "Иванович",20,200);
        Staff staffMember = new Staff("Oleg","Иванов", "Иванович",40000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(staffMember);

        Company company = new Company(employees);

        System.out.println(company.calcSalary());
        MyArray<Employee> employeeMyArray = new MyArray<>(employees);

        Employee employee1 = employeeMyArray.findMax(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.compareTo(o2);
            }
        });
    }
}