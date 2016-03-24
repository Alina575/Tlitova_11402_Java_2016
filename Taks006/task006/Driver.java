package ru.kpfu.itis.alina.task006;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class Driver implements SpeedChangable {
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public Driver(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void driverInfo() {
        System.out.println("Водитель. Имя - " + name +
                ". Возраст - " + age +
                ". Вес - " + weight + ". Пошли к машине!");
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
            System.out.println("Пришли! Можно садиться в машину.");
        } else {
            System.out.println("И так стояли на месте!");
        }
    }
}
