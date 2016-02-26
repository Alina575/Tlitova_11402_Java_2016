import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         004
 */

public class TrainTest {
    static Driver d = new Driver("Сергей", 22, 85);
    static Train t = new Train(d, 100, 3);

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
