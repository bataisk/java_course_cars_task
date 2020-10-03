package org.github.onetwostory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarChoose cars = new CarChoose(CarsFactory.createCarsList());

        System.out.println(cars.chooseByCompany("Nissan"));
        System.out.println(cars.chooseByModelAndExpluatation("GT-R", 1));
        System.out.println(cars.chooseByYearAndPrice(2002, 20000));

    }
}
