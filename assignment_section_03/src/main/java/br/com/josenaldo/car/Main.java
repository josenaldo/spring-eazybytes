package br.com.josenaldo.car;


import br.com.josenaldo.car.beans.Person;
import br.com.josenaldo.car.beans.Vehicle;
import br.com.josenaldo.car.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person defaultPerson = context.getBean(Person.class);
        defaultPerson.startDrive();

        System.out.println("========================================");

        Vehicle opala = context.getBean("opala", Vehicle.class);
        Person pedro = new Person("Pedro", opala);
        pedro.startDrive();

        System.out.println("========================================");

        Vehicle uno = context.getBean("uno", Vehicle.class);
        Person maria = new Person("Maria", uno);
        maria.startDrive();

        System.out.println("========================================");
        System.out.println("Done!");
    }
}