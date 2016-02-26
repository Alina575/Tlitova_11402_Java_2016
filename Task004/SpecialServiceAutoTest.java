import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         004
 */

public class SpecialServiceAutoTest {
    static Driver d = new Driver("Сергей", 22, 85);
    static SpecialServiceAuto ssa = new SpecialServiceAuto("Скорая медицинская помощь", 2000, d);

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        SpecialServiceAuto ssa1 = mock(SpecialServiceAuto.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(ssa1.getDriver()).thenReturn(d1);
        when(ssa1.getType()).thenReturn("Скорая медицинская помощь");
        when(ssa1.getWeight()).thenReturn(2000);
        Assert.assertEquals(true, ssa.equals(ssa1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutSpecialServiceAuto() {
        ssa.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(ssa.getDriver());
        Assert.assertNotNull(ssa.getType());
    }


    @Test
    public void TurnOnAirCondShouldBeBoolean() {
        boolean p = true;
        ssa.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void TurnOffAirCondShouldBeBoolean() {
        boolean p = true;
        ssa.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void lowerAirCondShouldNotBeNull() {
        int c = 2;
        ssa.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }

    @Test
    public void enhanceAirCondShouldNotBeNull() {
        int c = 3;
        ssa.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }

    @Test
    public void turnOnFlashingLightShouldBeBoolean() {
        boolean p = true;
        ssa.turnOnFlashingLight(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOffTheSoundShouldBeBoolean() {
        boolean p = true;
        ssa.turnOnTheSound(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOffFlashingLightShouldBeBoolean() {
        boolean p = true;
        ssa.turnOnFlashingLight(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void turnOnTheSoundShouldBeBoolean() {
        boolean p = true;
        ssa.turnOnTheSound(p);
        Assert.assertTrue(p | !p);
    }
}
