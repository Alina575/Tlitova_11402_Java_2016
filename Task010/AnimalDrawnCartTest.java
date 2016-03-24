package tests;

import classes.AnimalDrawnCart;
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

public class AnimalDrawnCartTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static AnimalDrawnCart adc = (AnimalDrawnCart) ac.getBean("adc");

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        AnimalDrawnCart adc1 = mock(AnimalDrawnCart.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(adc1.getDriver()).thenReturn(d1);
        when(adc1.getWeightOfCargo()).thenReturn(100);
        when(adc1.getCountOfHorses()).thenReturn(1);
        Assert.assertEquals(true, adc.equals(adc1));
    }

    @Test
    public void animalDrawnCartInfoShouldContainInfoAboutAnimalDrawnCart() {
        adc.animalDrawnCartInfo();
        Assert.assertNotNull(adc.getWeightOfCargo());
        Assert.assertNotNull(adc.getCountOfHorses());
    }

    @Test
    public void speedShouldNotBeNull() {
        int speed = 10;
        adc.speed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void lowerSpeedShouldNotBeNull() {
        int speed = 11;
        adc.lowerSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void enhanceSpeedShouldNotBeNull() {
        int speed = 14;
        adc.enhanceSpeed(speed);
        Assert.assertTrue(speed != 0);
    }

    @Test
    public void stopShouldBeBoolean() {
        boolean p = true;
        adc.stop(p);
        Assert.assertTrue(p | !p);
    }
}
