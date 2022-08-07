package com.codewars.jadencase;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase != null && !phrase.equals("")) {
            String[] strings = phrase.split(" ");
            for (int i = 0; i < strings.length; i++) {
                strings[i] = strings[i].replace(strings[i].charAt(0), Character.toUpperCase(strings[i].charAt(0)));
            }
            return String.join(" ", strings);
        } else return null;
    }
}
