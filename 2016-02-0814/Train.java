/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class Train extends MechanicalVehicle {
    Driver driver;
    int passengersCount;
    int carriageCount;

    public Train(Driver driver, int passengersCount, int carriageCount) {
        this.driver = driver;
        this.passengersCount = passengersCount;
        this.carriageCount = carriageCount;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Трамвай. Водитель - " + driver.name +
                ". Количество пассажиров - " + passengersCount
                + ". Количество вагонов - " + carriageCount + ". Поехали!");
    }
}
