
/*

Leetcode 2006 - Count Number of Pairs With Absolute Difference K

Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

*/

import java.util.HashMap;

public class Hashing_19_Absolute_Difference_K {
    public static void main(String[] args) {
        int k = 1, nums[] = {1,2,2,1,1};
        int count = countKDifference(nums,k);
        System.out.println("Answer is -> "+count);
    }
    public static int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int count = 0;
        for(int i : nums){
            if(hashmap.containsKey(i+k)){
                count += hashmap.get(i+k);
            }
            if(hashmap.containsKey(i-k)){
                count += hashmap.get(i-k);
            }
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
        }
        return count;
    }
}
