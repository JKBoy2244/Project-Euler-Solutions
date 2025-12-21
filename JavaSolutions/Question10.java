import java.util.Scanner;

public class Question10 {
  public static boolean isPrime(long n) {//Same method with explanations already explained in previous problems

    if (n <= 1) {
      return false;
    }

    for (long i = 2; i <= Math.sqrt(n); i++) {
      if (n%i == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {

    long primeSums = 0;//Initialises long primeSums value
    long maxValue = 2000000;//Initialises long maxValue value

    for (long i = 1; i < maxValue; i++) {//Iterates the loop from 1 to maxValue each time in order
      if (isPrime(i)) {//Checks if each i value is prime, if it is, it adds on to the previous primeSums value before
        primeSums += i;
      }
    }

    System.out.println(primeSums);//After incrementing the entire loop from 1 to maxValue, program prints the primeSums total from the specified i range
  }
}
