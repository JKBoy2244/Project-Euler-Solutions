import java.util.Scanner;
import java.util.HashSet;
import java.math.BigInteger;

public class Question29 {
  public static void main(String[] args) {

    HashSet<BigInteger> Integers = new HashSet<BigInteger>(); //Creates an arraylist in a way only unique values can be stored so no repeated values alowed anywehre within the arrayList
    long n = 0; //Initialises value of n as 0

    for (long i = 2; i <= 100; i++) { //Iterates first loop from 2 to 100 each time on order
      for (long j = 2; j <= 100; j++) {//For each time on the first loop, iterates second loop each time on order from 2 to 100 so in total loop iterates 99x99 = 9801 times
        
        BigInteger base = BigInteger.valueOf(i);
        BigInteger value = base.pow((int) j); //This calculates i to the power of j each time 9801 times
        
        if (!Integers.contains(value)) {//After calculating the value, this checks if the integers hash list already contains the value, if so, it doesn't add the value
          Integers.add(value);//If no single value there, it adds it to the hash list
          n++;//As a result of that, n increments by 1 determining the number of terms in the hash list so far after finding each unique value each time
    
      }
    }
  }

 System.out.println(n + " terms"); //Ater the entire loop iteration 9801 times, it prints total number of unique terms in the hash list
 }
}
