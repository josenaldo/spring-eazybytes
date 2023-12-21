package br.com.josenaldo.car.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private final String name;

    private final Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }


    public void startDrive() {
        System.out.println("%s is starting to drive...".formatted(name));
        vehicle.move();
        vehicle.playMusic();
    }
}
