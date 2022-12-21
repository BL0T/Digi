package servis;

import model.Human;

import java.util.Scanner;

public class HumanServis {
    public void createHuman(Human human) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your firstName");
        human.setFirstName(sc.next());
        System.out.println("enter your lastName");
        human.setLastName(sc.next());
        System.out.println("enter your year");
        human.setYear(sc.nextInt());
        System.out.println("hay es? yes or no");
        human.setArmenian(sc.next().equals("yes"));
        System.out.println("enter your gender");
        human.setGender(sc.next().charAt(0));
    }
}
