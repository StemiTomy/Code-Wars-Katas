package ocho_kyu_8;

import java.util.List;

/* 
8 kyu Sum Mixed Array
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
*/

public class Sum_Mixed_Array {

  /*
   * Assume input will be only of Integer o String type
   */
  public int sum(List<?> mixed) {
    int total = 0;

    for (Object object : mixed) { // por cada item
      if (object instanceof String)
        total += Integer.parseInt(object.toString()); // si es string
      if (object instanceof Integer)
        total += Integer.parseInt(object.toString()); // si es int
    }

    return total; // retorna el total
  }
}

// mejor solucion:
class MixedSum2 {

  public int sum(List<?> mixed) {
    return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
  }

}
