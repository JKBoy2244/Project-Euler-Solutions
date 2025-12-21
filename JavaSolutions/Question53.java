import java.util.Scanner;
import java.math.BigInteger;
import java.util.HashSet;

public class Main {
  static HashSet<Integer> values = new HashSet<Integer>();

  public static int countCombinationsGreaterThanMillion(int n) {
    int count = 0;

    for (int r = 0; r <= n; r++) {
      // Calculate C(n,r) = n! / (r! * (n-r)!)
      // But we'll do it efficiently to avoid overflow

      long combination = 1;
      boolean overflow = false;

      // Calculate C(n,r) = n * (n-1) * ... * (n-r+1) / (r * (r-1) * ... * 1)
      for (int i = 0; i < r; i++) {
        combination = combination * (n - i) / (i + 1);

        // Check if we're getting close to overflow or already exceed million
        if (combination > 1000000) {
          count++;
          break;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int totalCount = 0;

    for (int i = 1; i <= 100; i++) {
      totalCount += countCombinationsGreaterThanMillion(i);
    }

    System.out.println("Total combinations greater than 1 million: " + totalCount);
  }
}
