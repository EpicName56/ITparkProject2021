package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();

        int numbers = 100;

        for (int i = 0; i <= numbers; i++) {
            String workerName = "Сотрудник №" + i;
            int occupationalLife = (int) Math.round(Math.random() * 10) + 1;
            int employeeID = i + 1;
            employee.add(new Employee(workerName, employeeID, occupationalLife));
        }

        long workAge = 3;

        System.out.println("Вывод списка сотрудников с опытом работы: " + workAge);

        ListIterator<Employee> employeeIterator = employee.listIterator();
        while (employeeIterator.hasNext()) {
            Employee item = employeeIterator.next();
            if (item.getOccupationalLife() == workAge)
                System.out.println(employeeIterator.nextIndex() + ". " + item);
        }

        System.out.println("");
        System.out.println("Вывод оставшихся сотрудников: ");


        if (employeeIterator.nextIndex() % 2 != 0) employeeIterator.remove();
        while (employeeIterator.hasPrevious()) {
            employeeIterator.previous();
            employeeIterator.previous();
            employeeIterator.remove();
        }

        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }

    }
}