import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         004
 */

public class MotoTest {
    static Driver d = new Driver("Сергей", 22, 85);
    static Moto m = new Moto(d, 1, 1000);

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
