package homeWork_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Methods {

    public static void serialize(Employee employee) {

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Laptop\\Desktop\\FirstJavaProject\\serialization-hw11.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employee);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void serializeCollection(List<Employee> employees) {

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Laptop\\Desktop\\FirstJavaProject\\serialization-hw11.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employees);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void deserialize() {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\Laptop\\Desktop\\FirstJavaProject\\serialization-hw11.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Employee employee =(Employee) ois.readObject();

            System.out.println(employee);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void deserializeCollection() {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\Laptop\\Desktop\\FirstJavaProject\\serialization-hw11.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            List<Employee> employees = (ArrayList<Employee>) ois.readObject();

            employees.forEach(e -> System.out.println(e));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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