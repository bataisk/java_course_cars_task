package org.github.onetwostory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    // Variables

    private long id;
    private String company;
    private String model;
    private int yearOfCreation;
    private String color;
    private int price;
    private String registerNumber;

    /*
    // Constructors

    public Car() {
    }

    public Car(long id, String company, String model, String color, int price, String registerNumber, int yearOfCreation) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
        this.yearOfCreation = yearOfCreation;
    }

    // Public


    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

*/

}
