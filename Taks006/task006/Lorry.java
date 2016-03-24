package ru.kpfu.itis.alina.task006;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class Lorry extends MechanicalVehicle implements AirConditionable {
    String type;
    Driver driver;
    int weight;

    public Lorry(String type, Driver driver, int weight) {
        this.type = type;
        this.driver = driver;
        this.weight = weight;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Грузовое транспортное средство. Тип - " + type +". Вес - " + weight +
                ". Водитель - " + driver.getName() + ". Поехали!");
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
