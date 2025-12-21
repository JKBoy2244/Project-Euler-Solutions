import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    long maxSolutions = 0; //Initialises maxSolutions as 0
    long bestP = 0; //Initialises bestP as 0

    for (long p = 1; p <= 1000; p++) { //loop iterates each time from 1 to 1000
      long solutions = 0; //Initialises solutions as 0

      for (long i = 1; i < p; i++) { //Within the loop iteration for p 1000 times, iterates i from 1 to the existing p value at the time within the loop
        for (long j = i; j < p - i; j++) {
          long k = p - i - j; //Initialises k as p - i - j

          // Check if it's a valid Pythagorean triplet: i² + j² = k²
          if (k > j && i*i + j*j == k*k) {
            solutions++; //If so, increments the number of solutions
          }
        }
      }

      if (solutions > maxSolutions) { //If a current number of solutions is more than the maxSolutions
        maxSolutions = solutions;
        bestP = p; //bestP replaced for p for the particular p value with more solutions than the prvious maxSolutions
      }

      if (solutions > 0) {
        System.out.println(p + " has " + solutions + " solutions!"); //Prints number of solutions if solutions is greater than 0
      }
    }

    System.out.println("Maximum solutions: " + maxSolutions + " for p = " + bestP); //Displays the maximum solutions for the corresponding p value
  }
}
