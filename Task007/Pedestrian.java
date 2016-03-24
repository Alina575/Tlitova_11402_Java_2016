package ru.kpfu.itis.alina.task007;

import org.springframework.stereotype.Component;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

@Component
public class Pedestrian implements SpeedChangable {
    private String name;
    private int age;
    private int weight;

    public Pedestrian(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public Pedestrian(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void pedestrianInfo() {
        System.out.println("Пешеход. Имя - " + name +
                ". Возраст - " + age +
                ". Вес - " + weight + ". Пошли!");
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
            System.out.println("Пришли!");
        } else {
            System.out.println("И так стояли на месте!");
        }
    }
}
