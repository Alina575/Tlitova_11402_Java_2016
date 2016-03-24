package tests;

import classes.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alina Tlitova
 *         11-402
 *         010
 */

@Configuration
@ComponentScan(basePackages = {"ru.kpfu.itis.alina.tests"})
public class Config {

    @Bean
    Driver driver() {
        return new Driver("Сергей", 22, 85);
    }

    @Bean
    AgriculturalMachinery am() {
        return new AgriculturalMachinery("Трактор", 5000, driver());
    }

    @Bean
    AnimalDrawnCart adc() {
        return new AnimalDrawnCart(driver(), 100, 1);
    }

    @Bean
    Auto a() {
        return new Auto(driver(), 2, 2000);
    }

    @Bean
    Bike b() {
        return new Bike(driver(), "Велосипед", 2);
    }

    @Bean
    Bus bus() {
        return new Bus("Автобус", driver(), 20);
    }

    @Bean
    Lorry lorry() {
        return new Lorry("КамАЗ", driver(), 5000);
    }

    @Bean
    MechanicalVehicle mv() {
        return new Auto(driver(), 2, 2000);
    }

    @Bean
    Moto moto() {
        return new Moto(driver(), 1, 1000);
    }

    @Bean
    Pedestrian pedestrian() {
        return new Pedestrian("Сергей", 22, 85);
    }

    @Bean
    SpecialServiceAuto ssa() {
        return new SpecialServiceAuto("Скорая медицинская помощь", 2000, driver());
    }

    @Bean
    Train train() {
        return new Train(driver(), 100, 3);
    }

    @Bean
    Tram tram() {
        return new Tram(driver(), 40, 10000);
    }
}
