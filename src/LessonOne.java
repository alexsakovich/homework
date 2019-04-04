public class LessonOne {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println(" ");
        System.out.println("Задайте высоту, длину и ширину прямоугольного параллелепипеда и найти его площадь.\n" +
                "Узнайте, что больше: ширина или высота и выведите информацию об этом в консоль.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int hght = 8, lngth = 6, wdth = 15, sqr;
        int hghstsd;
        sqr = 2 * (hght * lngth + hght * wdth + lngth * wdth);
        System.out.println("Высота: " + hght + "\nДлина: " + lngth + "\nШирина: " + wdth);
        System.out.println(" ");
        System.out.println("Площадь прямоугольного параллелепипеда: " + sqr);
        System.out.println(" ");
        if ((hght > wdth)) {
            System.out.println("Высота больше ширины");
        } else if ((hght < wdth)) {
            System.out.println("Высота меньше ширины");
        } else {
            System.out.println("Высота равна ширине");
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 2");
        System.out.println(" ");
        System.out.println("На садовом участке площадью 10 соток , разбили грядки 15 на 25 метров.\nСколько м2 осталось незанято?");
        System.out.println(" ");
        System.out.println("Решение");
        System.out.println(" ");
        int Sarea;
        Sarea = 10 * 100;
        int Sgarden;
        Sgarden = 15 * 25;
        int frspc;
        frspc = Sarea - Sgarden;
        System.out.println(frspc + " м2 осталось незанято");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 3");
        System.out.println(" ");
        System.out.println("Найдите площадь овального кольца, полученного из овала площадью 15 дм2 вырезанием овала площадью 600 см2.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int Svl = 15 * 100; //площадь овала в cм
        int Svl2 = 600; //площадь вырезанного овала в cм
        System.out.println("Площадь овального кольца = " + (Svl - Svl2) + " см");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 4");
        System.out.println(" ");
        System.out.println("Вывести в консоль ближайшее к 10 из двух чисел, записанных в переменные m и n.\n" +
                "Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.\n" +
                "Метод Math.abs(n) возвращает абсолютное значение числа (модуль числа).");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int a = 10;
        double m = 13.50;
        double n = 5.5;
        double b = Math.abs(a - m);
        double v = Math.abs(a - n);
        if (b < v)
            System.out.println("ближайшее число к 10 " + m);
        else if (v < b)
            System.out.println("ближайшее число к 10 " + n);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 5");
        System.out.println(" ");
        System.out.println("В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить\n" +
                "и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        double a1 = 1;
        double b1 = -5;
        double c = 6;
        byte n1 = 0;
        double x;
        double x1;
        double x2;
        double d = (b1 * b1) - (4 * a1 * c); //значение дискриминанта
        if (d > n1) {
            double dsqrt = Math.sqrt(d);
            x1 = ((-1 * b1) - dsqrt) / (2 * a1);
            x2 = ((-1 * b1) + dsqrt) / (2 * a1);
            System.out.println("Уравнение имеет 2 квадратных корня: " + x1 + " и " + x2);
        } else {
            if (d == n1) {
                x = (-1 * b1) / (2 * a1);
                System.out.println("Уравнение имеет 1 квадратный корень: " + x);
            } else {
                if (d < n1) {
                    System.out.println("Уравнение не имеет квадратных корней");
                }
            }

        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 6");
        System.out.println(" ");
        System.out.println("Создать программу, выводящую в консоль наибольшую цифру любого трехзначного натурального числа.\n" +
                "Примеры работы программы:\n" +
                "В числе 208 наибольшая цифра 8\n" +
                "В числе 774 наибольшая цифра 7\n" +
                "В числе 613 наибольшая цифра 6");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int f = 567;
        int f1 = f / 100;
        int f2 = f % 100 / 10;
        int f3 = f % 10;
        System.out.println("Исходное число: " + f);
        System.out.println(" ");
        if ((f1 >= f2) && (f1 >= f3))
            System.out.println("Cамое большое число: " + f1);
        else if ((f2 >= f1) && (f2 >= f3))
            System.out.println("Cамое большое число: " + f2);
        else if ((f3 >= f1) && (f3 >= f2))
            System.out.println("Cамое большое число: " + f3);
    }
}