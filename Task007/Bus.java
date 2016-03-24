package ru.kpfu.itis.alina.task007;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

@Component
public class Bus extends MechanicalVehicle implements AirConditionable {
    private String type;
    @Autowired
    private Driver driver;
    private int passengersCount;

    public Bus(){}

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Driver getDriver() {
        return driver;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public Bus(String type, Driver driver, int passengersCount) {
        this.type = type;
        this.driver = driver;
        this.passengersCount = passengersCount;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Маршрутное транспортное средство. Тип - " + type +
                ". Водитель - " + driver.getName() +
                ". Количество пассажиров - " + passengersCount + ". Поехали!");
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
        System.out.println("Уменьшили подачу воздуха на " + c + " деления.");
    }

    @Override
    public void enhanceAirCond(int c) {
        System.out.println("Уменьшили подачу воздуха на " + c + " деления.");
    }
}
