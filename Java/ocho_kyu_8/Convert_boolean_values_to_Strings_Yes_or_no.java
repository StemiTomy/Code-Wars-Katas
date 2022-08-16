package ocho_kyu_8;

/*
 * Complete the method that takes a
 *  boolean value and return a "Yes" 
 * string for true, or a "No" string for false.
 */

public class Convert_boolean_values_to_Strings_Yes_or_no {
    public static String boolToWord(boolean b) {
        // TODO
        if (b == true)
            return "Yes";
        return "No";
    }

}

// Mejor solución
class YesOrNo {
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

}