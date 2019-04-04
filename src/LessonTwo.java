public class LessonTwo {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(" ");
        System.out.println("В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.\n" +
                "Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность\n" +
                "a, b и c оказалась строго возрастающей.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int a = 10, b = 20, c = 5;
        if (a < b && a < c) {
            if (b < c) System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        } else if (b < a && b < c) {
            if (a < c) System.out.println(b + " " + a + " " + c);
            else System.out.println(b + " " + c + " " + a);
        } else if (c < a && c < b) {
            if (a < b) System.out.println(c + " " + a + " " + b);
            else System.out.println(c + " " + b + " " + a);
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 2");
        System.out.println(" ");
        System.out.println("Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        for (int i = 90; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 3");
        System.out.println(" ");
        System.out.println("Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        for (int i = 0, x = 2; i < 20; i++, x *= 2) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 4");
        System.out.println(" ");
        System.out.println("Проверьте, является ли натуральное число — простым.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int myNumber = 3;
        System.out.println("Исходное число: " + myNumber);
        System.out.println(" ");
        for (int i = 2; i < myNumber; i++) {
            if (myNumber % 2 == 0) {
                System.out.println("Число сотавное");
                break;
            } else {
                System.out.println("Число простое");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 5");
        System.out.println(" ");
        System.out.println("Выведите на экран первые 11 членов последоветельности Фибоначчи. Первый и второй члены последовательности  равны\n" +
                "единицам, а каждый следующий - сумме двух предыдущих.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int fNumber1 = 1, fNumber2 = 1, fNumber3 = 0;
        for (int i = 3; i <= 11; i++) {
            fNumber3 = fNumber1 + fNumber2;
            fNumber1 = fNumber2;
            fNumber2 = fNumber3;
            System.out.print(fNumber3 + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 6");
        System.out.println(" ");
        System.out.println("В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает\n" +
                "в местной типографии рулон билетов с номерами от 000001 до 999999. \"Счастливым\"  считается билетик, у которого сумма\n" +
                "первых трех цифр номера равна сумме последних трех. С помощью программы подсчитайте сколько счастливых билетов\n" +
                "в одном рулоне?*");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int luckyNumber = 0;
        for (int i = 1; i <= 999999; i++) { //проход от первого до последнего билета
            int x = i % 10 + (i / 10) % 10 + (i / 100) % 10;
            int z = (i / 1000) % 10 + (i / 10000) % 10 + (i / 100000) % 10;
            if (x == z) luckyNumber++;
        }
        System.out.println("Рулон имеет " + luckyNumber + " счастливых билетов");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Задание 7");
        System.out.println(" ");
        System.out.println("Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что\n" +
                "слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия.");
        System.out.println(" ");
        System.out.println("Решение:");
        System.out.println(" ");
        int symmetryDigits = 0;
        for (int h = 0; h < 23; h++) {
            for (int m = 0; m < 59; m++) {
                if (h / 10 % 10 == m % 10 && h % 10 == m / 10 % 10) {
                    symmetryDigits++;
                }
            }
        }
        System.out.println("Количество симметричных комбинаций: " + symmetryDigits);
    }
}