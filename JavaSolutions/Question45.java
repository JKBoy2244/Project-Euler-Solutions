import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.HashSet;

public class Question45 {

  static HashSet<BigInteger> Triangular = new HashSet<BigInteger>();//Creates an initial hashSet for triangular numbers
  static HashSet<BigInteger> Pentagonal = new HashSet<BigInteger>();//Creates an initial hashSet for pentagonal numbers
  static HashSet<BigInteger> Hexagonal = new HashSet<BigInteger>();//Creates an initial hashSet for hexagonal numbers

  public static void triangular(BigInteger n) {

    BigInteger T_n = n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));//Uses an n value to find the nth triangular number which is (n(n+1))/2
    Triangular.add(T_n); //Adds that to the Triangular hashset
  }

  public static void pentagonal(BigInteger n) {

    BigInteger P_n = n.multiply(BigInteger.valueOf(3).multiply(n).subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2));//Uses an n value to find the nth triangular number which is (n(3n-1))/2
    Pentagonal.add(P_n);//Adds that to the Pentagonal hashset
  }

  public static void hexagonal(BigInteger n) {

    BigInteger H_n = n.multiply(BigInteger.valueOf(2).multiply(n).subtract(BigInteger.ONE));//Uses an n value to find the nth triangular number which is n(2n-1)
    Hexagonal.add(H_n);//Adds that to the Hexagonal hashset
  }

  public static void main(String[] args) {

    for (long i = 1; i <=3000000L; i++) {//Iterates the loop in order each time 3,000,000 times

      triangular(BigInteger.valueOf(i)); //For each i term in the loop, it first performs the triangular function
      pentagonal(BigInteger.valueOf(i)); //For each i term in the loop, it secondly performs the pentagonal function
      hexagonal(BigInteger.valueOf(i)); //For each i term in the loop, it thirdly performs the hexagonal function
    }

    for (BigInteger num : Triangular) {//Iterates every single element index in the triangular hashset in order
      if (Pentagonal.contains(num) && Hexagonal.contains(num)) {//Checks if a value in triangular hashset is contained in both pentagonal and hexagonal index within any index of both hashsets
        System.out.println(num);//If true, it prints the number value in the index of the triangular hashset being stored
      }
    }
  }
}
