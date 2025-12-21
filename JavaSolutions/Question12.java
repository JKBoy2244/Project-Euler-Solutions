import java.util.Scanner;
import java.util.ArrayList;

public class Question12 {
  public static boolean isTriangle(int n) {

    long start = 0;
    for (long i = 1; i <= 1000000000L; i++) {
      start+= i;
      if (n == start) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {

    ArrayList<Long> triangleNumbers = new ArrayList<Long>();
    ArrayList<Long> numberOfDivisors = new ArrayList<Long>();
    
    for (long i = 1; i <= 200000000000L; i++) {
      if (isTriangle((int)i)) {
        triangleNumbers.add(i);
        
        long divisors = 0;
        for (long j = 1; j <= Math.sqrt(i); j++) {
          if (i % j == 0) {
            if (i/j == j) {
              divisors++;
            } else {
              divisors += 2;
            }
          }
        }
        numberOfDivisors.add(divisors);
      }
    }

    for(long i = 0; i < 10 && i < triangleNumbers.size(); i++) {
        System.out.println(triangleNumbers.get((int)i) + ", " + numberOfDivisors.get((int)i));
    }
  }
}
