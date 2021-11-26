package com.geekbrains.animals;

public abstract class Animal {
    private static int animalsCounter = 0;
    protected String name;
    protected int runLimit;
    protected int swimLimit;


    public Animal(String name, int runLimit, int swimLimit) {
        //Увеличивает счетчик животных
        animalsCounter++;
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public static int polulationSize() {
        return Animal.animalsCounter;
    }

    public void run(int distance) {
        if (distance <= this.runLimit && distance > 0) {
            System.out.printf("%s пробежал %s метров\n", this.name, distance);
        } else {
            System.out.println(this.name + " не умеет бегать на расстояние " + distance + " метров");
        }
    }

    public abstract void swim(int distance);

    public int getRunLimit() {
        return this.runLimit;
    }

    public int getSwimLimit() {
        return this.swimLimit;
    }

}
