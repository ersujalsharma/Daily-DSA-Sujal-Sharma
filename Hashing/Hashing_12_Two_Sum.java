package Hashing;

import java.util.*;

/*

12. Two Sum

You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/
public class Hashing_12_Two_Sum {
    
    public static void main(String[] args) {
        int arr[] = {2,7,11,15}, target = 22;
        // int pair[] = twoSumUsingHashing(arr,target);
        int pair[] = twoSumUsingTwoPointers(arr,target);
        System.out.println(Arrays.toString(pair));
    }

    private static int[] twoSumUsingTwoPointers(int[] arr, int target) {
        int arr2[][] = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            arr2[i][0] = arr[i];
            arr2[i][1] = i;
        }
        Arrays.sort(arr2,(a,b)->a[0]-b[0]);
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr2[start][0]+arr2[end][0]==target){
                return new int[]{arr2[start][1],arr2[end][1]};
            }
            else if(arr2[start][0]+arr2[end][0] < target){
                start++;
            }
            else{
                end--;
            }
        }
        return null;
    }

    public static int[] twoSumUsingHashing(int[] nums, int target) {
        // a+b = target
        // store a and find (target-b)
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(target - nums[i])){
                return new int[]{hashmap.get(target-nums[i]),i};
            }
            hashmap.put(nums[i],i);
        }
        return null;
    }

}
