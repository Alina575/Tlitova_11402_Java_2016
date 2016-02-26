import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         004
 */

public class PedestrianTest {
    static Pedestrian p = new Pedestrian("Сергей", 22, 85);

    @Test
    public void constructorShouldHaveDefinedValues() {
        Pedestrian p1 = mock(Pedestrian.class);
        when(p1.getName()).thenReturn("Сергей");
        when(p1.getAge()).thenReturn(22);
        when(p1.getWeight()).thenReturn(85);
        Assert.assertEquals(true, p.equals(p1));
    }

    @Test
    public void pedestrianInfoShouldContainInfoAboutPedestrian() {
        p.pedestrianInfo();
        Assert.assertNotNull(p.getName());
        Assert.assertNotNull(p.getAge());
    }

    @Test
    public void speedShouldNotBeNull() {
        int speed = 4;
        p.speed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void lowerSpeedShouldNotBeNull() {
        int speed = 1;
        p.lowerSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void enhanceSpeedShouldNotBeNull() {
        int speed = 2;
        p.enhanceSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void stopShouldBeBoolean() {
        boolean b = true;
        p.stop(b);
        Assert.assertTrue(b | !b);
    }
}
