public class Main {
    public static void main(String[] args) {
        StringBuilder value = new StringBuilder();
        int i = 1;

        while (value.length() < 1000001) { // only generate as many digits as needed
            value.append(i);
            i++;
        }

        String decimalPart = value.toString();
        int product =
            Character.getNumericValue(decimalPart.charAt(0)) *     // 1st digit
            Character.getNumericValue(decimalPart.charAt(9)) *     // 10th digit
            Character.getNumericValue(decimalPart.charAt(99)) *    // 100th digit
            Character.getNumericValue(decimalPart.charAt(999)) *   // 1000th digit
            Character.getNumericValue(decimalPart.charAt(9999)) *  // 10000th digit
            Character.getNumericValue(decimalPart.charAt(99999)) * // 100000th digit
            Character.getNumericValue(decimalPart.charAt(999999)); // 1000000th digit

        System.out.println("Product of digits: " + product);
    }
}
