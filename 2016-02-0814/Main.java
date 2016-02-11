/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Алексей", 27, 80);
        driver1.driverInfo();
        driver1.speed(3);
        driver1.enhanceSpeed(2);
        driver1.stop(false);
        System.out.println();

        Driver driver2 = new Driver("Григорий", 43, 77);

        Pedestrian pedestrian1 = new Pedestrian("Людмила", 21, 53);
        pedestrian1.pedestrianInfo();
        pedestrian1.speed(4);
        pedestrian1.lowerSpeed(1);
        pedestrian1.stop(false);
        System.out.println();

        Auto auto = new Auto(driver1, 2, 2000);
        auto.mechanicalVehicleTypeAndInfo();
        auto.takeAnimals(3);
        auto.enhanceSpeed(2);
        auto.turnOnParkingLights(false);
        auto.turnOnHighBeams(false);
        auto.turnOnMemoryCard(5);
        auto.turnOffAirCond(true);
        auto.turnOnFogLights(false);
        auto.stop(false);
        System.out.println();

        MechanicalVehicle bus = new Bus("Автобус", driver1, 15);
        bus.mechanicalVehicleTypeAndInfo();
        bus.lowerSpeed(30);
        bus.takeManyPassengers(7);
        bus.turnOnRadio(107.3);
        bus.takeManyPassengers(2);
        bus.enhanceSpeed(10);
        bus.turnOnDipperHeadlights(false);
        System.out.println();

        Bike bike = new Bike(driver2, "Спортивный", 2);
        bike.bikeInfo();
        bike.speed(15);
        bike.lowerSpeed(2);
        bike.enhanceSpeed(4);
        bike.stop(false);
        System.out.println();

        MechanicalVehicle lorry = new Lorry("КамАЗ", driver2, 7000);
        lorry.mechanicalVehicleTypeAndInfo();
        lorry.takeOnePassenger(pedestrian1);
        lorry.takeLargeCargo(100);
        lorry.takeAnimals(1);
        lorry.speed(30);
        lorry.lowerSpeed(10);
        lorry.turnOnRadio(105.3);
        lorry.turnOnDipperHeadlights(false);
        lorry.enhanceSpeed(3);
        lorry.turnOffMusic(false);
        System.out.println();

        SpecialServiceAuto specialServiceAuto = new SpecialServiceAuto("Скорая медицинская помощь", 4000, driver1);
        specialServiceAuto.mechanicalVehicleTypeAndInfo();
        specialServiceAuto.turnOnDipperHeadlights(false);
        specialServiceAuto.turnOnFlashingLight(false);
        specialServiceAuto.turnOnTheSound(false);
        specialServiceAuto.turnOnAirCond(3);
        specialServiceAuto.enhanceAirCond(1);
        specialServiceAuto.turnOffMusic(true);
        specialServiceAuto.lowerSpeed(10);
        specialServiceAuto.stop(false);
        System.out.println();

        MechanicalVehicle agriculturalMachinery = new AgriculturalMachinery("Трактор", 5500, driver2);
        agriculturalMachinery.mechanicalVehicleTypeAndInfo();
        agriculturalMachinery.stop(true);
        agriculturalMachinery.speed(10);
        agriculturalMachinery.lowerSpeed(1);
        agriculturalMachinery.stop(false);
        System.out.println();

        MechanicalVehicle moto = new Moto(driver1, 0, 300);
        moto.mechanicalVehicleTypeAndInfo();
        moto.takeOnePassenger(pedestrian1);
        moto.speed(40);
        moto.enhanceSpeed(10);
        moto.turnOnDipperHeadlights(false);
        moto.lowerSpeed(5);
        moto.stop(false);
        System.out.println();

        Tram tram = new Tram(driver2, 30, 18000);
        tram.mechanicalVehicleTypeAndInfo();
        tram.turnOnAirCond(4);
        tram.takeManyPassengers(3);
        tram.lowerSpeed(7);
        tram.turnOnRadio(102.4);
        tram.turnOffAirCond(false);
        tram.takeOnePassenger(pedestrian1);
        tram.stop(false);
        System.out.println();

        AnimalDrawnCart animalDrawnCart = new AnimalDrawnCart(driver2, 20, 1);
        animalDrawnCart.animalDrawnCartInfo();
        animalDrawnCart.speed(7);
        animalDrawnCart.lowerSpeed(5);
        animalDrawnCart.stop(false);
        System.out.println();

        MechanicalVehicle train = new Train(driver2, 300, 6);
        train.mechanicalVehicleTypeAndInfo();
        train.turnOnCD(1);
        train.lowerSpeed(5);
        train.takeManyPassengers(80);
        train.turnOnDipperHeadlights(false);
        train.turnOffMusic(false);
        train.takeManyPassengers(50);
        train.stop(false);
        System.out.println();
    }
}
