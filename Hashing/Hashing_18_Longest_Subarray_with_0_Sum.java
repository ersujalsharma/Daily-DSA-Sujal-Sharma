
/*

Question 14 -> 2
Longest Subarray with 0 Sum

Given an array arr[] consisting of both positive and negative integers, find the length of the longest subarray whose elements sum is zero.
A subarray is a contiguous part of an array, formed by selecting one or more consecutive elements while maintaining their original order.



*/

import java.util.HashMap;

public class Hashing_18_Longest_Subarray_with_0_Sum{
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10};
        int maxLength = maxLength(arr);
        System.out.println("Length SubArray sum with 0 is -> "+maxLength);
    }
    public static int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int sum = 0;
        hashmap.put(0,-1);
        int maxLength = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            if(hashmap.containsKey(sum)){
                maxLength = Math.max(maxLength,i-hashmap.get(sum));
            }
            else
                hashmap.put(sum,i);
        }
        return maxLength;
    }
}
