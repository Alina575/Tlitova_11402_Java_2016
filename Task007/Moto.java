package ru.kpfu.itis.alina.task007;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

@Component
public class Moto extends MechanicalVehicle {
    @Autowired
    private Driver driver;
    private int passengersCount;
    private int weight;

    public Moto(){}

    @Override
    public Driver getDriver() {
        return driver;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public Moto(Driver driver, int passengersCount, int weight) {
        this.driver = driver;
        this.passengersCount = passengersCount;
        this.weight = weight;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Мотоцикл. Водитель - " + driver.getName() +
                ". Количество пассажиров - " + passengersCount
                + ". Вес мотоцикла - " + weight + " кг. Поехали!");
    }
}
