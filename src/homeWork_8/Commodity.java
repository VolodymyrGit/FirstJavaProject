package homeWork_8;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private double length;
    private double width;
    private double weight;

    public Commodity() {}

    public Commodity(String name, double length, double width, double weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                "}\n";
    }


    @Override
    public int compareTo(Commodity c) {
        return (int) (this.length - c.length);
        return
    }


}
//  Реалізовуємо консольну програму. Створити клас Commodity. Описати даний клас: поля методи.
//  Повинні бути такі методи:
//  Додати товар
//  Видалити товар
//  Замінити товар
//  Сортувати за назвоню
//  Сортувати за довжиною
//  Сортувати за шириною
//  Сортувати за вагою
//  Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
//  Вийти з програми(підказка System.exit)
//  Для меню використати Switch.
