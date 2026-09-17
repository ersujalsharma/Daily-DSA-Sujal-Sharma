/*

Q. Find the count of subarray of longest length whose sum==k
A = {10,5,2,7,1,9,8,7}   k = 15


*/

import java.util.HashMap;

public class Hashing_36_Homework {
    public static void main(String[] args) {
        int A[] = {10,5,2,7,1,9,8,7} ,  k = 15;
        int ans = countLongestLengthOfGoodSubArray(A,k);
        System.out.println("Answer is -> "+ ans);
    }

    private static int countLongestLengthOfGoodSubArray(int[] a, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int ans = 0;
        int sum = 0;
        hashmap.put(sum,-1);
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(hashmap.containsKey(sum-k)){
                ans = Math.max(ans,i-hashmap.get(sum-k));
            }
            hashmap.putIfAbsent(sum,i);
        }
        return ans;
    }
}
