package service;

import model.Animal;

import java.util.Scanner;

public class AnimalService {

    public Animal crateAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter animal name");
        String name = scanner.nextLine();

        System.out.println("enter animal year");
        int age = scanner.nextInt();

        System.out.println("enter animal weight");
        int weight = scanner.nextInt();

        System.out.println("enter animal is pet true/false");
        boolean pet = scanner.nextBoolean();


        return new Animal(name, age, weight, pet);
    }

    public void printInfo(Animal animal) {
        System.out.println("name: " + animal.getName() +
                "  age: " + animal.getAge() +
                "  weight: " + animal.getWeight() +
                (animal.isPet() ? " is pet" : " is not pet")
        );
    }

    public Animal maxAge(Animal a1, Animal a2, Animal a3) {
        if (a1.getAge() > a2.getAge() && a1.getAge() > a3.getAge()) {
            return a1;
        }
        return a2.getAge() > a3.getAge() ? a2 : a3;
    }

    public Animal minAge(Animal a1, Animal a2, Animal a3) {
        if (a1.getAge() < a2.getAge() && a1.getAge() < a3.getAge()) {
            return a1;
        }
        return a2.getAge() < a3.getAge() ? a2 : a3;
    }

    public Animal minWeight(Animal a1, Animal a2, Animal a3) {
        if (a1.getWeight() < a2.getWeight() && a1.getWeight() < a3.getWeight()) {
            return a1;
        }
        return a2.getWeight() < a3.getWeight() ? a2 : a3;
    }

    public Animal maxWeight(Animal a1, Animal a2, Animal a3) {
        if (a1.getWeight() > a2.getWeight() && a1.getWeight() > a3.getWeight()) {
            return a1;
        }
        return a2.getWeight() > a3.getWeight() ? a2 : a3;
    }

    public Animal minAgePet(Animal a1, Animal a2, Animal a3) {
        if (a1.isPet() && a1.getAge() < a2.getAge() && a1.getAge() < a3.getAge())
            return a1;
        if (a2.isPet() && a2.getAge() < a3.getAge())
            return a2;
        if (a3.isPet())
            return a3;

        System.out.println("dont have pet");
        return null;
    }


}
