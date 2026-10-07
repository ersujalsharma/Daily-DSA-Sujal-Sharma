package Hashing;

import java.util.HashMap;

/*

Q:- Given an array of size “N”; find the shortest subarray such that the sum of first and last element of the subarray is “k” (Subarray should at least be of size>=2)

->[5 6 7 8 10 4 3 2 1] K = 8 

-> 7 

find sum of two elemens and the difference between two element should be >=2


Brute Force:- https://ideone.com/zra7vm

TC :- O(N*N)
Space.-> O(1)

*/
public class Hashing_48_Amazon_SDE_2 {
    public static void main(String[] args) {
        int arr[] = {5 , 6 , 7 , 8 , 10 , 4 , 3 , 2 , 1, 1, 1, 3, 1 , 4, 6, 7, 1};
        int size = Integer.MAX_VALUE;
        int k = 8;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==k){
        //             size = Math.min(size,j-i+1);
        //         }
        //     }
        // }
        int smallest = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hashmap.containsKey(k-arr[i])){
                smallest = Math.min(i-hashmap.get(k-arr[i])+1, smallest);
            }
            hashmap.put(arr[i], i);
        }

        System.out.println("Smallest SubArray size is -> "+smallest);

        // find the longest

        int largest = 0;
        HashMap<Integer,Integer> hashmap2 = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hashmap2.containsKey(k-arr[i])){
                largest = Math.max(i-hashmap2.get(k-arr[i])+1, largest);
            }
            hashmap2.putIfAbsent(arr[i], i);
        }


        System.out.println("Largest SubArray size is -> "+largest);

    }
}
