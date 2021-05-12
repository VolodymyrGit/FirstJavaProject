package homeWork_11;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private int id;
    private transient int salary;
    private Salary sal;


    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, int id, int salary, Salary s) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.sal = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", sal=" + sal +
                '}';
    }
}
//    Створити клас Employee, описати даний клас наступними полями: name, id, salary.
//    Дані поля повинні бути private. Описати getters and setters.
//    Створити клас Methods де описати всього два методи serialize() and deserealize().
//        1).Створити метод Main створити екземпляр класу Employee і провести сереалізацію та
//        десереалізацію. Результат Десереалізації вивести на консоль.
//        2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію.
//        Результат вивести на екран.
//        3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
//        4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.