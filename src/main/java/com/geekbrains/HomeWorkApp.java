package com.geekbrains;

import com.geekbrains.animals.*;

public class HomeWorkApp {
    public static void main(String[] args) {

        Cat catMurzik = new Cat("Мурзик");
        catMurzik.swim(100);
        catMurzik.run(1000);

        Dog dogBobik = new Dog("Бобик");
        dogBobik.swim(200);
        dogBobik.run(5000);

        Dog dogSharik = new Dog("Шарик");
        dogSharik.swim(7);
        dogSharik.run(350);

        System.out.println("Всего у нас - " + Animal.polulationSize() + " зверей. Из них:");
        System.out.println("    Кошек - " + Cat.polulationSize() + " шт.");
        System.out.println("    Собак - " + Dog.polulationSize() + " шт.");

    }
}
