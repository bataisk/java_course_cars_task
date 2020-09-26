package org.github.onetwostory;

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
        cars
                .stream()
                .filter(car -> isModel(car, model))
                .filter(car -> {
                    car.getYearOfCreation()
                })
    }

    // Private

    private boolean checkForAge(Car car, int yearsOfExpluatation) {
        new GregorianCalendar()
        return (car.getYearOfCreation()) >
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
