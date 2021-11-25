package com.geekbrains.animals;

public class Cat extends Animal {
    private static int catsCounter = 0;

    public Cat(String name) {
        super(name, 200, 0);
        Cat.catsCounter++;
    }

    public static final int polulationSize() {
        return Cat.catsCounter;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать\n", this.name);
    }

}
