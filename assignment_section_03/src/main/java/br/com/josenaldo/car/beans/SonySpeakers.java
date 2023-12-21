package br.com.josenaldo.car.beans;

public class SonySpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("        Playing music with Sony speakers");
    }
}
