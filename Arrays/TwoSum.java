import java.util.Arrays;

class Solution { 
    public int[] twoSum(int[] nums, int target) { 
        int[] arr = new int[2]; 
        for(int i = 0; i < nums.length; i++){ 
            for(int j = i + 1; j < nums.length; j++){ 
                if(nums[i] + nums[j] == target){ 
                    arr[0] = i; 
                    arr[1] = j; 
                    break; 
                } 
            } 
        } 
        return arr; 
    } 
}


class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solver.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
