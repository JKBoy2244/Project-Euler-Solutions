import java.util.Scanner;
import java.math.BigInteger;

public class Question63 {
  public static void main(String[] args) {

    int count = 0;
    
    for (long i = 1; i < 1000000000L; i++) {

      double value = Math.pow(i, 1.0 / String.valueOf(i).length());
      if (Math.abs(value - Math.round(value)) < 1e-9) {
        count++;
       }
      }

    System.out.println(count);
  }
}
