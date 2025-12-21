import java.util.Scanner;

public class Main {
  public static boolean AllDivisible(int n) {//This method checks if a particular number is divisible by all the i values from 1 to a certain number like 20 and if so, it returns true so it is.

    for (int i = 1; i <= 20; i++) {//Iterates from 1 to 20 each time
      if (n % i != 0) {//from 1 to 20, it checks if it's divisible by n for all, if one isn't it returns false and stops there
        return false;
      }
    }

    return true;//If n divisible by all i values, it returns true
  }

  public static void main(String[] args) {

    long smallestDivisible = 1000000000; //Initialises the smallest divisible
    long k = 1000000000L;//Initialises the k value
    
    for (long j = k; j >= 1; j--) {//Iterates in descending order each time from k to 1
      if (AllDivisible((int)j) && j< smallestDivisible) {//Each time checks if each value is allDivisible and if so , is it less than the initialised/previously smallestDivisible variable values stored
        smallestDivisible = j; //If so,it replaces it with the j value of the time if was checked
      }
    }

    System.out.println(smallestDivisible);//After completely iterating through each loop, program prints the smallest divisible value within the range stated
  }
}
