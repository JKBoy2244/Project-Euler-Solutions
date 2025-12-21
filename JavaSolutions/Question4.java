import java.util.Scanner;

public class Main {
  public static boolean palindrome(int n) {
    String numStr = String.valueOf(n);//Converts int to string
    int left = 0;
    int right = numStr.length() - 1; 

    while (left < right) {
      if (numStr.charAt(left) != numStr.charAt(right)) { //
        return false;
      }
      left++;//Shifts left by 1 position forward
      right--;//Shifts right by 1 position backward
    }
    return true;
  }

  public static void main(String[] args) {

    int highestPalindrome = -1;//Initialises palindrome

    for (int i = 1; i <= 999; i++) {//Iterates through 1 to 999 in the loop all in order
      for (int j = 1; j <= 999; j++) {//For each i value, program again iterates through 1 to 999, so in total, the program in this code part for the method iterates 999x999 = 998001 times in total
        int k = i*j; //For each i and j value, multiplies to get k
        if (palindrome(k) == true && k > highestPalindrome) { //Checks if k is palindromic each time and if it's higher than the previous highest palindrome value
          highestPalindrome = k;//If so, then it gets replaced by the k value
        }
      }
    }

    System.out.println(highestPalindrome);//Program prints highestPalindrome value for 3 digit numbers multiplying together
  }
}
