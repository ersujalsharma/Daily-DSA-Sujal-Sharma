package Hashing;
/*
1. We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.

Arr = [3, 2, 3, 2, 4, 3]

3 -> 3
2 -> 2
4 -> 1

Count each element’s Frequency and the with minimum -> store the element frequency and min element.
And store the maximum frequency with maximum elements.

Optimised Approach -> Use HashMap to store element and go through the Hashmap to find maximum free and elements.
*/
import java.util.*;
public class Hashing_1 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2, 4, 3, 2, 2};
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i : arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        int max = 0;
        int maxElement = 0;
        int min = Integer.MAX_VALUE;
        int minElement = 0;
        for(int i : freqMap.keySet()){
            if(freqMap.get(i)>max){
                max = freqMap.get(i);
                maxElement = i;
            }
            if(freqMap.get(i)<min){
                min = freqMap.get(i);
                minElement = i;
            }
        }
        System.out.println("Min element is = " + minElement + " with min freq " + min + " Max element is = "+maxElement + " with max freq is "+max);
    }
}
