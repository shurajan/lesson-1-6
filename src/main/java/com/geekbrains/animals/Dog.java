package com.geekbrains.animals;

public class Dog extends Animal {
    private static int dogsCounter = 0;

    public Dog(String name) {
        super(name, 500, 10);
        Dog.dogsCounter++;
    }

    public static int polulationSize() {
        return Dog.dogsCounter;
    }

    @Override
    public void swim(int distance) {
        if (distance <= this.swimLimit && distance > 0) {
            System.out.printf("%s проплыл %s метров\n", this.name, distance);
        } else {
            System.out.println(this.name + " не умеет плавать на расстояние " + distance + " метров");
        }
    }
}
