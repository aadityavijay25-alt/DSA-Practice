package Hashing;
import java.util.*;

public class CountFreq {
    public static void main(String[] args) {
        int[] nums = {2,3,5,5,3,2,3,3,};
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            ans.add(pair);
        }
        System.out.println(ans);
    }
    
}
