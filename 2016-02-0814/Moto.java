/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class Moto extends MechanicalVehicle {
    Driver driver;
    int passengersCount;
    int weight;

    public Moto(Driver driver, int passengersCount, int weight) {
        this.driver = driver;
        this.passengersCount = passengersCount;
        this.weight = weight;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Мотоцикл. Водитель - " + driver.name +
                ". Количество пассажиров - " + passengersCount
                + ". Вес мотоцикла - " + weight + " кг. Поехали!");
    }
}
