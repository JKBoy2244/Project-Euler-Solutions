import java.util.Scanner;

//import static org.junit.Assert.fail;

import java.util.ArrayList;

public class Question50 {

  static ArrayList<Long> Primes = new ArrayList<Long>();
  static long terms = 0;

  public static boolean isPrime(long n) {//Self-explanatory

    
    if (n <= 1) {
      return false;
    }

    for (long i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    Primes.add(n);
    terms++;
    return true;
  }

  public static void main(String[] args) {

    for (long i = 1; i <= 999999; i++) {
      isPrime(i);
    }

    System.out.println(Primes);
    System.out.println(terms);

    long maxLength = 0;
    long resultPrime = 0;

    for (long i = 0; i < Primes.size(); i++) {
      long sum = 0;
      for (long j = i; j < Primes.size(); j++) {
        sum += Primes.get((int)j);

        if (sum >= 1000000) {
          break;
        }

        if (sum > 1 && isPrimeCheck(sum)) {
          long currentLength = j - i + 1;
          if (currentLength > maxLength) {
            maxLength = currentLength;
            resultPrime = sum;
          }
        }
      }
    }

    System.out.println("Prime with longest consecutive sum: " + resultPrime);
    System.out.println("Length of consecutive sum: " + maxLength);
  }

  public static boolean isPrimeCheck(long n) {//Self-explanatory
    
    if (n <= 1) {
      return false;
     }

    for (long i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
     return true;
  }
}
