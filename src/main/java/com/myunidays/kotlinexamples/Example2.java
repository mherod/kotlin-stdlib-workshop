package com.myunidays.kotlinexamples;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("World");
        listOfStrings.add("How");
        listOfStrings.add("are");
        listOfStrings.add("you?");

        StringBuilder sb = new StringBuilder();

        for (String string : listOfStrings) {
            sb.append(string).append(" ");
        }

        System.out.println(sb);
    }
}
