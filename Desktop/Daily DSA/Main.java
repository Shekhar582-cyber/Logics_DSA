// Given an array of integers nums and an integer target, return the indices of two numbers such that they add up to the target.

// 👉 Conditions:

// Exactly one solution exists
// You cannot use the same element twice

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
       
        }
        return new int[] {};
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new Solution().twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
