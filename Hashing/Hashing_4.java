/*

4. Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [I<j]

-> Use two loops sum of both elements (b[I] - b[j] == K)
-> Optimised -> Keep storing elements in Hashmap and store like this (b[I]) and check if(k+b[j]) exist in the Hashmap count the frequency of element.


*/

import java.util.HashMap;

public class Hashing_4 {
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
            count += hashmap.getOrDefault(k+i,0);
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
        }
        return count;
    }
}
