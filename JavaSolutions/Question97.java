import java.util.Scanner;
import java.math.BigInteger;

public class Question97 {
  public static void main(String[] args) {

    BigInteger Number1 = (BigInteger.valueOf(2)).pow(7830457);//Program calculates number1 as 2 to the power of 7830457
    BigInteger Number2 = BigInteger.valueOf(28433); //Initialises number2 as 28433
    BigInteger Number3 = Number1.multiply(Number2);//Then, it adds the resulting number 1 by 28433(Number2) to get Number3
    BigInteger Number4 = Number3.add(BigInteger.ONE);//Adds Number3 by 1 to get Number4

    String Number4Str = Number4.toString();//Converts BigInteger to string
    System.out.println(Number4Str.length());//Displays the number of digits the string version of Number4 has

    for (long i = Number4Str.length()-10; i <= Number4Str.length()-1; i++) {//Iterates through last 10 digits of Number4
      System.out.print(Character.getNumericValue(Number4Str.charAt((int)i)));//Program dsiplays last 10 digits of the Number4 value (Large(Massive) Non-Mersenne Prime)
    }
    
  }
}
