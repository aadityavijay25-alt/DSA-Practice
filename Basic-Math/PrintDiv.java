import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;

public class PrintDiv {
    public static void main(String[] args) {
        int n = 36;
        List<Integer> ls = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ls.add(i);
                if (i != n / i) {
                    ls.add(n / i);
                }
            }
        }

        Collections.sort(ls);
        System.out.println("Sorted Divisors: " + ls);
    }
}
 