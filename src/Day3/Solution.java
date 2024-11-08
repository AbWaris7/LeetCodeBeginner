package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    /**
     * This method implements the FizzBuzz problem. It returns a list of strings
     * from 1 to n with appropriate substitutions for multiples of 3, 5, and both.
     *
     * @param n The upper bound integer (inclusive) for generating the FizzBuzz sequence.
     * @return A list of strings representing the FizzBuzz sequence.
     */
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n); // Initialize list with an estimated size
        for (int i = 1; i <= n; i++) {
            boolean dividedBy3 = i % 3 == 0;
            boolean dividedBy5 = i % 5 == 0;
            if (dividedBy3 && dividedBy5) {
                result.add("FizzBuzz");
            } else if (dividedBy3) {
                result.add("Fizz");
            } else if (dividedBy5) {
                result.add("Buzz");
            } else {
                result.add("" + i);
            }
        }
        return result;
    }

    /**
     * The main entry point for the program. It reads an integer from the user,
     * generates the FizzBuzz sequence, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(n));
        scanner.close();
    }
}
