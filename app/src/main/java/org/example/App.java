package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    // Remove duplicates using a Set (keeps original order)
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
