package ocho_kyu_8;

import java.util.Arrays;

public class How_good_are_you_really {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0; // sumamos la lista
    for (int value : classPoints) {
      sum += value;
    }

    int avg = sum / classPoints.length; // calculamos avg
    if (yourPoints > avg) { // comprobamos
      return true;
    }
    return false;
  }
}

// la mejor solucion para no reinventar la rueda:
class ocho_kyu_How_good_are_you_really_2 {
  static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
    return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
  }
}
