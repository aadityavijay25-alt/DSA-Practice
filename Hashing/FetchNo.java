package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FetchNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr.length; i++){
           hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        
        
        int q = sc.nextInt();
        while(q-->0){
            int num = sc.nextInt();
            System.out.println(hashMap.getOrDefault(num,0 ));
        }
    }
    
}
