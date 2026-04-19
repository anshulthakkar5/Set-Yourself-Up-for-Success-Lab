package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }


    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new HashSet<>(list);   // removes duplicates
        return new ArrayList<>(set);        // convert back to ArrayList
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        ArrayList<Integer> result = removeDuplicates(list);
        System.out.println(result);
    }
}
