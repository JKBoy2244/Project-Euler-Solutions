import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {

    BigInteger a; //Initialises the variable a as BigInteger
    BigInteger b; //Initialises the variable b as BigInteger
    BigInteger c; //Initialises the variable c as BigInteger
    long n = 0; //Initialises n as a long variable

    a = new BigInteger("1"); //Sets a to 1
    b = new BigInteger("1"); //Sets b to 1
    c = new BigInteger("0"); //Sets c to 0

    while (String.valueOf(c).length() < 1000) { //Loop continues running and only stops when it sees a first number with 1000 digits which then stops
      
      c = a.add(b); //Fibonacci sequence addition to find c
      n++; //Increments n in terms of finding the nth term values

      System.out.println("F" + (n+2) + " : " + c + " - " + String.valueOf(c).length() + " digits"); //Prints nth term values as well as their number of digits each term
      a = b; //Line 22 and 23 part of the repetitive fibonacci sequence addition
      b = c;
      
    }
  }
}
