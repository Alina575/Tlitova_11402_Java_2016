package tests;

import classes.Driver;
import classes.Moto;
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

public class MotoTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static Moto m = (Moto)ac.getBean("moto");

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        Moto m1 = mock(Moto.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(m1.getDriver()).thenReturn(d1);
        when(m1.getPassengersCount()).thenReturn(1);
        when(m1.getWeight()).thenReturn(1000);
        Assert.assertEquals(true, m.equals(m1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutMoto() {
        m.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(m.getDriver());
        Assert.assertNotNull(m.getWeight());
    }

}
