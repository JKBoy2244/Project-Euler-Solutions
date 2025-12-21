import java.util.*;  // Import utility classes like ArrayList and Collections

public class Question41 {

    // Main method: this is the entry point of the program
    public static void main(String[] args) {
        // Loop from 7 down to 1, since 8- and 9-digit pandigital numbers are divisible by 3
        for (int n = 7; n >= 1; n--) {
            // Generate the digits 1 to n as a list of characters
            List<Character> digits = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                digits.add((char) ('0' + i));
            }

            // Store permutations of the digits
            List<String> permutations = new ArrayList<>();
            generatePermutations("", digits, permutations);

            // Sort permutations in descending order to find the largest prime first
            Collections.sort(permutations, Collections.reverseOrder());

            // Check each permutation to see if it is a prime number
            for (String s : permutations) {
                int num = Integer.parseInt(s);
                if (isPrime(num)) {
                    // Print the result and exit
                    System.out.println("Largest pandigital prime: " + num);
                    return;  // Exit program after finding the largest one
                }
            }
        }
    }

    // Helper method to generate all permutations of given digits
    public static void generatePermutations(String prefix, List<Character> remaining, List<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);  // Base case: no more digits to add
            return;
        }
        // Loop through the list and build new prefixes recursively
        for (int i = 0; i < remaining.size(); i++) {
            List<Character> newRemaining = new ArrayList<>(remaining);
            char ch = newRemaining.remove(i);  // Take one character out
            generatePermutations(prefix + ch, newRemaining, result);  // Recursive call
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;             // Numbers less than 2 are not prime
        if (n == 2 || n == 3) return true;   // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false; // Eliminate multiples of 2 and 3

        // Check for factors up to the square root of n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;  // Passed all checks, it's a prime
    }
}
