package ru.geekbrains.java23102020.lesson_6;

public class Main {
    public static void main(String[] args) {
            Cat cat = new Cat("Кот", 200, 0, 2);
            cat.running(150);
            cat.swimming(4);
            cat.jumping(3);


            Dog dog = new Dog("Собака", 500, 10, 0.5);
            dog.running(600);
            dog.swimming(5);
            dog.jumping(0.3);
    }
}
