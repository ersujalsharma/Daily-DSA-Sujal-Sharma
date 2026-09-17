/*

 -> A[N] 
 -> Find Pair -> (i,j)
 -> which satisfies both conditions
 -> i<j
 -> A[A[A[i]]] = A[A[A[j]]];

*/

import java.util.HashMap;

public class Hashing_37_Google_OA {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {0,4,2,1,2};
        int ans = countPair(arr);
        System.out.println("Answer is -> "+ ans);
    }

    private static int countPair(int[] arr) {
        // TODO Auto-generated method stub
        int count = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=1;i<arr.length;i++){
            count += hashmap.getOrDefault(arr[arr[arr[i]]], 0);
            hashmap.put(arr[arr[arr[i]]],hashmap.getOrDefault(arr[arr[arr[i]]], 0)+1);
        }
        return count;
    }
    
}
