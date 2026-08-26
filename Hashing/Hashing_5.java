/*

5. Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0]

b[I] - b[j] = k
b[I] = b[j] + k
b[j] - b[I] = k
b[I] = b[j] - k

Check b[j]+k , b[j]-k if exist then count for 1-2 and 2-1 both are different.

LeetCode - https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

*/

import java.util.HashMap;

public class Hashing_5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,15,3,19};
        int k = 12;
        int count = countPairs(arr,k);
        System.out.println(count);
    }
    public static int countPairs(int[] arr,int k){
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int count = 0;
        for(int i : arr){
            count += hashmap.getOrDefault(i+k,0);
            count += hashmap.getOrDefault(i-k,0);
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
        }
        return count;
    }
}
