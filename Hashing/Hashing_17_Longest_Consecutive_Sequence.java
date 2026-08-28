/*

Question 14_1

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



*/

import java.util.HashSet;

public class Hashing_17_Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int []nums = {100,4,200,1,3,2};
        int ans = longestConsecutive(nums);
        System.out.println("Answer is "+ans);
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int i : nums){
            hashset.add(i);
        }
        HashSet<Integer> visited = new HashSet<>();
        int maxCount = 0;
        for(int i : hashset){
            if(visited.contains(i)) continue;
            int pick = i;
            int count = 1;
            while(hashset.contains(pick+1)){
                pick++;
                count++;
                visited.add(pick+1);
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
