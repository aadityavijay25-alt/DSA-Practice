package TwoPointers;
public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4,6};
        int i = 0;
        int res = 1;
        int j = 1;
        while(j<arr.length){
            if(arr[j] == arr[j-1]){
                j++;
                continue;
            } else{
                arr[i+1] = arr[j];
                i++;
                res++;
                j++;
            }
        }
        System.out.println(res);
    }
    
}
