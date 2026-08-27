/*

Question_12 - 1
Max Distance Between Two Occurrences

*/

import java.util.HashMap;

public class Hashing_14_Max_Distance_Between_Two_Occurrences {
    public static void main(String[] args) {
        int []arr = {
            // 1, 1, 2, 2, 2, 1, 2, 3, 1, 1, 2, 1
            3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2
        };
        int val = help(arr);
        System.out.println("Maximum Occurence between "+val);
    }

    private static int help(int[] arr) {
        // Use HashMap to store elements first occurence, so that you can store mac distance.
        int max = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0 ; i < arr.length ; i++){
            if(hashmap.containsKey(arr[i])){
                max = Math.max(max,i-hashmap.get(arr[i]));
            }
            hashmap.putIfAbsent(arr[i], i);
        }
        return max;
    }

}
