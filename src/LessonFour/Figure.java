package LessonFour;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args)
            throws java.io.IOException {
        Scanner in = new Scanner(System.in);
        char choice;
        System.out.println("Выберите фигуру:");
        System.out.println("1. Прямоугольник");
        System.out.println("2. Треугольник");

        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                Rectangle rectangle1 = new Rectangle();
                System.out.println("Введите длину");
                rectangle1.setLength(in.nextDouble());
                System.out.println("Введите ширину");
                rectangle1.setWidth(in.nextDouble());
                rectangle1.area();
                rectangle1.perimeter();
                break;
            case '2':
                Triangle triangle1 = new Triangle();
                System.out.println("Введите сторону 1");
                triangle1.setA(in.nextDouble());
                System.out.println("Введите сторону 2");
                triangle1.setB(in.nextDouble());
                System.out.println("Введите сторону 3");
                triangle1.setC(in.nextDouble());
                double trianglearea1 = triangle1.area();
                System.out.println("Площадь треугольника " + trianglearea1);
                triangle1.perimeter();
                break;
                default:
                    System.out.println("Фигура не выбрана");
        }
    }
}