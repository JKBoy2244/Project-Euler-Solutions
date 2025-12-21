import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

  static ArrayList<BigInteger> ONEs = new ArrayList<BigInteger>();//Initialises an arrayList for storing numbers arriving at 1s only
  static ArrayList<BigInteger> EIGHTYNINEs = new ArrayList<BigInteger>();//Initialises an arrayList for storing numbers arriving at 89s only
  
  public static void SquareDigitValue(BigInteger n) {

    System.out.print(n + " , ");//Prints first the n starting value
    
    while (true) {//This program keeps looping the loop until the starting n value reaches either 1 or 89 in which case the program stops looping (and moves on to the next value)

      BigInteger n_next = BigInteger.ZERO;//Initialises n_next as 0
      String n_Str = n.toString();//Converts BigInteger to string
      
      for (int i = 0; i < n_Str.length(); i++) {//Program iterates from first index to last index of value n - starting
        long digit = Character.getNumericValue(n_Str.charAt(i)); //Initialises long digit
        n_next = n_next.add(BigInteger.valueOf(digit).pow(2)); //The program adds all the digits in each n value as n_next
      }

      System.out.print(n_next + " , ");//Prints the next term after the previous term 

      if (n_next.compareTo(BigInteger.valueOf(1)) == 0) {//The program checks if the value of that nth term reaches 1 eventually
        System.out.print(n_next);//If so, this line and the next line gets printed
        System.out.println (n + " ----> " + n_next);
        ONEs.add(n);//Program adds the initial starting n value to the ONEs arraylist
        break;//Program exits the loop
      }

      if (n_next.compareTo(BigInteger.valueOf(89)) == 0) {//Exact same procedure for 89s as for 1s
        System.out.print(n_next);
        System.out.println (n + " ----> " + n_next);
        EIGHTYNINEs.add(n);
        break;
      }

      n = n_next;//After that, sets n_next as n each time
      
    } 
  }

  public static void main(String[] args) {

    for (BigInteger i = BigInteger.ONE; i.compareTo(new BigInteger("10000000")) < 0; i = i.add(BigInteger.ONE)) {//The program loops and iterates in order 9,999,999 times
      SquareDigitValue(i);//Each time performs the function for each i value loop
    }

    System.out.println(ONEs.size());//After looping 9,999,999 times, prints number of values which eventually end in 1.
    System.out.println(EIGHTYNINEs.size());//After looping 9,999,999 times, prints number of values which eventually end in 89.

  }
}
