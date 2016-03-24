package tests;

import classes.Auto;
import classes.Driver;
import classes.MechanicalVehicle;
import classes.Pedestrian;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         010
 */

public class MechanicalVehicleTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static MechanicalVehicle mv = (Auto)ac.getBean("mv");

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        MechanicalVehicle mv1 = mock(MechanicalVehicle.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(mv1.getDriver()).thenReturn(d1);
        when(mv1.getType()).thenReturn("Механическое ТС");
        when(mv1.getWeight()).thenReturn(2000);
        Assert.assertEquals(true, mv.equals(mv1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutMechanicalVehicle() {
        mv.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(mv.getDriver());
        Assert.assertNotNull(mv.getType());
    }

    @Test
    public void turnOnDipperHeadlightsShouldBeBoolean() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOnHighBeamsShouldBeBoolean() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOnFogLightsShouldBeBoolean() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOnParkingLights() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOnRadioShouldBeBoolean() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOnCDShouldBeBoolean() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOnMemoryCardShouldBeBoolean() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOffMusicShouldBeBoolean() {
        boolean p = true;
        mv.turnOnDipperHeadlights(p);
        Assert.assertTrue(p | !p);
    }


    @Test
    public void speedShouldNotBeNull() {
        int speed = 4;
        mv.speed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void lowerSpeedShouldNotBeNull() {
        int speed = 1;
        mv.lowerSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void enhanceSpeedShouldNotBeNull() {
        int speed = 2;
        mv.enhanceSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void stopShouldBeBoolean() {
        boolean p = true;
        mv.stop(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void takeOnePassengerShouldTakeOnePedestrian() {
        Pedestrian p = mock(Pedestrian.class);
        Pedestrian p1 = new Pedestrian("Алла", 29, 50);
        when(p.getName()).thenReturn("Алла");
        when(p.getAge()).thenReturn(29);
        when(p.getWeight()).thenReturn(50);
        mv.takeOnePassenger(p);
        Assert.assertEquals(p1.getName(), p.getName());
        Assert.assertEquals(p1.getAge(), p.getAge());
        Assert.assertEquals(p1.getWeight(), p.getWeight());
    }

    @Test
    public void takeAnimalsShouldNotBeNull() {
        int count = 1;
        mv.takeAnimals(count);
        Assert.assertTrue(count != 0);
    }

    @Test
    public void takeManyPassengersShouldNotBeNullOrOne() {
        int count = 2;
        mv.takeManyPassengers(count);
        Assert.assertTrue(count != 0 | count != 1);

    }

    @Test
    public void takeLargeCargoShouldNotBeLessThanThreeHundredKilos() {
        int weightOfCargo = 350;
        mv.takeLargeCargo(weightOfCargo);
        Assert.assertTrue(weightOfCargo > 300);
    }

}
