import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {

    BigInteger maxDigitsTotal = BigInteger.ZERO; //Initialises maxDigitsTotal as 0

    for (long i = 1; i < 100; i++) { //Iterates the loop in order from 1 to 99
      for (long j = 1; j < 100; j++) { //Each ith time, iterates the loop 99 times in order from 1 to 100 so total loop iterates 9801 times
        
        BigInteger total = BigInteger.ZERO; //For each time in the loop, total is initialised to 0 and after each time resets to 0
        total = total.add((BigInteger.valueOf(i)).pow((int) j)); //As total = 0, each time in the loop, program works out i to the power of j
        String totalStr = total.toString();//Converts BigInteger to String
        BigInteger digitsTotal = BigInteger.ZERO; //Again for each time in the loop, digitsTotal is set to 0 and after each time, it resets to 0

        for (long k = 0; k < totalStr.length(); k++) {//Still in each time at that time of the loop, the program receives the value of i to the power of j and then for value of i to the power of j, calculates the sum of all the digits of that value from starting index to final index
          
          digitsTotal = digitsTotal.add(BigInteger.valueOf(Character.getNumericValue(totalStr.charAt((int) k)))); 
        }

        if (digitsTotal.compareTo(maxDigitsTotal) > 0) {//After that, it checks if the digitsTotal for that time in the loop is bigger than the previous maxDigitsTotal obtained so far

          maxDigitsTotal = digitsTotal;//If so, it gets replaced by that current digitsTotal. Otherwise, nothing happens
        }
      }
    }

    System.out.println(maxDigitsTotal); //After iterating the loop 9801 times, it prints the final maxDigitsTotal where from 1 to 99 of both i and j, each of the value's digits gives the maximum total after working out i to the power of j
  }
}
