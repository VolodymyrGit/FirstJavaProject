package homework_3;

public class Rectangle {
    private int length;
    private int width;


    public Rectangle() {
        this.length = 10;
        this.width = 4;
        System.out.println("Rectangle Methods With Demo Constructor");
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Rectangle Methods With Custom Constructor");
    }

    public void area() {
        int square = this.length * this.width;
        System.out.println("Площа прямокутника = " + square);
    }

    public void perimeter () {
        int perimeter = (this.length + this.width) * 2;
        System.out.println("Периметр прямокутника = " + perimeter + "\n");
    }
}
//  Описати клас Rectangle , в якому буде описано поля : довжина, ширина.
//  Описати дані поля в конструкторі. Створити конструктор з параметрами і без параметрів.
//  В конструкторі без параметрів описати свої дані.
//  Тобто створюючи об’єкт, за вибору даного конструктору, ви отримаєте прямокутник даного розміру.
//  Написати методи, які будуть розраховувати площу та периметр.
//  В Main класі продемонструвати створення об’єктів використовуючи два конструктори.
//  Вивести на консоль площу і периметр прямокутника.
//  Вивід на консолі повинен мати наступний вигляд: «Площа прямокутника = … », «Периметр прямокутника = … » .
