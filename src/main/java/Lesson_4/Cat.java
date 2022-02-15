package Lesson_4;

import java.util.Scanner;

public class Cat extends Animal {
    int runMax = 200;
    int swimLimit = 0;
    static int catCount;


    public Cat(String name, String color) {
        super(name, color);
        catCount++;
    }

    @Override
    public int doRun(int length) {
        if (length <= runMax) {
            System.out.println(name + " пробежал " + length + " метра.");
        } else {
            System.out.println("Котик не может столько пробежать!");
        }
        return length;
    }

    @Override
    public int doSwim(int length) {
        length = swimLimit;
        System.out.println(name + " не умеет плавать :(");
        return length;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White");
        cat1.doSwim(23);
    }

}
