package siete_kyu_7;

/*

Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.


 */

public class Vowel_Count {
    public static int getCount(String str) {
        // 1st we convert the string to an Array of chars
        str.toLowerCase();
        char[] characters = str.toCharArray();

        // 2nd we loop through the characters and we sum up all the vowels that we find
        int vowels = 0;
        for (char c : characters) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }

        return vowels;
    }

    // Mejores soluciones:
    // 1
    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    // 2
    public static int getCount3(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}
