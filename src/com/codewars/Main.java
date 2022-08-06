package com.codewars;


import com.codewars.validbraces.BraceChecker;

// for tests
public class Main {
    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker();
        System.out.println(bc.isValid("(}"));
    }
}
