package tests;

import classes.*;
import interfaces.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.mockito.Mockito.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         010
 */

public class AgriculturalMachineryTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static AgriculturalMachinery am = (AgriculturalMachinery) ac.getBean("am");

    @Test
    public void agriculturalMachineryShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        AgriculturalMachinery am1 = mock(AgriculturalMachinery.class);
        when(am1.getType()).thenReturn("Трактор");
        when(am1.getWeight()).thenReturn(5000);
        when(am1.getDriver()).thenReturn(d1);
        when(am1.getDriver().getName()).thenReturn("Сергей");
        when(am1.getDriver().getAge()).thenReturn(22);
        when(am1.getDriver().getWeight()).thenReturn(85);
        Assert.assertEquals(true, am.equals(am1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutAgrigulturalMachinery() {
        am.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(am.getType());
        Assert.assertNotNull(am.getWeight());
    }
}
