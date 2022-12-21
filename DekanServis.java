package servis;

import model.Dekan;

import java.util.Scanner;

public class DekanServis extends HumanServis {
    public Dekan crateDekan() {
        Scanner sc = new Scanner(System.in);
        Dekan dekan = new Dekan();

        System.out.println("Dekan enter your byudjet");
        dekan.setByudje(sc.nextInt());
        super.createHuman(dekan);

        return dekan;
    }
}