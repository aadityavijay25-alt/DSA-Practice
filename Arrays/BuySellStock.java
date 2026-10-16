public class BuySellStock {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
         int profit = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                profit += a[i] - a[i - 1];
            }
    }
    System.out.println(profit);
}
}
    

