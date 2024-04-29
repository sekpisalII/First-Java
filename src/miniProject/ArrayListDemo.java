package miniProject;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(STR."Initial ArrayList: \{fruits}");

        // Accessing elements
        String firstFruit = fruits.get(2);
        System.out.println(STR."First fruit: \{firstFruit}");

        // Updating an element
        fruits.set(0, "Orange");
        System.out.println(STR."Updated ArrayList: \{fruits}");

        // Removing an element
        fruits.remove(2);
        System.out.println(STR."ArrayList after removing an element: \{fruits}");

        // Checking list properties
        int size = fruits.size();
        boolean isEmpty = false;
        boolean containsMango = fruits.contains("Mango");

        System.out.println(STR."Size: \{size}");
        System.out.println(STR."Is empty? \{isEmpty}");
        System.out.println(STR."Contains 'Mango'? \{containsMango}");

        // Iterating over elements
        System.out.println("Iterating over elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println(STR."ArrayList after clearing: \{fruits}");
    }
}