import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {

  static HashSet<Long> digitsSame = new HashSet<Long>();
  public static boolean isDigitsSame(long a) { 

    long b = 2*a; //Multiplies a by 2 to get b
    long c = 3*a; //Multiplies a by 3 to get c
    long d = 4*a; //Multiplies a by 4 to get d
    long e = 5*a; //Multiplies a by 5 to get e
    long f = 6*a; //Multiplies a by 6 to get f

    char[] digitA = String.valueOf(a).toCharArray(); //Stores each character of digit a in an array
    char[] digitB = String.valueOf(b).toCharArray(); //Stores each character of digit b in an array
    char[] digitC = String.valueOf(c).toCharArray(); //Stores each character of digit c in an array
    char[] digitD = String.valueOf(d).toCharArray(); //Stores each character of digit d in an array
    char[] digitE = String.valueOf(e).toCharArray(); //Stores each character of digit e in an array
    char[] digitF = String.valueOf(f).toCharArray(); //Stores each character of digit f in an array

    Arrays.sort(digitA); //Stores each character in digitA array in ascending order suppose
    Arrays.sort(digitB); //Stores each character in digitB array in ascending order suppose
    Arrays.sort(digitC); //Stores each character in digitC array in ascending order suppose
    Arrays.sort(digitD); //Stores each character in digitD array in ascending order suppose
    Arrays.sort(digitE); //Stores each character in digitE array in ascending order suppose
    Arrays.sort(digitF); //Stores each character in digitF array in ascending order suppose

    if ((Arrays.equals(digitA, digitB)) && (Arrays.equals(digitB, digitC)) &&
      (Arrays.equals(digitC, digitD)) && (Arrays.equals(digitD, digitE)) &&
      (Arrays.equals(digitE, digitF))) { //Checks if all 6 digits contain the exact same digits as each other

      digitsSame.add(a); //If yes, adds it to the hashSet digitSame
      System.out.println(a); //prints the value satisfying the condition
      return true; //It returns true
    }

    return false; //If not, it returns false (nothing happens)
    
  }

  public static void main(String[] args) {

    for (long i = 1; i <= 1000000; i++) { 

      isDigitsSame(i); //The program performs this function from 1 to 1000000 in order to check
    }
  }
}
