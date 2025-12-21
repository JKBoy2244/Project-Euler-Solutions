import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static boolean prime(int n) {//Method for checking if numbers are prime or not

    if (n <= 1) {
      return false;//Rejects n<=1 as prime as 1 only has 1 prime factor and rest are invalid values
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {//Iterates through 2 to the stated n value
      if (n % i == 0) {//Checks if n divided by any i valeus throughout the loop equals to 0
        return false;//If the first i value divided by n equals 0, then it's not prime anymore (loop stops)
      }
    }
    return true;//Prime returned if none of the i values within the n range divided by n is 0
  }
  public static void main(String[] args) {

    ArrayList<Integer> primeNumbers = new ArrayList<Integer>(); //Creates an empty ArrayList with nothing stored for prime numbers
    long a = 10000000L; //Initialises this a value when organising order of prime numbers

    for (long i = 1; i <= a; i++) {//Iterates/checks from 1 to a in clear order to check if they are prime or not
      if (prime((int) i)) {//Checks if the numbers are prime
        primeNumbers.add((int)i);//If so, it adds it to the arrayList in order each time
      }
    }
    System.out.println(primeNumbers.get(10000));//Program prints 10,001st (position) prime number
  }
}
