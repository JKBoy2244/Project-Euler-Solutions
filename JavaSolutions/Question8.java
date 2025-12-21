public class Main {
    public static void main(String[] args) {
       
        String number =
            "73167176531330624919225119674426574742355349194934" +  //This stores the 1000 digit values entirely as string.
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450";

        long maxProduct = 0; //Initialises maxProduct as 0 (long variable - not int)
        
        for (long i = 0; i <= number.length() - 13; i++) {//Uses a continuous loop from 0 to 12 to find any adjacent 13-digit values in the box block of 50 by 20 grid digits
            long product = 1; //Initialises product as 1 (long variable - not int)
            
            for (long j = 0; j < 13; j++) { //Iterates through a continuous loop from 0 to 12 (13 times)
                long digit = Character.getNumericValue(number.charAt((int)(i + j)));
                product *= digit;
            }
            
            if (product > maxProduct) { //Checks if the product is greater than the previously stored maxProduct
                maxProduct = product; //If so, replaces it with the ne prodcut value obtained
            }
        }
        
        System.out.println(maxProduct); //Program displays final value of maxProduct after completing all sets of iterations
    }
} //long is used instead of int due to using excessively long values like 9 to 10 digits where long would most likely give the correct data rather than using int as int is inefficient for storing 9 to 10 digit values unlike long
