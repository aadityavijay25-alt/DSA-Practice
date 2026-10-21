public class PowerOfFour {
    public static void main(String[] args) {
        int n = 3;
    boolean res = n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    System.out.println(res);
    }
    
    
}
