package model;

public class Animal {

    private String name = "?";
    private int age;
    private int weight;
    private boolean pet;

    public Animal(String name, int age, int weight, boolean pet) {
        this.name = name;
        if (age >= 0 && age < 100) {
            this.age = age;
        }
        if (weight >= 0 && weight < 1000) {
            this.weight = weight;
        }
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isPet() {
        return pet;
    }
}
