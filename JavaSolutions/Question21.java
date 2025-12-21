import java.util.Scanner;
import java.util.HashSet;

public class Question21 {

  static HashSet<Long> Amicables = new HashSet<Long>();//This hashset is used to find all amicable numbers less than 10,000 which are all unique(not repeated)

  public static boolean isAmicable(long a) {//This method is used to check if a number is amicable or not

    long totalA = 0;//Initialises totalA to 0
    
    for (long i = 1; i < a; i++) {//Program iterates loop from 1 to (value a - 1))
      if (a % i == 0) { //Each time, it checks if a is divisible by i (any number less than a but greater than 0)
        totalA += i; //If so, it adds on to totalA until the for loop terminates for a
      }
    }

    long b = totalA; //It then sets the final value of totalA to b
    long totalB = 0; //Initialises totalB to 0

    for (long j = 1; j < b; j++) {//Exact same procedure for b as for a done
      if (b % j == 0) {
        totalB += j;
      }
    }

    if (((a == totalB) && (b == totalA)) && (a != b)) {//Checks if the 2 numbers are amicable using this if statement equation
      Amicables.add(a); //If both numbers are amicable to each other, both numbers are added to the hashset (unless both already there, it won't add again)
      Amicables.add(b);
      return true;
    }

    return false; //If not, nothing happens
  }

  public static void main(String[] args) {

    for (long i = 1; i <= 10000; i++) {//The program checks for 9999 numbers in order if they're amicable and if so, adds 2 numbers to the hashset at the same time
      isAmicable(i);
    }

    System.out.println(Amicables); //After iterating 9999 times, program prints the final hashset of all amicable valeus between 1 and 9999

    long finalTotal = 0; //Initialises finalTotal to 0

    for (Long number : Amicables) { //Iterates in order from first index to the final index of the hashset
      finalTotal += number; //Program adds each index to the previous total each time
    }

    System.out.println(finalTotal); //After adding all indexes, prints the final total
  }
}
