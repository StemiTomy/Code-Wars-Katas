/*
 * Ejercicos de codewars!
 */
package codewars_ejercicios;

import codewars_ejercicios.Reversed_Strings.Reversed_String_Solution;
import java.util.Scanner;

/**
 *
 * @author stemi
 */
public class CodeWars_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        Reversed_String_Solution rss = new Reversed_String_Solution();
        System.out.println("Dime un nombre para revertiir: ");
        String nombreARevertir = teclado.nextLine();
        System.out.println(rss.solution(nombreARevertir));
    }
    
}
