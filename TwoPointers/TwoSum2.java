package TwoPointers;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                System.out.println("Got It! Indices: " + (left + 1) + " " + (right + 1));
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
