import java.util.Scanner;

public class checkDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
        int originalNum = n;
        int digitSum = 0;
        int digitProd = 1;

        while(n>0){
            int ld = n %10;
            digitSum += ld;
            digitProd *= ld;
            n = n/10;
        }
        int finalSum = digitSum + digitProd;
        if(finalSum == originalNum){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }    
}
