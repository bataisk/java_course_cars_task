package org.github.onetwostory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarChoose cars = new CarChoose(CarsFactory.createCarsList());

        System.out.println(cars.chooseByCompany("Deo"));
        System.out.println(cars.chooseByModelAndExpluatation("ML-240", 3));
        System.out.println(cars.chooseByYearAndPrice(2000, 20000));

    }
}
