package tests;

import classes.Driver;
import classes.Train;
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

public class TrainTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static Train t = (Train)ac.getBean("train");

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        Train t1 = mock(Train.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(t1.getDriver()).thenReturn(d1);
        when(t1.getPassengersCount()).thenReturn(100);
        when(t1.getCarriageCount()).thenReturn(3);
        Assert.assertEquals(true, t.equals(t1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutTrain() {
        t.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(t.getDriver());
        Assert.assertNotNull(t.getWeight());
    }

}
