
/*

Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

*/

import java.util.HashMap;

public class Hashing_23_Longest_Subarray_with_Sum_K {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10}, k = 15;
        int longestSubArray = longestSubarray(arr,k);
        System.out.println("Longest Subarray Sum with K is -> "+longestSubArray);
    }
    public static int longestSubarray(int[] arr, int k) {

        int longest = 0;
        int sum = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=i;
            if(hashmap.containsKey(sum-k)){
                longest = Math.max(longest,i-hashmap.get(sum-k));
            }
            if(!hashmap.containsKey(sum)){
                hashmap.put(sum,i);
            }
        }
        return longest;
    }
}
