import java.util.Scanner;
import java.math.BigInteger;//BigInteger imported


public class Question20 {
  public static void main(String[] args) {

    BigInteger Timestotal = BigInteger.valueOf(100);//Sets the value to 100 determining what factorial we are trying to calculate like 100
    //BigInteger is used because for 100 factorial, number of digits will completely overflow the capacity stored for long values (probably 200 to 500 digit numbers maybe) which is why it's used
    BigInteger result = BigInteger.ONE; //This initialises the result to 1(starting point for multiplication)

    for (int i = Timestotal.intValue(); i >= 1; i--) {//Iterates the loop in order each time in descending order from 100 to 1
      result = result.multiply(BigInteger.valueOf(i)); //Multiplies the previous result by each time i value in the loop
      System.out.println("After multiplying by " + i + ": " + result); //Each time, displays the new multiplied result in total
    }

    String totalStr = result.toString();//Converts bigInteger to string for calculating the value's length in terms of number of digits
    long length = totalStr.length(); //Defines the initial length variable
    long total  = 0L; //Initialises the long total
    

    for (long i = 0; i < length; i++) {//Iterates the loop each time from 0 to the position length index
      total += Character.getNumericValue(totalStr.charAt((int)i));//For each position length index of the final total value, adds each digit of the total value to the previosly total each time
    }
    
    System.out.println(Timestotal);//Prints factorial of 100
    System.out.println(total);//Prints the total in terms of all digits within the factorial total
    
  }
}
