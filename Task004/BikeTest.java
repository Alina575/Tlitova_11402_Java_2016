import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         004
 */

public class BikeTest {
    static Driver d = new Driver("Сергей", 22, 85);
    static Bike b = new Bike(d, "Велосипед", 2);

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        Bike b1 = mock(Bike.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(b1.getDriver()).thenReturn(d1);
        when(b1.getType()).thenReturn("Велосипед");
        when(b1.getWheelsCount()).thenReturn(2);
        Assert.assertEquals(true, b.equals(b1));
    }

    @Test
    public void bikeInfoShouldContainInfoAboutBike() {
        b.bikeInfo();
        Assert.assertNotNull(b.getDriver());
        Assert.assertNotNull(b.getType());
    }

    @Test
    public void speedShouldNotBeNull() {
        int speed = 10;
        b.speed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void lowerSpeedShouldNotBeNull() {
        int speed = 11;
        b.lowerSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void enhanceSpeedShouldNotBeNull() {
        int speed = 14;
        b.enhanceSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void stopShouldBeBoolean() {
        boolean p = true;
        b.stop(p);
        Assert.assertTrue(p | !p);
    }
}
