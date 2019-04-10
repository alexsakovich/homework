package LessonFourAnimals;

public class Dog {
    private String name = "неизвестно";
    private int weight = 5;
    private int age = 1;
    private String color = "неизвестен";
    private String address = "неизвестен";

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Dog(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void myDog() {
        System.out.println("Имя Вашей собаки " + name + ", она весит " + weight + " кг." + " и ее возраст составляет " + age
                + " год (года/лет). Цвет собаки: " + color + ". Адрес проживания собаки: " + address + ".");
    }

}
