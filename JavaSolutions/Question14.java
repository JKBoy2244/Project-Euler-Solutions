import java.util.Scanner;

public class Main {
  public static long Iterative(long n) { //This is the collatz Sequence method

    long terms = 1; //Initialises the number of terms as 1

    while (n != 1) {//The program continues looping until n equals to 1 in which case program stops looping

      if (n%2 == 0) {//n halves if n is an even number
        n = n/2;
      } else {
        n = ((3*n)+1);//if n is an odd number, it multiplies by 3, then adds by 1
      }

      terms++; //Number of terms increment each time

    }
    return terms; //Returns the number of terms as the method is a function
   }

  public static void main(String[] args) {

    long highestTerms = 1;//Initialises highestTerms as 1
    long numberHighestTerms = 1;//Initialises numberHighestTerms as 1

    for (long i = 2; i < 1000000; i++) {//Increments the loop from 2 to 999,999 each time in order to find the number with the largest number of terms
      long terms = Iterative(i);//Program calls the iterative function in the for loop
      if (terms > highestTerms) {//Checks if the new number of terms each time is greater than the previos value of highestTerms
        highestTerms = terms;//If yes, it replaces the highestTerms value previously with the new terms value that time
        numberHighestTerms = i;//Also replaces the previous numberHighestTerms value with the new i value coresponding to its highest number of terms
      }
    }

    System.out.println(highestTerms);//After incrementing the entire loop 999,999 times, program prints the highestTerms and next line, it prints numberHighestTerms
    System.out.println(numberHighestTerms);
    }
  }
