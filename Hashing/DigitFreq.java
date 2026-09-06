package Hashing;

import java.util.Scanner;

public class DigitFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitFreq(n, d);
        System.out.println(f);
        System.out.println(f * d );
    }
    public static int getDigitFreq(int n , int d){
        int rv =0;
        while(n>0){
            int dig =n%10;
            n = n/10;
            if(dig == d){
                rv++;
            }
        }
        return rv;

    }
    
}
