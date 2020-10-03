package org.github.onetwostory;

import java.util.*;

public class CarsFactory {
    public static List<Car> createCarsList() {
        List<Car> result = new ArrayList<>();
        result.add(new Car(1414124, "Nissan", "SENTRA", 2004, "Purple",
                12000, "L-934U"));
        result.add(new Car(9871263, "Nissan", "GT-R", 2018, "White",
                210000, "L-154P"));
        result.add(new Car(2876269, "Nissan", "Maxima", 2019, "Black",
                70000, "L-752H"));
        result.add(new Car(8765433, "Sterling Truck", "CONDOR", 2002, "White",
                8000, "L-4758"));
        result.add(new Car(1231314, "Hyosung", "GT250R", 2002, "Black",
                60000, "L-588f"));
        result.add(new Car(7868672, "Arctic Cat", "M 8000 ROB KINCAID SE", 2002, "Purple",
                45000, "L-548c"));
        result.add(new Car(6546546, "BMW", "428I XDRIVE", 2002, "Red",
                90000, "L-919M"));
        result.add(new Car(2352342, "Kawasaki", "JH1100 ULTRA 130", 2002, "Black",
                16000, "L-871A"));

        return result;
    }
}
