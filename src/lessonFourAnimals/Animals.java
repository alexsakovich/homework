package lessonFourAnimals;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args)
            throws java.io.IOException {

        Scanner in = new Scanner(System.in);
        char choice;
        System.out.println("1. Собаки");
        System.out.println("2. Кошки");
        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                Dog myDog1 = new Dog(15, "черный");
                myDog1.myDog();
                Dog myDog2 = new Dog("Собака", 8);
                myDog2.myDog();
                break;
            case '2':
                Cat myCat1 = new Cat("cat1", 1, 2, 3);
                Cat myCat2 = new Cat("cat2", 4, 5, 6);
                System.out.println(myCat1.pawFight(myCat2));
                System.out.println(myCat2.pawFight(myCat1));
                break;
            default:
                System.out.println("Животное не выбрано");
        }
    }
}