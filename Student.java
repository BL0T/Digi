package model;

public class Student extends Human {

    private double mark;

    public Student() {
    }

    public Student(String firstName, String lastName, int year, boolean isArmenian, char gender, double mark) {
        super(firstName, lastName, year, isArmenian, gender);
        this.mark = mark;
    }


    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 100)
            this.mark = mark;
    }


    public void printInfo() {
        super.printInfo();
        System.out.println("mark: " + mark);
    }
}