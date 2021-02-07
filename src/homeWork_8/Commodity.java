package homeWork_8;

import java.util.Comparator;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private int length;
    private int width;
    private int weight;


    public Commodity(String name, int length, int width, int weight) {
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nCommodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                "}";
    }


    @Override
    public int compareTo(Commodity c) {
        return this.name.compareTo(c.name);
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
