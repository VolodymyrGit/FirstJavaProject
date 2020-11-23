package homework_3;

public class MainRectangle {

    public static void main(String[] args) {

        Rectangle constructorWithSpecifiedParameters = new Rectangle();
        constructorWithSpecifiedParameters.rectangleArea();
        constructorWithSpecifiedParameters.rectanglePerimeter();

        Rectangle customConstructor = new Rectangle(20, 50);
        customConstructor.rectangleArea();
        customConstructor.rectanglePerimeter();
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