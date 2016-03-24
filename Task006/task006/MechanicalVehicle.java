package ru.kpfu.itis.alina.task006;

/**
 * @author Alina Tlitova
 *         11-402
 *         11.02.2016
 */

public class MechanicalVehicle
        implements LightChangable, MusicPlayable, SpeedChangable, Transportationable {
    private String type;
    private int weight;
    private Driver driver;

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void mechanicalVehicleTypeAndInfo() {
        System.out.println("Механическое транспортное средство. Тип - "
                + type + ". Вес -" + weight + ". Водитель - " + driver.getName());
    }

    @Override
    public void turnOnDipperHeadlights(boolean p) {
        if (!p) {
            System.out.println("Ближний свет фар включен.");
        } else {
            System.out.println("Вы не включали ближний свет фар!");
        }
    }

    @Override
    public void turnOnHighBeams(boolean p) {
        if (!p) {
            System.out.println("Дальний свет фар включен.");
        } else {
            System.out.println("Вы не включали дальний свет фар!");
        }
    }

    @Override
    public void turnOnFogLights(boolean p) {
        if (!p) {
            System.out.println("Противотуманные фары включены.");
        } else {
            System.out.println("Вы не включали противотуманных фар!");
        }
    }

    @Override
    public void turnOnParkingLights(boolean p) {
        if (!p) {
            System.out.println("Габаритные огни включены.");
        } else {
            System.out.println("Вы не включали габаритные огни!");
        }
    }

    @Override
    public void turnOnRadio(double station) {
        System.out.println("На волнах " + station + " FM");
    }

    @Override
    public void turnOnCD(int number) {
        System.out.println("CD. Песня номер " + number);
    }

    @Override
    public void turnOnMemoryCard(int number) {
        System.out.println("Карта памяти. Песня номер " + number);
    }

    @Override
    public void turnOffMusic(boolean p) {
        if (!p) {
            System.out.println("Музыка выключена.");
        } else {
            System.out.println("Вы не включали музыку!");
        }
    }

    @Override
    public void speed(int speed) {
        System.out.println("Скорость " + speed + " км/ч");
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

    @Override
    public void takeOnePassenger(Pedestrian p) {
        System.out.println("Захватили пассажира с именем " + p.getName() +
                ". Возраст - " + p.getAge() + ". Вес - " + p.getWeight());
    }

    @Override
    public void takeAnimals(int count) {
        System.out.println("Захватили " + count + " животного(-ых).");
    }

    @Override
    public void takeManyPassengers(int count) {
        System.out.println("Захватили " + count + " человек(-а).");
    }

    @Override
    public void takeLargeCargo(int weight) {
        System.out.println("Загрузили груз массой " + weight + " кг.");
    }
}
