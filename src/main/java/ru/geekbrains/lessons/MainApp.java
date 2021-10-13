package ru.geekbrains.lessons;

public class MainApp {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик");
        cat1.Run(30);
        Cat cat2 = new Cat("Барсик");
        cat2.Run(300);
        Cat cat3 = new Cat("Сёма");
        cat3.Swim(50);
        System.out.println();

        Dog dog = new Dog("Бобик");
        dog.Run(400);
        dog.Swim(100);
        System.out.println();
        System.out.println("Всего животных: " + Animal.getAnimalsCount()
                + " (котов - " + Cat.CATS_COUNT + " , собак - " + Dog.DOGS_COUNT + ")");
    }
}
