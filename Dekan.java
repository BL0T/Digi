package model;

public class Dekan extends Human {

    private int byudje;

    public Dekan() {
    }

    public Dekan(String firstName, String lastName, int year, boolean isArmenian, char gender, int byudje) {
        super(firstName, lastName, year, isArmenian, gender);
        this.byudje = byudje;
    }

    public int getByudje() {
        return byudje;
    }

    public void setByudje(int byudje) {
        this.byudje = byudje;
    }

    public double getMark() {
        return byudje;
    }

    public void setMark(int byudje) {
        this.byudje = byudje;
    }


    public void printInfo() {
        super.printInfo();
        System.out.println("byudje: " + byudje);
    }
}