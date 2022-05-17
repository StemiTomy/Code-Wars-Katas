/*
8 kyu - Find the smallest integer in the array
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
*/

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int numMin = args[0];
      for (int i = 0; i < args.length; i++) {
        if (numMin >= args[i]) numMin =  args[i];
      }
      return numMin;
    }
}


// la forma más curiosa de resolverlo:
import java.util.Arrays;
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
