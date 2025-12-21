import java.util.Scanner;
import java.math.BigInteger;


public class Main {
  public static boolean FifthPower(BigInteger n) {

    if (n.compareTo(BigInteger.ONE) == 0) {
      return false; //returns false, doesnt include it if n = 1
    }

    String n_size = String.valueOf(n); //Converts BigInteger to string
    long n_length = n_size.length();
    BigInteger total = BigInteger.ZERO; //Sets BigInteger total to 0

    for (long i = 0; i < n_size.length(); i++) { //Iterates the loop from index 0 to index (length-1) so checks each digit of the value
      int digit = Character.getNumericValue(n_size.charAt((int) i)); //Gets each digit of the value n
      BigInteger digitBigInt = BigInteger.valueOf(digit);
      BigInteger digitFourthPower = digitBigInt.pow(5); //Powers each digit to the power of 5
      total = total.add(digitFourthPower); //Then adds it to the total and continues for all digits in the n value
    }

    if (total.equals(n)) { //This checks if the total of all digits each powered of 5 equals to the n value specified
      return true; //It returns true, takes it into account if it does
    }

    return false; //If not, doesn't take that into account
  }

  public static void main(String[] args) {

    long Many = 0; //Initialises Many to 0
    long total1 = 0; //Initialises total1 to 0

    for (BigInteger i = BigInteger.valueOf(2); i.compareTo(new BigInteger("30000000000000")) < 0; i = i.add(BigInteger.ONE)) { //Iterates the loop each time from 2 to 30 million in order

     if (FifthPower(i)) { //Each loop it checks if each value of i has all its digits to its 5th power equalling to its own value 
        Many++; //If so, many increments by 1 stating how many values have this feature
        System.out.println(i); //Each time during the loop process, prints the i value which meets that criteria
        total1 += i.longValue(); //Then, it adds i to the previous/initial total1 value
       
      }  
    }

    System.out.println(total1); //After iterating the loop 30 million times, it prints the final value of total1
  }
}
