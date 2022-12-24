package model;

public class Plane {

    private String model = "?";
    private String country = "?";
    private int year = 2021;
    private int hours;
    private boolean military;
    private int weight = 10_000;
    private int wingspan = 10;
    private int topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, int hours, boolean military, int weight, int wingspan, int topSpeed, int seats, double cost) {
        setModel(model);
        setCountry(country);
        setYear(year);
        setHours(hours);
        setMilitary(military);
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2021) this.year = 2021;
        else if (year >= 1903) this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 10000) this.hours = 10000;
        if (hours >= 0) this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 160_000) this.weight = 160_000;
        else if (weight >= 10_000) this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 45) this.wingspan = 45;
        else if (wingspan >= 10) this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 1000) this.topSpeed = 1000;
        else if (topSpeed >= 0) this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0)
            this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (year >= 0)
            this.cost = cost;
    }
}