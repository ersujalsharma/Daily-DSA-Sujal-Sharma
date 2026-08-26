/*

7. Find count of number of subarrays with sum ==  k

*/

import java.util.*;

public class Hashing_7 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1,1};
        int k = 3;
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(0,1);
        for(int i : arr){
            sum += i;
            count += hashmap.getOrDefault(sum-k, 0);
            hashmap.put(sum,hashmap.getOrDefault(sum, 0)+1);
        }
        System.out.println(count);
    }
}
