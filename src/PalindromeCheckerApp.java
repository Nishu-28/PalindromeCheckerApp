/*
 * Application entry point
 *
 * This is the first method executed by the JVM
 * when the program starts.
 *
 * @author Developer
 * @Version 1.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Declare and initialize input
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume it's a palindrome
        boolean isPalindrome = true;

        // Compare characters using two-pointer technique
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}