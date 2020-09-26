package org.github.onetwostory;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Repository of cars
 */
public class CarChoose {

    // Variables

    private final List<Car> cars;

    // Constructors

    public CarChoose(List<Car> cars) {
        this.cars = cars;
    }

    // Public

    public List<Car> chooseByCompany(String company) {
        return cars
                .stream()
                .filter(car -> belongsToCompany(car, company))
                .collect(Collectors.toList());
    }

    public List<Car> chooseByModelAndExpluatation(String model, int yearsOfExpluatation) {
        return cars
                .stream()
                .filter(car -> isModel(car, model))
                .filter(car -> checkForAge(car, yearsOfExpluatation))
                .collect(Collectors.toList());
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
        return car.getYearOfCreation() == year;
    }

    private boolean checkForAge(Car car, int yearsOfExpluatation) {
        final int yearNow = new GregorianCalendar().get(Calendar.YEAR);
        return ((car.getYearOfCreation() + yearsOfExpluatation) < yearNow);
    }

    private boolean isModel(Car car, String model) {
        return car
                .getModel()
                .trim()
                .toUpperCase()
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
