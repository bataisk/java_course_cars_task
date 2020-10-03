package org.github.onetwostory;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {

    // Variables

    private long id;
    private String company;
    private String model;
    private int yearOfCreation;
    private String color;
    private int price;
    private String registerNumber;

}
