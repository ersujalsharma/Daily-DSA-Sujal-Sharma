
/*
2. Check if there are any two Equal numbers in an array at a distance less than or equal to k

-> Use 2 Loops and check if distance between any 2 Equal elements is less than or equal to K.
-> Optimised using HashMap -> Keep Element at last place and check if difference between equal elements is less than K.
*/

import java.util.HashMap;

public class Hashing_2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,4,5,3};
        int k = 3;
        boolean flag = check(arr,k);
        System.out.println(flag);
    }
    public static boolean check(int arr[], int k){
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        // store last number index address.
        for(int i=0;i<arr.length;i++){
            if(hashmap.containsKey(arr[i])){
                int last = hashmap.get(arr[i]);
                if(i-last <= k){
                    return true;
                }
            }
            hashmap.put(arr[i],i);
        }
        return false;
    }
}
