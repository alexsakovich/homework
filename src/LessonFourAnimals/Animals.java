package LessonFourAnimals;

public class Animals {
    public static void main(String[] args) {
        Dog myDog1 = new Dog(15, "черный");
        myDog1.myDog();
        Dog myDog2 = new Dog("Собака", 8);
        myDog2.myDog();
        Dog myDog3 = new Dog("Собака 2", 25, 8);
        myDog3.myDog();
    }
}
