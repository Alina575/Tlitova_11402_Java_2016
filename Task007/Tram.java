package ru.kpfu.itis.alina.task007;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

@Component
public class Tram extends MechanicalVehicle implements AirConditionable {
    @Autowired
    private Driver driver;
    private int passengersCount;
    private int weight;

    public Tram(){}

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

    public Tram(Driver driver, int passengersCount, int weight) {
        this.driver = driver;
        this.passengersCount = passengersCount;
        this.weight = weight;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Трамвай. Водитель - " + driver.getName() +
                ". Количество пассажиров - " + passengersCount
                + ". Вес трамвая - " + weight + " кг. Поехали!");
    }

    @Override
    public void turnOnAirCond(int speed) {
        System.out.println("Кондиционер включен на скорости " + speed);
    }

    @Override
    public void turnOffAirCond(boolean status) {
        if (!status) {
            System.out.println("Кондиционер выключен.");
        } else {
            System.out.println("Вы не включали кондиционер!");
        }
    }

    @Override
    public void lowerAirCond(int c) {
        System.out.println("Уменьшили подачу воздуха на " + c + " деление(-я).");
    }

    @Override
    public void enhanceAirCond(int c) {
        System.out.println("Уменьшили подачу воздуха на " + c + " деление(-я).");
    }

}
