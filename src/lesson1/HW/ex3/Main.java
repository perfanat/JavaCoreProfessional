package lesson1.HW.ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box <Orange> boxOrange = new Box<>(new ArrayList<>());
        boxOrange.add (new Orange());
        Box <Apple> boxApple = new Box<>(new ArrayList<>());
        boxApple.add (new Apple());

        System.out.println(boxApple.compare(boxOrange));
        boxApple.changeBox(boxOrange);
    }
}
