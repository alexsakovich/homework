package LessonFourFigure;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args)
            throws java.io.IOException {
        Scanner in = new Scanner(System.in);
        char choice;
        System.out.println("Выберите фигуру:");
        System.out.println("1. Прямоугольник");
        System.out.println("2. Треугольник");
        System.out.println("3. Круг");

        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                Rectangle rectangle1 = new Rectangle();
                System.out.println("Введите длину");
                rectangle1.setLength(in.nextDouble());
                System.out.println("Введите ширину");
                rectangle1.setWidth(in.nextDouble());
                double rectangle1area = rectangle1.area();
                System.out.println("Площадь прямоугольника " + rectangle1area);
                double rectangle1perimeter = rectangle1.perimeter();
                System.out.println("Периметр прямоугольника " + rectangle1perimeter);
                break;
            case '2':
                Triangle triangle1 = new Triangle();
                System.out.println("Введите сторону 1");
                triangle1.setA(in.nextDouble());
                System.out.println("Введите сторону 2");
                triangle1.setB(in.nextDouble());
                System.out.println("Введите сторону 3");
                triangle1.setC(in.nextDouble());
                double triangle1area = triangle1.area();
                System.out.println("Площадь треугольника " + triangle1area);
                triangle1.perimeter();
                break;
            case '3':
                Circle circle1 = new Circle();
                System.out.println("Введите радиус");
                circle1.setRadius(in.nextDouble());
                System.out.println("Периметр кргуа " + circle1.perimeter());
                break;
            default:
                System.out.println("Фигура не выбрана");
        }
    }
}