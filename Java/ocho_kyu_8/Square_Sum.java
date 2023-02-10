package ocho_kyu_8;

/*
Complete the square sum function so that it squares each number passed into
 it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

*/

public class Square_Sum {
  public static int squareSum(int[] n) { 
    int resultado = 0;
    
    for (int num: n) {
      resultado += num*num;
    }
    
    return resultado;
  }
}