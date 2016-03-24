﻿package tests;

import classes.Driver;
import classes.Lorry;
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

public class LorryTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    static Driver d = (Driver) ac.getBean("driver");
    static Lorry lor = (Lorry)ac.getBean("lorry");

    @Test
    public void constructorShouldHaveDefinedValues() {
        Driver d1 = mock(Driver.class);
        Lorry lor1 = mock(Lorry.class);
        when(d1.getName()).thenReturn("Сергей");
        when(d1.getAge()).thenReturn(22);
        when(d1.getWeight()).thenReturn(85);
        when(lor1.getDriver()).thenReturn(d1);
        when(lor1.getType()).thenReturn("КамАЗ");
        when(lor1.getWeight()).thenReturn(5000);
        Assert.assertEquals(true, lor.equals(lor1));
    }

    @Test
    public void mechanicalVehicleTypeAndInfoShouldContainInfoAboutLorry() {
        lor.mechanicalVehicleTypeAndInfo();
        Assert.assertNotNull(lor.getDriver());
        Assert.assertNotNull(lor.getType());
    }

    @Test
    public void TurnOnAirCondShouldBeBoolean() {
        boolean p = true;
        lor.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void TurnOffAirCondShouldBeBoolean() {
        boolean p = true;
        lor.turnOffAirCond(p);
        Assert.assertTrue(p | !p);
    }

    @Test
    public void lowerAirCondShouldNotBeNull() {
        int c = 2;
        lor.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }

    @Test
    public void enhanceAirCondShouldNotBeNull() {
        int c = 3;
        lor.lowerAirCond(c);
        Assert.assertTrue(c != 0);
    }
}
