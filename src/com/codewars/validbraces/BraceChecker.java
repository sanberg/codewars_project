package com.codewars.validbraces;

public class BraceChecker {
    public boolean isValid(String str) {
        if (!isEven(str.length())) {
            return false;
        }
        //slice by braces in loop and check
        for (int i = 0; i < str.length(); i++) {
            var c = str.charAt(i);
            if (c == '[') {
                int index = str.indexOf(']', i + 1);
                if (index < 0 || isEven(index - i)) {
                    StringBuilder lastHalfReversed = new StringBuilder(str.substring(str.length() / 2)).reverse();
                    System.out.println(lastHalfReversed);
                    if (lastHalfReversed.indexOf("]") == index && index != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            if (c == '(') {
                int index = str.indexOf(')', i + 1);
                if (index < 0 || !isEven(index - i)) {
                    StringBuilder lastHalfReversed = new StringBuilder(str.substring(str.length() / 2)).reverse();
                    System.out.println(lastHalfReversed);
                    if (lastHalfReversed.indexOf(")") == index && index != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            if (c == '{') {
                int index = str.indexOf('}', i + 1);
                if (index < 0 || isEven(index - i)) {
                    StringBuilder lastHalfReversed = new StringBuilder(str.substring(str.length() / 2)).reverse();
                    System.out.println(lastHalfReversed);
                    if (lastHalfReversed.indexOf("}") == index && index != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}