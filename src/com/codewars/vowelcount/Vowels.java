package com.codewars.vowelcount;

public class Vowels {

    // Straight forward solution
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        for (int i = 0; i < str.length(); i++) {
            if (isCharVowel(str.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    private static boolean isCharVowel(char c) {
        char[] vowelsArr = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowelsArr.length; i++) {
            if (c == vowelsArr[i]) return true;
        }
        return false;
    }

    // solution using Stream API
    public static int getCountFromStream(String str) {
        int vowelsCount = 0;
        // your code here
        return (int) str.chars()
                            .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                            .count();
    }




    //
}