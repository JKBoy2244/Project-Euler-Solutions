import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {

   BigInteger total = BigInteger.valueOf(2).pow(1000); //2^100 is greater than 2^63-1 so BigInteger type has to be used instead of long to calculate precisely 2^100

   String totalStr = String.valueOf(total); //Converts from BigInteger type to string type
   long length = totalStr.length();//Uses string type to calculate the number of digits in the total value
   long total1 = 0L;//Initialises total as a long type to 0

   for (long i = 0; i < length; i++) {//Iterated loop each time from i = 0 to the final position index of the total in terms of digit position
     total1 += Character.getNumericValue(totalStr.charAt((int)i));
   }//Adds each digit from 1st to last for all digits inside the total value

   System.out.println(total);//Displays the precise value of 2^100
   System.out.println(total1);//Displays the sum of all the digits inside the total value for 2^100
  }
}
