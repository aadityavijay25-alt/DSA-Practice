package Sorting;

public class SelectionSort {
    public static void sortedArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,3};
        //selection sort
        for(int i = 0; i<arr.length-1; i++){
            //smallest element
            int s = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[s]>arr[j]){
                    s = j;
                }
            }
            int temp = arr[s];
            arr[s] = arr[i];
            arr[i] = temp;
        }
        sortedArray(arr);
    }
    
}
