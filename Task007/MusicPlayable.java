package ru.kpfu.itis.alina.task007;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public interface MusicPlayable {

    void turnOnRadio(double station);

    void turnOnCD(int number);

    void turnOnMemoryCard(int number);

    void turnOffMusic(boolean p);
}
