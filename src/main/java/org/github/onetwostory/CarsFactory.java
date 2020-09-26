package org.github.onetwostory;

import java.util.*;

public class CarsFactory {
    public static List<Car> createCarsList() {
        List<Car> result = new ArrayList<>();
        result.add(new Car(1414124, "Mersedes", "ML-240",2000, "Purple", 12000, "AM231"));
        result.add(new Car(8765433, "Deo", "Lanos", 2005,"White", 2000, "AM121"));
        result.add(new Car(1231314, "Toyota", "Prado", 2018, "Black", 60000, "AM931"));
        result.add(new Car(7868672, "Mersedes", "AM-130", 2010, "Purple", 24000, "AM321"));
        result.add(new Car(6546546, "Deo", "Matis",2010, "Red", 3000, "AM231"));
        result.add(new Car(2352342, "Mersedes", "ML-240", 2019,"Black", 12000, "AM342"));

        return result;
    }
}
