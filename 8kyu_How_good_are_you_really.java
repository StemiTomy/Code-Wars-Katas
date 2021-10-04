public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0; // sumamos la lista
    for (int value : classPoints) {
        sum += value;
    }

    int avg = sum / classPoints.length; // calculamos avg
    if (yourPoints > avg){ // comprobamos
      return true;
    } return false;
  }
}

// la mejor solucion para no reinventar la rueda:
import java.util.Arrays;

class Kata {
    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
