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
        final List<Car> nissan = cars.chooseByCompany("Nissan");
        nissan.stream()
                .forEach(carTest -> {
                    final String company = carTest.getCompany();
                    Assert.assertEquals(company, "Nissan");
                });
    }

    @org.junit.Test
    public void chooseByModelAndExpluatation() {
        final List<Car> cars = this.cars.chooseByModelAndExpluatation("GT-R", 1);
        Assert.assertEquals(9871263L, cars.get(0).getId());
    }

    @org.junit.Test
    public void chooseByYearAndPrice() {
        final List<Car> cars = this.cars.chooseByYearAndPrice(2002, 20000);
        Assert.assertEquals(2, cars.size());
    }
}