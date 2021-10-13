package ru.geekbrains.lessons;

public class Cat extends Animal {

    public static int CATS_COUNT = 0;

    public Cat(String _name)
    {
        super(_name);
        setMaxRunLength(200);
        setMaxSwimLength(0);
        CATS_COUNT++;
    }
}
