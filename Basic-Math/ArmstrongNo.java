public class ArmstrongNo {
    public static void main(String[] args) {
        int n = 37;
        int sum =0;
        int originalNum = n;
        while(n>0){
            int rem = n % 10;
            sum = sum + (int)Math.pow(rem, 3) ; 
            n = n/10;
            
        }
        if (originalNum == sum){
                System.out.println(originalNum + " is a Armstrong No.");
            } else {
                System.out.println(originalNum + " is not an Armstrong No.!!");
            }
    }
    
}
