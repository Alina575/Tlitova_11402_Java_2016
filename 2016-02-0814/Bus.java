/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class Bus extends MechanicalVehicle implements AirConditionable {
    String type;
    Driver driver;
    int passengersCount;

    public Bus(String type, Driver driver, int passengersCount) {
        this.type = type;
        this.driver = driver;
        this.passengersCount = passengersCount;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Маршрутное транспортное средство. Тип - " + type +
                ". Водитель - " + driver.name +
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
