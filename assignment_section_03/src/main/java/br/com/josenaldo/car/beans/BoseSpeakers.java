package br.com.josenaldo.car.beans;

public class BoseSpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("        Playing music with Bose speakers");
    }
}
