package ru.kpfu.itis.alina.task007;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

@Component
public class Bike implements SpeedChangable {
    @Autowired
    private Driver driver;
    private String type;
    private int wheelsCount;

    public Bike(){}

    public Driver getDriver() {
        return driver;
    }

    public String getType() {
        return type;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Bike(Driver driver, String type, int wheelsCount) {
        this.driver = driver;
        this.type = type;
        this.wheelsCount = wheelsCount;
    }

    public void bikeInfo() {
        System.out.println("Велосипед. Тип - " + type +
                ". Водитель - " + driver.getName() +
                ". Количество колёс - " + wheelsCount + ". Поехали!");
    }

    @Override
    public void speed(int speed) {
        System.out.println("Скорость - " + speed + " км/ч");
    }

    @Override
    public void lowerSpeed(int speed) {
        System.out.println("Скорость уменьшена на " + speed + " км/ч");
    }

    @Override
    public void enhanceSpeed(int speed) {
        System.out.println("Скорость увеличена на " + speed + " км/ч");
    }

    @Override
    public void stop(boolean p) {
        if (!p) {
            System.out.println("Приехали!");
        } else {
            System.out.println("И так стояли на месте!");
        }
    }
}
