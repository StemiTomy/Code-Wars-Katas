/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter casing)
*/

public class isogram {
    public static boolean  isIsogram(String str) {
      str = str.toLowerCase(); // hola
      char[] strArr = str.toCharArray(); // ahora es h, o, l, a
        
      for (int i = 0; i < strArr.length; i++) {
        char letraAComporbar = strArr[i];
        for (int j = 0; j < strArr.length; j++) {
          if (i==j){ // se salta esa letra!
            continue;}  
          if (letraAComporbar == strArr[j]){
            return false;}       
        }
            
      }
      return true;
  } 
}
