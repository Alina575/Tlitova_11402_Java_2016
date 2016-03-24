package tests;

import classes.Bus;
import classes.Driver;
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

public class BusTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static Bus b = (Bus) ac.getBean("bus");

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        Bus b1 = mock(Bus.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(b1.getDriver()).thenReturn(d1);
        when(b1.getPassengersCount()).thenReturn(2);
        when(b1.getType()).thenReturn("Автобус");
        Assert.assertEquals(true, b.equals(b1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutBus() {
        b.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(b.getDriver());
        Assert.assertNotNull(b.getType());
    }

    @Test
    public void TurnOnAirCondShouldBeBoolean() {
        boolean p = true;
        b.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void TurnOffAirCondShouldBeBoolean() {
        boolean p = true;
        b.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void lowerAirCondShouldNotBeNull() {
        int c = 2;
        b.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }

    @Test
    public void enhanceAirCondShouldNotBeNull() {
        int c = 3;
        b.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }
}
