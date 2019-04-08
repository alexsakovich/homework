package LessonFour;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Введите длину одной из сторон прямоугольника");
        rectangle1.setLength(in.nextDouble());
        System.out.println("Введите ширину одной из сторон прямоугольника");
        rectangle1.setWidth(in.nextDouble());
        rectangle1.square();
        rectangle1.perimeter();
    }
}