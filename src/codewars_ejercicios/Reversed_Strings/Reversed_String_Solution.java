/*
 * El ejercicio es fácil, pide que dado un String, le demos la vuelta, es decir:
 * 'world' => 'dlrow'
 */
package codewars_ejercicios.Reversed_Strings;

/**
 *
 * @author stemi
 */
public class Reversed_String_Solution {
    
    public String solution(String palabraARevertir){ // (B) (E) (A)
    // Your code here...
    char strChar[] = palabraARevertir.toCharArray();
    String nuevaPalabra = "";
    for (int i=0;i<palabraARevertir.length(); i++){ // B E A, B ->
      nuevaPalabra = strChar[i]+nuevaPalabra; // esa B me la pones en B+"";;;; e+"B" eB// a+"eB" aeB
    }
        return nuevaPalabra;
    }
    
    // la mejor solucion:
    public String solution2(String str) {
    return new StringBuilder(str).reverse().toString();
    }
}
