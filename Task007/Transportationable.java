package ru.kpfu.itis.alina.task007;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public interface Transportationable {

    void takeOnePassenger(Pedestrian p);

    void takeAnimals(int count);

    void takeManyPassengers(int count);

    void takeLargeCargo(int weight);

}
