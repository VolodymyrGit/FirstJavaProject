package Homeork_3;

public class Rectangle {
    private int length;
    private int width;


    public Rectangle() {
        this.length = 10;
        this.width = 4;
        int square = length * width;
        System.out.println("Площа прямокутника = " + square);
        int perimeter = (length + width) * 2;
        System.out.println("Периметр прямокутника = " + perimeter + "\n");
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        int square = length * width;
        System.out.println("Площа прямокутника = " + square);
        int perimeter = (length + width) * 2;
        System.out.println("Периметр прямокутника = " + perimeter + "\n");
    }
}
