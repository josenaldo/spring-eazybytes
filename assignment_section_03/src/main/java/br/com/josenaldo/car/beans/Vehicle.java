package br.com.josenaldo.car.beans;

public class Vehicle {

    private final VehicleService vehicleService;

    private final String name;

    public Vehicle(VehicleService vehicleService, String name) {
        this.vehicleService = vehicleService;
        this.name = name;
    }

    public void move() {
        System.out.printf("%s vehicle moving...%n", name);
        vehicleService.move();
    }

    public void playMusic() {
        System.out.printf("%s vehicle playing music...%n", name);
        vehicleService.playMusic();
    }

}
