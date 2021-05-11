package homeWork_11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Bob", 1, 1000);

        Methods.serialize(employee);
        Methods.deserialize();
        System.out.println();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mike", 2, 1100));
        employees.add(new Employee("Jack", 3, 1200));
        employees.add(new Employee("Pit", 4, 1150));

        Methods.serializeCollection(employees);
        Methods.deserializeCollection();
        System.out.println();

        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee("Mike", 2, 1100, new Salary(1500)));
        employees1.add(new Employee("Jack", 3, 1200, new Salary(1800)));
        employees1.add(new Employee("Pit", 4, 1150, new Salary(1700)));

        Methods.serializeCollection(employees1);
        Methods.deserializeCollection();
    }
}
//    Створити клас Employee, описати даний клас наступними полями: name, id, salary.
//    Дані поля повинні бути private. Описати getters and setters.
//    Створити клас Methods де описати всього два методи serialize() and deserealize().
//        1).Створити метод Main.
//              Створити екземпляр класу Employee і провести сереалізацію та
//              десереалізацію. Результат Десереалізації вивести на консоль.
//        2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію.
//              Результат вивести на екран.
//        3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
//        4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.