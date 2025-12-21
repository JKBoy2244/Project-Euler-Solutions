import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    int total = 0; //Initialises the total to 0.

    for (int i = 1; i < 1000; i++) { //Runs through every single number from 1 to 999 in order using a for loop
      if ((i%3 == 0) || (i%5 == 0)) { //Checks if each number from range of 1 to 999 is divisible by 3 or 5
        total += i; //If so, it adds that number from the i loop to the total
       }
      }

     System.out.println(total); //Displays the total after executing the loop for 999 numbers in order
    }
  }
