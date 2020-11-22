package homework_3;

public class Circle {
    private double radius;
    private double diameter;


    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public void circleArea() {
        double area = Math.PI * Math.pow(this.diameter, 2) / 4;
        System.out.println("Площа кола = " + area);
    }

    public void circleLength() {
        double length = 2 * Math.PI * this.radius;
        System.out.println("Довжина кола = " + length);
    }
}
//  Створити клас Коло. Описати його двома полями: радіус , діаметр.
//  Введений може бути дробовим.
//  Написати два методи які будуть виводити на екран площу кола і довжину кола.
//  Для площі використати параметр - діаметр.
//  Для довжини кола використати радіус.