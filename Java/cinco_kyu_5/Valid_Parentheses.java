package cinco_kyu_5;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
The function should return true if the string is valid, and false if it's invalid.

Examples
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true
Constraints
0 <= input.length <= 100

Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
Furthermore, the input string may be empty and/or not contain any parentheses at all.
Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
*/

public class Valid_Parentheses {
    public static boolean validParentheses(String parens) {
        // regex: change everything that isn't a '(' or ')' for ""
        parens = parens.replaceAll("[^\\(\\)]", "");

        char[] chars = parens.toCharArray();
        ArrayList<Character> charsArray = new ArrayList<Character>();
        for (char c : chars) {
            charsArray.add(c);
        }

        if (parens == "")
            return true;
        if (chars[0] == ')' || chars[chars.length - 1] == '(')
            return false;

        String newParens = new String();

        for (int i = 0; i < (charsArray.size() - 1); i++) {

            if (charsArray.size() - 1 == 1) {
                if (charsArray.get(i) == '(' && charsArray.get(i + 1) == ')')
                    return true;
            } else if (charsArray.get(i) == '(' && charsArray.get(i + 1) == ')') {

                charsArray.remove(i);
                charsArray.remove(i);

                for (char c : charsArray) {
                    newParens += c;
                }

                return validParentheses(newParens);

            }

        }

        return false;
    }


    // Mejor solución (contando, yo anda por aquí pero no caí en hacerlo así)
    public static boolean validParentheses2(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(')
                count++;
            else if (str.charAt(i) == ')')
                count--;
            if (count < 0)
                return false;
        }
        if (count == 0)
            return true;
        else
            return false;
    }

    // Segunda mejor solución, solamente regex, interesante, porque lo he usado tal cual, pero tampoco caí en hacerlo así... (revisar)
    public static boolean validParentheses3(String parens) {
        try {
            Pattern.compile(parens.replaceAll("[^()]", ""));
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
