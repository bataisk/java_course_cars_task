package org.github.onetwostory;

import java.util.*;

public class CarsFactory {
    public static List<Car> createCarsList() {
        List<Car> result = new ArrayList<>();
        result.add(new Car(1414124, "Mersedes", "ML-240", "Purple", 12000, "AM231", 2000));
        result.add(new Car(8765433, "Deo", "Lanos", "White", 2000, "AM121", 2015));
        result.add(new Car(1231314, "Tayota", "Prado", "Black", 60000, "AM931", 2018));
        result.add(new Car(7868672, "Mersedes", "AM-130", "Purple", 24000, "AM321", 2010));
        result.add(new Car(6546546, "Deo", "Matis", "Red", 3000, "AM231", 2011));
        result.add(new Car(2352342, "Mersedes", "ML-240", "Black", 12000, "AM342", 2019));

        return result;
    }
}
