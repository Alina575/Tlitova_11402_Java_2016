package ru.kpfu.itis.alina.task006;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class AgriculturalMachinery extends MechanicalVehicle {
    private String type;
    private int weight;
    private Driver driver;

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public AgriculturalMachinery(String type, int weight, Driver driver) {
        this.type = type;
        this.driver = driver;
        this.weight = weight;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Сельхоз техника. Тип - " + type +
                ". Вес - " + weight
                + ". Водитель - " + driver.getName() + ". Поехали!");
    }
}
