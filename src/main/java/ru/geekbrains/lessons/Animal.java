package ru.geekbrains.lessons;

public class Animal {

    private String name;
    private int maxRunLength;
    private int maxSwimLength;

    public Animal(String _name)
    {
        name = _name;
    }

    public static int getAnimalsCount()
    {
        return Cat.CATS_COUNT + Dog.DOGS_COUNT;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    protected void setMaxRunLength(int maxRunLength) {
        this.maxRunLength = maxRunLength;
    }

    public void Run(int length)
    {
        if (maxRunLength == 0)
        {
            System.out.println(name + " не побежит, потому что не умеет бегать");
            return;
        }
        int runLength = length > maxRunLength ? maxRunLength : length;
        System.out.println(name + " пробежал " + runLength + "м");
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }

    protected void setMaxSwimLength(int maxSwimLength) {
        this.maxSwimLength = maxSwimLength;
    }

    public void Swim(int length)
    {
        if (maxSwimLength == 0)
        {
            System.out.println(name + " не поплывёт, потому что не умеет плавать");
            return;
        }
        int swimLength = length > maxSwimLength ? maxSwimLength : length;
        System.out.println(name + " проплыл " + swimLength + "м");
    }
}
