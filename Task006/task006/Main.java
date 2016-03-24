package ru.kpfu.itis.alina.task006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alina Tlitova
 *         11-402
 *         006
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        Driver driver1 = (Driver) ac.getBean("driver1");
        System.out.println(driver1.getName());
        driver1.driverInfo();
        driver1.speed(3);
        driver1.enhanceSpeed(2);
        driver1.stop(false);
        System.out.println();

        Driver driver2 = (Driver) ac.getBean("driver2");

        Pedestrian pedestrian1 = (Pedestrian) ac.getBean("pedestrian1");
        pedestrian1.pedestrianInfo();
        pedestrian1.speed(4);
        pedestrian1.lowerSpeed(1);
        pedestrian1.stop(false);
        System.out.println();

        Auto auto = (Auto) ac.getBean("auto");
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

        MechanicalVehicle bus = (Bus) ac.getBean("bus");
        bus.mechanicalVehicleTypeAndInfo();
        bus.lowerSpeed(30);
        bus.takeManyPassengers(7);
        bus.turnOnRadio(107.3);
        bus.takeManyPassengers(2);
        bus.enhanceSpeed(10);
        bus.turnOnDipperHeadlights(false);
        System.out.println();

        Bike bike = (Bike) ac.getBean("bike");
        bike.bikeInfo();
        bike.speed(15);
        bike.lowerSpeed(2);
        bike.enhanceSpeed(4);
        bike.stop(false);
        System.out.println();

        MechanicalVehicle lorry = (Lorry) ac.getBean("lorry");
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

        SpecialServiceAuto specialServiceAuto = (SpecialServiceAuto) ac.getBean("specialServiceAuto");
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

        MechanicalVehicle agriculturalMachinery = (AgriculturalMachinery) ac.getBean("agriculturalMachinery");
        agriculturalMachinery.mechanicalVehicleTypeAndInfo();
        agriculturalMachinery.stop(true);
        agriculturalMachinery.speed(10);
        agriculturalMachinery.lowerSpeed(1);
        agriculturalMachinery.stop(false);
        System.out.println();

        MechanicalVehicle moto = (Moto) ac.getBean("moto");
        moto.mechanicalVehicleTypeAndInfo();
        moto.takeOnePassenger(pedestrian1);
        moto.speed(40);
        moto.enhanceSpeed(10);
        moto.turnOnDipperHeadlights(false);
        moto.lowerSpeed(5);
        moto.stop(false);
        System.out.println();

        Tram tram = (Tram) ac.getBean("tram");
        tram.mechanicalVehicleTypeAndInfo();
        tram.turnOnAirCond(4);
        tram.takeManyPassengers(3);
        tram.lowerSpeed(7);
        tram.turnOnRadio(102.4);
        tram.turnOffAirCond(false);
        tram.takeOnePassenger(pedestrian1);
        tram.stop(false);
        System.out.println();

        AnimalDrawnCart animalDrawnCart = (AnimalDrawnCart) ac.getBean("animalDrawnCart");
        animalDrawnCart.animalDrawnCartInfo();
        animalDrawnCart.speed(7);
        animalDrawnCart.lowerSpeed(5);
        animalDrawnCart.stop(false);
        System.out.println();

        MechanicalVehicle train = (Train) ac.getBean("train");
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
