package B1;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayLístExample {
    public static void main(String[] args) {
        //Creating an ArrayLíst of String
        List<String> animal = new ArrayList<>();

        animal.add("Lion");
        animal.add("Tiger");
        animal.add("Cat");
        animal.add("Dog");
        System.out.println(animal);

        //Adding an element at a particualar index in an ArrayList
        animal.add(2,"Element");

        System.out.println(animal);
    }
}
