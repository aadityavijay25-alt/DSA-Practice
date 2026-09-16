package Hashing;
import java.util.Scanner;

public class FetchChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        // pre compute
        int[] hash = new int[26];
        for(int i = 0; i< s.length(); i++){
            hash[s.charAt(i) -'a']++;
        }
        int q = sc.nextInt();
          sc.nextLine(); 

          while (q-- > 0) {
          String line = sc.nextLine();
            if (!line.isEmpty()) {
            char c = line.charAt(0);
            System.out.println(hash[c - 'a']);
           }
        }

    }
    
}
