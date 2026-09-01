/*

Given an array A consisting of N integers, 
returns the maximum sum of two numbers whose digits add up to an equal sum.
if there are not two numbers whose digits have an equal sum, the function should return -1.
*/

import java.util.HashMap;

public class Hashing_27_Microsoft_Coding_OA {
    public static void main(String[] args) {
        // int arr[] = {51, 71, 17, 42};
        // int arr[] = {42, 33, 60};
        int arr[] = {51, 32, 43};
        int ans = solution(arr);
        System.out.println("Answer is -> " + ans);
    }

    private static int solution(int[] arr) {
        // TODO Auto-generated method stub
        // Sum of Digit Maximum Number
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int maxSum = -1;
        for(int i : arr){
            int sumOfNumber = sum(i);
            if(hashmap.containsKey(sumOfNumber)){
                maxSum = Math.max(i + hashmap.get(sumOfNumber),maxSum);
            }
            hashmap.put(sumOfNumber,Math.max(hashmap.getOrDefault(sumOfNumber, 0),i));
        }
        return maxSum;
    }

    private static int sum(int i) {
        // TODO Auto-generated method stub
        int sum = 0;
        while(i>0){
            sum += i%10;
            i/=10;
        }
        return sum;
    }
    
}
