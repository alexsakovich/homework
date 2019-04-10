package LessonFourAnimals;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strenght) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean pawFight(Cat anotherCat) {
        if (this.strength > anotherCat.strength)
            return true;
        else
            return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
