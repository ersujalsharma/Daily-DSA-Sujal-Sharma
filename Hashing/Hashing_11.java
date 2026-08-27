package Hashing;

import java.util.HashMap;

/*

11. Frequency of an Element in Given Array

*/
public class Hashing_11 {
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 2, 1}, x=2;
        int freqCount = freq(arr,x);
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i : arr) hashmap.put(i,hashmap.getOrDefault(i, 0)+1);
        System.out.println(hashmap.get(x));
        System.out.println(freqCount);
    }

    private static int freq(int[] arr, int x) {
        int count = 0;
        for(int i=0;i<arr.length ;i++){
            if(arr[i] == x) count++;
        }
        return count;
    }

}
