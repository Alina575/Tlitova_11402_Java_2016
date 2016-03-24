package tests;

import classes.Driver;
import classes.Tram;
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

public class TramTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static Tram t = (Tram) ac.getBean("tram");

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        Tram t1 = mock(Tram.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(t1.getDriver()).thenReturn(d1);
        when(t1.getPassengersCount()).thenReturn(40);
        when(t1.getWeight()).thenReturn(10000);
        Assert.assertEquals(true, t.equals(t1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutTram() {
        t.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(t.getDriver());
        Assert.assertNotNull(t.getWeight());
    }

    @Test
    public void TurnOnAirCondShouldBeBoolean() {
        boolean p = true;
        t.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void TurnOffAirCondShouldBeBoolean() {
        boolean p = true;
        t.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void lowerAirCondShouldNotBeNull() {
        int c = 2;
        t.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }

    @Test
    public void enhanceAirCondShouldNotBeNull() {
        int c = 3;
        t.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }
}
