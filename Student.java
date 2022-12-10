package model;

public class Student {

    private String firstName;
    private String lastName;
    private int year = 2022;
    private double mark;
    private boolean isArmenian;
    private char gender = '?';

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1905 && year <= 2022)
            this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 100)
            this.mark = mark;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        switch (gender) {
            case 'F':
            case 'f':
            case 'M':
            case 'm':
                this.gender = gender;
                break;
        }
    }

    public void printInfo() {
        System.out.println(firstName
                + " " + lastName
                + ", born in " + year
                + ", mark is " + mark
                + (isArmenian ? ", is Armenian" : ", is not Armenian")
                + ", gender " + gender);
    }
}