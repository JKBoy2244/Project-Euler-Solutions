import java.util.Scanner;

public class Main {
  public static boolean isPythagorean(long n) {//Program checks if a value is pythagorean and also if a+b+c=1000 anyways

    for (long i = 1; i <(n); i++) {//Iterates through the loop each time from 1 to a specified n value
      for (long j = 1; j <(n); j++) {//for each i value, again iterates through the loop each time from 1 to a specified n value so in total program iterated (n*n) times
        if (i*i + j*j == n*n && (i+j+n == 1000)) {//Checks if n is pythagorean and all 3 values add up to 1000
          System.out.println(i + " " + j + " " + n);//Displays each value of i, j  and n
          System.out.println(i*j*n);//Displays the products of all 3 values
          return true;//Makes it true as both conditions are satisfied
          
        }
      }
    }
    return false;
    
  }

  public static void main(String[] args) {

    long value = 100000L;//Initialises long value
    long highestPythagorean = -1;//Initialises highest pythagorean value

    for (long i = 1; i <= value; i++) {//Program iterates from 1 to specified value each time in the main method in order
      if (isPythagorean(i) && i > highestPythagorean) {//Checks if the program is pythagorean and is higher than the previously value with highest pythagorean
        highestPythagorean = i;//If both met, replaces it with the new i value from the loop at that time
       }
      }

    System.out.println(highestPythagorean);
    }
  }
