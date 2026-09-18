/*

Given an array of size “N” ; find the number of unordered-pairs (i,j) such that - 
|a[i]-a[j]| + |a[i]+a[j]| = target 

If pair(i,j) is valid ; then pair (j,i) is also valid. Questions is asking to check unordered-pair hence -> you will count both of them as only 1 


*/

import java.util.Arrays;
import java.util.HashMap;

public class Hashing_39_DE_SHAW {
    public static void main(String[] args) {
        int arr[] = {1,4,-1,2};
        int sumVal = 4;
        int ans = help(arr,sumVal);
        System.out.println("Answer is -> " + ans);
    }

    private static int help(int[] arr, int sumVal) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int count = 0;
        for(int i : arr){
            hashmap.put(i,hashmap.getOrDefault(i, 0)+1);
        }
        return count;
    }
}
