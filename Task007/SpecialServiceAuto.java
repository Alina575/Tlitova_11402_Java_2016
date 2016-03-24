package ru.kpfu.itis.alina.task007;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

@Component
public class SpecialServiceAuto extends MechanicalVehicle implements AirConditionable, FlashingLightSoundTurnable {
    private String type;
    private int weight;
    @Autowired
    private Driver driver;

    public SpecialServiceAuto(){}

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public Driver getDriver() {
        return driver;
    }

    public SpecialServiceAuto(String type, int weight, Driver driver) {
        this.type = type;
        this.driver = driver;
        this.weight = weight;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Автомобиль спецслужбы. Тип ТС - " + type +
                ". Вес - " + weight
                + ". Водитель - " + driver.getName() + ". Поехали!");
    }

    @Override
    public void turnOnAirCond(int speed) {
        System.out.println("Кондиционер включен на скорости - " + speed);
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

    @Override
    public void turnOnFlashingLight(boolean p) {
        if (!p) {
            System.out.println("Проблесковые маячки включены.");
        } else {
            System.out.println("Вы не выключали проблесковые маячки!");
        }
    }

    @Override
    public void turnOnTheSound(boolean p) {
        if (!p) {
            System.out.println("Сирена включена.");
        } else {
            System.out.println("Вы не выключали сирену!");
        }
    }

    @Override
    public void turnOffFlashingLight(boolean p) {
        if (!p) {
            System.out.println("Проблесковые маячки выключены.");
        } else {
            System.out.println("Вы не включали проблесковые маячки!");
        }
    }

    @Override
    public void turnOffTheSound(boolean p) {
        if (!p) {
            System.out.println("Сирена выключена.");
        } else {
            System.out.println("Вы не включали сирену!");
        }
    }
}
