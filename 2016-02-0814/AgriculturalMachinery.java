/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class AgriculturalMachinery extends MechanicalVehicle {
    String type;
    int weight;
    Driver driver;

    public AgriculturalMachinery(String type, int weight, Driver driver) {
        this.type = type;
        this.driver = driver;
        this.weight = weight;
    }

    @Override
    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Сельхоз техника. Тип - " + type +
                ". Вес - " + weight
                + ". Водитель - " + driver.name + ". Поехали!");
    }
}
