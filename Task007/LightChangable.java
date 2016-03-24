package ru.kpfu.itis.alina.task007;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public interface LightChangable {

    void turnOnDipperHeadlights(boolean p); //ближний свет фар

    void turnOnHighBeams(boolean p); //дальний

    void turnOnFogLights(boolean p); //противотуманки

    void turnOnParkingLights(boolean p); //габаритные огни
}
