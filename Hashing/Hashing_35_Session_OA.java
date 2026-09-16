/*

Q. Find the count of special subarrays in an array 

 Special Subarray :- Subarray of shortest length whose sum==k

A = {10,5,2,7,1,9,8,7}   k = 15


*/

import java.util.HashMap;

public class Hashing_35_Session_OA {
    public static void main(String[] args) {
        int A[] = {10,5,2,7,1,9,8,7} ,  k = 15;
        int ans = countSmallestLengthOfGoodSubArray(A,k);
        System.out.println("Answer is -> "+ ans);
    }

    private static int countSmallestLengthOfGoodSubArray(int[] a, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        hashmap.put(sum,-1);
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(hashmap.containsKey(sum-k)){
                ans = Math.min(ans,i-hashmap.get(sum-k));
            }
            hashmap.put(sum,i);
        }
        return ans;
    }

}
