import java.util.Arrays;

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
                x++;
            }
        }
        System.out.println(Arrays.toString(myArr));
    }
}