package model;

public class Teacher extends Human {

    private int ashxatavardz;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, int year, boolean isArmenian, char gender, int ashxatavardz) {
        super(firstName, lastName, year, isArmenian, gender);
        this.ashxatavardz = ashxatavardz;
    }


    public int getAshxatavardz() {
        return ashxatavardz;
    }

    public void setAshxatavardz(int ashxatavardz) {
        this.ashxatavardz = ashxatavardz;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("ashxatavardz: " + ashxatavardz);
    }
}