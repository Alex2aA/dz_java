package one.five.two;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");

        System.out.println("Создан: " + cat.toString());

        cat.meow();

        cat.meow(3);
    }
}