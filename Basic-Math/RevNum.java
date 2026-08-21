import java.util.Scanner;
public class RevNum {
    public int reverse(int x) {    
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        
        int input = scanner.nextInt();
        
        RevNum solver = new RevNum();
        int result = solver.reverse(input);
        
        System.out.println("Reversed result: " + result);
        scanner.close();
    }
}

    

