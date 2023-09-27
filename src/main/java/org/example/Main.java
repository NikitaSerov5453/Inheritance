package org.example;

import org.example.core.Journal;
import org.example.core.calculatingSalaries.FixedRate;
import org.example.core.calculatingSalaries.HourlyRate;
import org.example.core.calculatingSalaries.PieceworkRate;
import org.example.core.employees.Employee;
import org.example.core.employees.Human;
import org.example.views.View;

import java.util.Arrays;

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
        View view = new View();
        Human human = new Human("Nikita", "Serov", "Andreevic", 0);
        Human human4 = new Human("Nikita", "Serov", "Andreevic", 1);
        Human human1 = new Human("a", "a", "a", 1);
        Human human2 = new Human("час", "по", "овая", 0);
        Human human3 = new Human("ль", "сде", "ная", 1);
        Employee employee = new Employee();
        FixedRate fixedRate = employee.fixRateEmployee(human, 15, 3000, true);
        FixedRate fixedRate2 = employee.fixRateEmployee(human4, 15, 3000, false);
        FixedRate fixedRate1 = employee.fixRateEmployee(human1, 14, 5000,false);
        HourlyRate hourlyRate = employee.hourlyRateEmployee(human2,201, 319.25f, false);
        PieceworkRate pieceworkRate = employee.pieceworkRate(human3, 5, 10000, true);


        view.printStuff(Journal.getStaff());
        System.out.println();
        System.out.println();
        view.printStuffTugriks(Journal.getStaff());
        System.out.println();
        System.out.println();
        view.printStuffOffshore(Journal.getStaff());
        System.out.println();
        System.out.println();
        view.printStuffPrize(Journal.getStaff());

//        Employee employee1 = employeeMyArray.findMax(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.compareTo(o2);
//            }
//        });
    }
}