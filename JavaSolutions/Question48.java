import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {

    BigInteger total = BigInteger.ZERO; //Initialises total to 0 in BigInteger form

    for (long i = 1; i <=1000; i++) { //Iterates the loop each time from 1 to 1000
      
      total = total.add(BigInteger.valueOf(i).pow((int)i));//Each time, adds previous total by i^i
    }

    System.out.println(total);//After iterating loop 1000 times, it prints the total

    String totalStr = total.toString();//Converts big integer to string

    for (long i = totalStr.length()-10; i<= totalStr.length()-1; i++) {//Iterates the loop for last 10 digits of integer
      System.out.print(Character.getNumericValue(totalStr.charAt((int)i))); //Displays last 10 digits of the final total
    }
  }
}
