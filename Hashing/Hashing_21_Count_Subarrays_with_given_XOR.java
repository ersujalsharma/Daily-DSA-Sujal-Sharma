/*

Question 16 -> 2
Count Subarrays with given XOR

Given an array of integers arr[] and a number k, the task is to count the number of subarrays having XOR of their elements as k.

*/

import java.util.HashMap;

public class Hashing_21_Count_Subarrays_with_given_XOR {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;

        System.out.println(subarrayXor(arr, k));
    }
    public static int subarrayXor(int[] arr, int k) {
        int count = 0;
        int xor = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(0, 1);
        for(int i : arr){
            xor ^= i;
            count += hashmap.getOrDefault(xor^k, 0);
            hashmap.put(xor,hashmap.getOrDefault(xor, 0)+1);
        }
        return count;
    }
}
