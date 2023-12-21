package br.com.josenaldo.car.config;

import br.com.josenaldo.car.beans.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("br.com.josenaldo.car.beans")
public class ProjectConfig {
    @Bean
    public String name() {
        return "Josenaldo";
    }

    @Bean
    public Tyres bridgstoneTyres() {
        return new BridgestoneTyres();
    }

    @Bean("michelinTyres")
    @Primary
    public Tyres michelinTyres() {
        return new MichelinTyres();
    }

    @Bean
    @Primary
    public Speakers sonySpeakers() {
        return new SonySpeakers();
    }

    @Bean("boseSpeakers")
    public Speakers boseSpeakers() {
        return new BoseSpeakers();
    }

    @Bean
    @Primary
    public Vehicle defaultVehicle(VehicleService vehicleService) {
        return new Vehicle(vehicleService, "Default");
    }

    @Bean
    public VehicleService opalaVehicleService(@Qualifier("michelinTyres") Tyres michelinTyres, @Qualifier("boseSpeakers") Speakers boseSpeakers) {
        return new VehicleService(michelinTyres, boseSpeakers);
    }

    @Bean
    VehicleService unoVehicleService(@Qualifier("bridgstoneTyres") Tyres bridgstoneTyres, @Qualifier("sonySpeakers") Speakers sonySpeakers) {
        return new VehicleService(bridgstoneTyres, sonySpeakers);
    }

    @Bean
    public Vehicle opala(@Qualifier("opalaVehicleService") VehicleService opalaVehicleService) {
        return new Vehicle(opalaVehicleService, "Opala");
    }

    @Bean
    public Vehicle uno(@Qualifier("unoVehicleService") VehicleService unoVehicleService) {
        return new Vehicle(unoVehicleService, "Uno");
    }
}
