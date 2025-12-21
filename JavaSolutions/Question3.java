import java.util.Scanner;

public class Question3 {
  public static boolean isPrime(int n) { //This method checks for prime numbers.
    
    if (n <= 1) { //If n <= 1, boolean is false because it isn't prime as 1 has only 1 factor and rest of thr numbers are invalid.
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) { //For any particular n value, it checks whether every single number from 1 to the n values divides to 0 and if none do, then it counts as a prime (returns true)
        return false; //Only if not prime
      } 
    }
    return true;
  }

  public static void main(String[] args) {

    long n = 600851475143L; //This data type is long (not int) as the value is way way too large(L at the end - important)
    long highestPrimeFactor = -1; //Initialises highestPrimeFactor as -1
    for (long i = 1; i <= Math.sqrt(n); i++) {//Iterates from 1 to the n value to check if i is a prime and divisible by n (both must)

      if (isPrime((int)i) && (n%i==0)) {//Checks if i prime and is also divisible by the n value
        highestPrimeFactor = i; //highestPrimeFactor is being replaced by the i value each time
      }
    }

    System.out.println(highestPrimeFactor); //Program prints highest factor
  }
}
