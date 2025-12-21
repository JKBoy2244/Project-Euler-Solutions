import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {

    int a = 1; //Initialises a to 1
    int b = 2; //Initialises b to 2
    int c = 0; //Initialises c to 0
    int total = 0; //Initialises total to 0

    do { //This program implements the program in a loop coninuously until the condition is false (c>=100)

      c = a + b; //adds a to b to give c
      if (c >= 4000000) { //Checks if c is greater than/equal to 4000000, if so stops there and doesnt use it to find total
        break; //Stops the loop
      }
      
      if (c%2 == 0) { //Checks if c is an even term
        total = total+=c; //If so, the c value each time adds to the total
      }

      a = b; //After a+b = c, value of a is value of b previous term and value of b is the c value previously
      b = c;
     } while (true); //This assumes for the running loop, c is less than 4000000 in terms of fibonacci sequence

     System.out.println(total+2); //Prints the total of the even terms in a fibonacci sequence within the c range particularly
    }
    
  }
