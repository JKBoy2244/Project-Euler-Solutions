import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {

    int total1 = 0; //Initialises the 3 totals from total1 to total3
    int total2 = 0;
    int total3 = 0;

    for (int i = 1; i <= 100; i++) {
      total1 += (i*i); //Increments the initialising total1 by every single number's squares in the loop in order continuously
    }

    for (int j = 1; j <= 100; j++) {
      total2 += j; //Increments the initialising total2 by every single number on the loop in order continuously
      total3 = (total2*total2); //sqaures total2 to give the square of the sum of the first 100 numbers
    }
    System.out.println(total1); //prints total1
    System.out.println(total3); //prints total3
    System.out.println(total3-total1); //prints difference between total3 and total1
  }
}
