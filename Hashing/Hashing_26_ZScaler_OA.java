/*

ZScaler OA - 

You are given an array “A”; in one step select largest element of array and convert it to second largest element of the array 

-> Tell the minimum number of steps such that all elements become equal 


*/

import java.util.*;

public class Hashing_26_ZScaler_OA {
    public static void main(String[] args) {
        int arr[] = {4,5,5,2,4};
        int ans = solution(arr);
        System.out.println("Answer is -> " + ans);
    }

    private static int solution(int[] arr) {
        // TODO Auto-generated method stub
        Map<Integer,Integer> treeMap = new TreeMap<>(
            (a,b) -> b-a
        ); 
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            treeMap.put(i, treeMap.getOrDefault(i, 0)+1);
            min = Math.min(min,i);
        }
        int count = 0;
        for(int i : treeMap.keySet()){
            if(min == i) break;
            count += count + treeMap.get(i);
        }
        System.out.println(treeMap);
        return count;

    }
}
