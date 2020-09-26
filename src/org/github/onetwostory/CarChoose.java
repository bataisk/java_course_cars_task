package org.github.onetwostory;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class CarChoose {

    private final List<Car> cars;

    public CarChoose(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> chooseByCompany(String company) {
        final List<Car> byCompany = cars
                .stream()
                .filter(car -> belongsToCompany(car, company))
                .collect(Collectors.toList());

        return byCompany;
    }

    public List<Car> chooseByModelAndExpluatation(String model, int yearsOfExpluatation) {
        final List<Car> byModelAndYear = cars
                .stream()
                .filter(car -> isModel(car, model))
                .filter(car -> checkForAge(car, yearsOfExpluatation))
                .collect(Collectors.toList());
        return byModelAndYear;
    }

    public List<Car> chooseByYearAndPrice(int year, int price) {
        final List<Car> byYearAndPrice = cars
                .stream()
                .filter(car -> checkforEqualsAge(car, year))
                .filter(car -> checkForBiggerPrice(car, price))
                .collect(Collectors.toList());
        return byYearAndPrice;
    }

    // Private

    private boolean checkForBiggerPrice(Car car, int price) {
        return car.getPrice() > price;
    }

    private boolean checkforEqualsAge(Car car, int year) {
        final int yearNow = new GregorianCalendar().get(Calendar.YEAR);
        return car.getYearOfCreation() == yearNow;
    }

    private boolean checkForAge(Car car, int yearsOfExpluatation) {
        final int yearNow = new GregorianCalendar().get(Calendar.YEAR);
        return ((car.getYearOfCreation() + yearsOfExpluatation) < yearNow);
    }

    private boolean isModel(Car car, String model) {
        return car
                .getModel()
                .toUpperCase()
                .trim()
                .equals(model
                        .trim()
                        .toUpperCase());
    }

    private boolean belongsToCompany(Car car, String company) {
        return car
                .getCompany()
                .trim()
                .toUpperCase()
                .equals(company
                        .trim()
                        .toUpperCase());
    }

}
