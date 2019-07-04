package com.example.cardisplay;

public class Car {
    private String name, seatCount, imageUrl, color, year, make, model;

    Car() {
    }

    public Car(String name, String seatCount, String imageUrl, String color, String year, String make, String model) {
        this.name = name;
        this.seatCount = seatCount;
        this.imageUrl = imageUrl;
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getSeatCount() {
        return seatCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {

        this.name = name;

    }

    public void setSeatCount(String seatCount) {
        this.seatCount = seatCount;
    }

    public void setImageUrl(String imageUrl) {

        this.imageUrl = imageUrl;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public void setYear(String year) {

        this.year = year;

    }

    public void setMake(String make) {

        this.make = make;

    }

    public void setModel(String model) {

        this.model = model;

    }

    @Override
    public String toString() {
        return "Car{" +
                "Name: '" + name + '\'' +
                ", Number of Seats '" + seatCount + '\'' +
                ",  Image: '" + imageUrl + '\'' +
                ",  Color: '" + color + '\'' +
                ",  Year: '" + year + '\'' +
                ",  Make: '" + make + '\'' +
                ",  Model: '" + model + '\'' +
                '}';
    }
}
