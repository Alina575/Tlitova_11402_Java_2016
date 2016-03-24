package ru.kpfu.itis.alina.task006;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class Train extends MechanicalVehicle {
    private Driver driver;
    private int passengersCount;
    private int carriageCount;

    @Override
    public Driver getDriver() {
        return driver;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public Train(Driver driver, int passengersCount, int carriageCount) {
        this.driver = driver;
        this.passengersCount = passengersCount;
        this.carriageCount = carriageCount;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Трамвай. Водитель - " + driver.getName() +
                ". Количество пассажиров - " + passengersCount
                + ". Количество вагонов - " + carriageCount + ". Поехали!");
    }
}
