package Sorting;

public class BubbleSort {
    public static void sortedArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,8,7,5,1};
        // Bubble sort
        for(int i=0; i<arr.length-1; i++){ //n-1
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        sortedArray(arr);
    }
    
}
