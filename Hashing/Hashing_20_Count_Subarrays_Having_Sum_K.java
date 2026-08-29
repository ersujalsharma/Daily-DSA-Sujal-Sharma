
/*

Question - 16 
1 -> Count Subarrays having Sum K
GeeksForGeeks
Given an array arr[] of postive and negative integers, the objective is to find the number of subarrays having a sum exactly equal to a given number k.

*/

import java.util.HashMap;

public class Hashing_20_Count_Subarrays_Having_Sum_K {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10}, k = -10;
        int count = cntSubarrays(arr, k);
        System.out.println("Count of SubArrays with Sum K is -> "+count);
    }
    public static int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int sum = 0;
        hashmap.put(0,1);
        int count = 0;
        for(int i : arr){
            sum += i;
            if(hashmap.containsKey(sum-k)){
                count += hashmap.get(sum-k);
            }
            hashmap.put(sum,hashmap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
