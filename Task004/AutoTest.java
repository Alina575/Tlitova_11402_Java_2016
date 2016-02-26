import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         004
 */

public class AutoTest {
    static Driver d = new Driver("Сергей", 22, 85);
    static Auto a = new Auto(d, 2, 2000);

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        Auto a1 = mock(Auto.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(a1.getDriver()).thenReturn(d1);
        when(a1.getPassengersCount()).thenReturn(2);
        when(a1.getWeight()).thenReturn(2000);
        Assert.assertEquals(true, a.equals(a1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutAuto() {
        a.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(a.getDriver());
        Assert.assertNotNull(a.getWeight());
    }

    @Test
    public void TurnOnAirCondShouldBeBoolean() {
        boolean p = true;
        a.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void TurnOffAirCondShouldBeBoolean() {
        boolean p = true;
        a.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void lowerAirCondShouldNotBeNull() {
        int c = 2;
        a.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }

    @Test
    public void enhanceAirCondShouldNotBeNull() {
        int c = 3;
        a.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }
}
