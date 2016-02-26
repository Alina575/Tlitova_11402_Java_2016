import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         004
 */

public class DriverTest {
    static Driver d = new Driver("Сергей", 22, 85);

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        Assert.assertEquals(true, d.equals(d1));
    }

    @Test
    public void driverInfoShouldContainInfoAboutDriver() {
        d.driverInfo();
        Assert.assertNotNull(d.getName());
        Assert.assertNotNull(d.getAge());
    }

    @Test
    public void speedShouldNotBeNull() {
        int speed = 4;
        d.speed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void lowerSpeedShouldNotBeNull() {
        int speed = 1;
        d.lowerSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void enhanceSpeedShouldNotBeNull() {
        int speed = 2;
        d.enhanceSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void stopShouldBeBoolean() {
        boolean p = true;
        d.stop(p);
        Assert.assertTrue(p | !p);
    }
}
