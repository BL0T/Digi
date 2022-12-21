package model;

public class Human {
    private String firstName;
    private String lastName;
    private int year = 2022;
    private boolean isArmenian;
    private char gender = '?';


    public Human() {
    }

    public Human(String firstName, String lastName, int year, boolean isArmenian, char gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setYear(year);
        setArmenian(isArmenian);
        setGender(gender);
    }

    public void printInfo() {
        System.out.print(firstName
                + " " + lastName
                + ", born in " + year
                + (isArmenian ? ", is Armenian" : ", is not Armenian")
                + ", gender " + gender + "  ");
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

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

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
        if (year > 1905 && year < 2022)
            this.year = year;
    }
}
