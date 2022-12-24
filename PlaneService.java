package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane cratePlane() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter model");
        String model = sc.next();

        System.out.println("enter country");
        String country = sc.next();

        System.out.println("enter year");
        int year = sc.nextInt();

        System.out.println("enter hours");
        int hours = sc.nextInt();

        System.out.println("enter military : true/false");
        boolean military = sc.nextBoolean();

        System.out.println("enter weight");
        int weight = sc.nextInt();

        System.out.println("enter wingspan");
        int wingspan = sc.nextInt();

        System.out.println("enter topSpeed");
        int topSpeed = sc.nextInt();

        System.out.println("enter seats");
        int seats = sc.nextInt();

        System.out.println("enter cost");
        double cost = sc.nextDouble();


        return new Plane(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
    }


    public void task1(Plane p) {
        System.out.println("Plane{" +
                "model='" + p.getModel() + '\'' +
                ", country='" + p.getCountry() + '\'' +
                ", year=" + p.getYear() +
                ", hours=" + p.getHours() +
                ", military=" + p.isMilitary() +
                ", weight=" + p.getWeight() +
                ", wingspan=" + p.getWingspan() +
                ", topSpeed=" + p.getTopSpeed() +
                ", seats=" + p.getSeats() +
                ", cost=" + p.getCost() +
                '}');
    }

    public void task2(Plane p) {
        System.out.println(p.isMilitary() ?
                "coast=" + p.getCost() + ", top speed=" + p.getTopSpeed() :
                "model=" + p.getModel() + ", country=" + p.getCountry()
        );
    }

    public Plane task3(Plane p1, Plane p2) {
        return p1.getYear() >= p2.getYear() ? p1 : p2;
    }

    public Plane task4(Plane p1, Plane p2) {
        return p1.getWingspan() > p2.getWingspan() ? p1 : p2;
    }

    public Plane task5(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() <= p2.getSeats() && p1.getSeats() <= p3.getSeats())
            return p1;
        return p2.getSeats() <= p3.getSeats() ? p2 : p3;
    }

    public void task6(Plane[] arr) {
        for (Plane plane : arr) {
            if (!plane.isMilitary()) task1(plane);
        }
    }

    public void task7(Plane[] arr) {
        for (Plane plane : arr) {
            if (plane.isMilitary() && plane.getHours() > 100) task1(plane);
        }
    }

    public Plane task8(Plane[] arr) {
        Plane plane = arr[0];
        for (Plane p : arr) {
            if (plane.getWeight() >= p.getWeight())
                plane = p;
        }

        return plane;
    }

    public Plane task9(Plane[] arr) {
        Plane plane = null;

        for (Plane p : arr) {
            if (p.isMilitary() && (plane == null || plane.getCost() > p.getCost()))
                plane = p;
        }

        return plane;
    }

    public Plane[] task10(Plane[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].getYear() > arr[j - 1].getYear()) {
                    Plane p = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = p;
                }
            }
        }

        return arr;
    }


}




















