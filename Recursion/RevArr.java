package Recursion;

import java.util.Scanner;
import java.util.Arrays;

public class RevArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        reverse(0, n, arr);
   
        System.out.println("Reversed array: " + Arrays.toString(arr));
        sc.close();
    }
    public static void reverse(int i, int n, int[] arr) {
        if (i >= n / 2) {
            return;
        }
        
        swap(i, n - i - 1, arr);
        
        reverse(i + 1, n, arr);
    }
    public static void swap(int a, int b, int[] arr) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
