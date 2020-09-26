package org.github.onetwostory;

import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.*;

public class CarChooseTest {

    private CarChoose cars;

    @org.junit.Before
    public void setUp() throws Exception {
        cars = new CarChoose(CarsFactory.createCarsList());
    }

    @org.junit.Test
    public void chooseByCompany() {
        final List<Car> deo = cars.chooseByCompany("Deo");
        deo.stream()
                .forEach(carTest -> {
                    final String company = carTest.getCompany().toUpperCase();
                    Assert.assertEquals(company, "DEO");
                });

    }

    @org.junit.Test
    public void chooseByModelAndExpluatation() {
        final List<Car> cars = this.cars.chooseByModelAndExpluatation("ML-240", 3);


    }

    @org.junit.Test
    public void chooseByYearAndPrice() {
    }
}