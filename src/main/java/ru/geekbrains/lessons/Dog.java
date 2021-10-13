package ru.geekbrains.lessons;

public class Dog extends Animal {

    public static int DOGS_COUNT = 0;

    public Dog(String _name)
    {
        super(_name);
        setMaxRunLength(500);
        setMaxSwimLength(10);
        DOGS_COUNT++;
    }
}
