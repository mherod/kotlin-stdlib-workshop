package com.myunidays.kotlinexamples;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("World");
        listOfStrings.add("How");
        listOfStrings.add("are");
        listOfStrings.add("you?");

        for (String string : listOfStrings) {
            if (string.contains("?")) {
                System.out.println(string);
            }
        }
    }
}
