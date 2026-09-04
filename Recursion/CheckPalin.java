package Recursion;

import java.util.Scanner;

public class CheckPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
         
        s = s.toLowerCase();
        boolean isPalindrome = isPalindromeRecursive(s, 0);
        System.out.println(isPalindrome);
    }
    public static boolean isPalindromeRecursive(String s, int i) {
        if (i >= (s.length() / 2)) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return isPalindromeRecursive(s, i + 1);
    }
}
