package Hashing;
/*

9. Find count of shortest/largest subarrays with sum k in given array

We can use either two loops to find the largest and smallest subarray with sum,

->
Use two Hashmap to store,
In first store first occurrence, and this would give the largest array.
In second store last occurrence, so we can find the least size sub array.

*/
import java.util.*;
public class Hashing_9 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> lastOccurence = new HashMap<>();
        HashMap<Integer,Integer> firstOccurence = new HashMap<>();
        int arr[] = {1,1,1,1,2,1};
        int k = 3;
        int sum = 0;
        int maxLength = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        int minEnd = 0;
        firstOccurence.put(0, -1);
        lastOccurence.put(0, -1);
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            if(firstOccurence.containsKey(sum-k)){
                if(maxLength < (i-firstOccurence.get(sum-k))){
                    maxLength = i-firstOccurence.get(sum-k);
                    maxStart = firstOccurence.get(sum-k)+1;
                    maxEnd = i;
                }
                if(minLength > (i-lastOccurence.get(sum-k))){
                    minLength = i-lastOccurence.get(sum-k);
                    minStart = lastOccurence.get(sum-k)+1;
                    minEnd = i;
                }
            }

            if(!firstOccurence.containsKey(sum)){
                firstOccurence.put(sum, i);
            }
            lastOccurence.put(sum,i);
        }
        System.out.println(maxLength +" " + maxStart +" " + maxEnd +" "+ minLength + " " + minStart +" "+minEnd);
        
        // count smallest and largest with sliding window.
        
        int smallestSubArrayCount = count(arr,minLength,k);
        int largestSubArrayCount = count(arr,maxLength,k);
        System.out.println(smallestSubArrayCount +" " + largestSubArrayCount);
    }

    private static int count(int[] arr, int minLength, int k) {
        // TODO Auto-generated method stub
        int i=0;
        int j=0;
        int sum = 0;
        int count = 0;
        while(j<minLength){
            sum +=arr[j++];
        }
        if(sum==k) count++;
        while(j<arr.length){
            sum-=arr[i++];
            sum+=arr[j++];
            if(sum == k){
                count++;
            }
        }
        return count;
    }
    
}
