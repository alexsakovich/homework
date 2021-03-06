import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(" ");
        System.out.println("Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, " +
                "отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int arrsize = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) arrsize++;
        }
        int[] myArr = new int[arrsize];
        for (int i = 2, x = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                myArr[x] = i;
                System.out.print(myArr[x] + " ");
                x++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println(" ");
        System.out.println("Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, " +
                "а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int arrsize2 = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) arrsize2++;
        }
        int[] myArr2 = new int[arrsize2];
        for (int i = 1, x = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                myArr2[x] = i;
                System.out.print(myArr2[x] + " ");
                x++;
            }
        }
        System.out.println(" ");
        for (int i = myArr2.length - 1; i >= 0; i--) {
            System.out.print(myArr2[i] + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        System.out.println(" ");
        System.out.println("Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. " +
                "Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int[] myArr3 = new int[15];
        int evennumber = 0;
        for (int i = 0; i < myArr3.length; i++) {
            Random x = new Random();
            myArr3[i] = x.nextInt(10);
            if (myArr3[i] > 0 && myArr3[i] % 2 == 0)
                evennumber++;
        }
        System.out.println("Все элементы массива: " + Arrays.toString(myArr3));
        System.out.println("Всего в массиве " + evennumber + " четных элементов.");
        System.out.println("Задание 4");
        System.out.println(" ");
        System.out.println("1) Найти в строке указанную подстроку и заменить ее на новую. \n" +
                "Строку, ее подстроку для замены и новую подстроку вводит пользователь. \n" +
                "\n" +
                "2) Требуется удалить из нее повторяющиеся символы и все пробелы. \n" +
                "Например, если было введено \"abc cde def\", то должно быть выведено \"abcdef\". \n" +
                "\n" +
                "3) Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. \n" +
                "Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив. \n" +
                "Например, если дана строка \"дом 48, корпус 9, парадная 7, этаж 4\", то в массиве должны оказаться числа 48, 9, 7 и 4");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для обработки:");
        StringBuilder firstString = new StringBuilder(scanner.next());

    }
}