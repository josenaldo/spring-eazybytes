package br.com.josenaldo.car.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VehicleService {

    private final Tyres tyres;

    private final Speakers speakers;

    public VehicleService(Tyres tyres, Speakers speakers) {
        this.tyres = tyres;
        this.speakers = speakers;
    }

    public void move() {
        System.out.println("    VehicleService moving the vehicle...");
        tyres.rotate();
    }

    public void playMusic() {
        System.out.println("    VehicleService playing music...");
        speakers.makeSound();
    }
}
