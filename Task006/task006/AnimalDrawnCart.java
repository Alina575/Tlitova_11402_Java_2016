package ru.kpfu.itis.alina.task006;

import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

@Component
public class AnimalDrawnCart implements SpeedChangable {
    private Driver driver;
    private int weightOfCargo;
    private int countOfHorses;

    public Driver getDriver() {
        return driver;
    }

    public int getWeightOfCargo() {
        return weightOfCargo;
    }

    public int getCountOfHorses() {
        return countOfHorses;
    }

    public AnimalDrawnCart(Driver driver, int weightOfCargo, int countOfHorses) {
        this.driver = driver;
        this.weightOfCargo = weightOfCargo;
        this.countOfHorses = countOfHorses;
    }

    public void animalDrawnCartInfo() {
        System.out.println("Гужевая повозка. Водитель - " + driver.getName() + ". Вес груза - " + weightOfCargo +
                ". Количество лошадей - " + countOfHorses + ". Поехали!");
    }

    @Override
    public void speed(int speed) {
        System.out.println("Скорость - " + speed + " км/ч");
    }

    @Override
    public void lowerSpeed(int speed) {
        System.out.println("Скорость уменьшена на " + speed + " км/ч");
    }

    @Override
    public void enhanceSpeed(int speed) {
        System.out.println("Скорость увеличена на " + speed + " км/ч");
    }

    @Override
    public void stop(boolean p) {
        if (!p) {
            System.out.println("Приехали!");
        } else {
            System.out.println("И так стояли на месте!");
        }
    }
}
