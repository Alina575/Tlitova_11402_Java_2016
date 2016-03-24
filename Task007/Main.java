package ru.kpfu.itis.alina.task007;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Alina Tlitova
 *         11-402
 *         007
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        Driver driver1 = ac.getBean(Driver.class);
        System.out.println(driver1.getName());
        driver1.driverInfo();
        driver1.speed(3);
        driver1.enhanceSpeed(2);
        driver1.stop(false);
        System.out.println();

        Driver driver2 = ac.getBean(Driver.class);

        Pedestrian pedestrian1 = ac.getBean(Pedestrian.class);
        pedestrian1.pedestrianInfo();
        pedestrian1.speed(4);
        pedestrian1.lowerSpeed(1);
        pedestrian1.stop(false);
        System.out.println();

        Auto auto = ac.getBean(Auto.class);
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

        MechanicalVehicle bus = ac.getBean(Bus.class);
        bus.mechanicalVehicleTypeAndInfo();
        bus.lowerSpeed(30);
        bus.takeManyPassengers(7);
        bus.turnOnRadio(107.3);
        bus.takeManyPassengers(2);
        bus.enhanceSpeed(10);
        bus.turnOnDipperHeadlights(false);
        System.out.println();

        Bike bike = ac.getBean(Bike.class);
        bike.bikeInfo();
        bike.speed(15);
        bike.lowerSpeed(2);
        bike.enhanceSpeed(4);
        bike.stop(false);
        System.out.println();

        MechanicalVehicle lorry = ac.getBean(Lorry.class);
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

        SpecialServiceAuto specialServiceAuto = ac.getBean(SpecialServiceAuto.class);
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

        MechanicalVehicle agriculturalMachinery = ac.getBean(AgriculturalMachinery.class);
        agriculturalMachinery.mechanicalVehicleTypeAndInfo();
        agriculturalMachinery.stop(true);
        agriculturalMachinery.speed(10);
        agriculturalMachinery.lowerSpeed(1);
        agriculturalMachinery.stop(false);
        System.out.println();

        MechanicalVehicle moto = ac.getBean(Moto.class);
        moto.mechanicalVehicleTypeAndInfo();
        moto.takeOnePassenger(pedestrian1);
        moto.speed(40);
        moto.enhanceSpeed(10);
        moto.turnOnDipperHeadlights(false);
        moto.lowerSpeed(5);
        moto.stop(false);
        System.out.println();

        Tram tram = ac.getBean(Tram.class);
        tram.mechanicalVehicleTypeAndInfo();
        tram.turnOnAirCond(4);
        tram.takeManyPassengers(3);
        tram.lowerSpeed(7);
        tram.turnOnRadio(102.4);
        tram.turnOffAirCond(false);
        tram.takeOnePassenger(pedestrian1);
        tram.stop(false);
        System.out.println();

        AnimalDrawnCart animalDrawnCart = ac.getBean(AnimalDrawnCart.class);
        animalDrawnCart.animalDrawnCartInfo();
        animalDrawnCart.speed(7);
        animalDrawnCart.lowerSpeed(5);
        animalDrawnCart.stop(false);
        System.out.println();

        MechanicalVehicle train = ac.getBean(Train.class);
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
