/*

Maximum Sum Selection

You are given an integer array A of size N. Your task is to select exactly B elements from either the left end or the right end of the array A in order to maximize the sum of the selected elements.

Here are the details of the problem:

You are given an integer array A of size N where 1 <= N <= 10^5.
You need to select exactly B elements from either the left end or the right end of the array A.
The goal is to find and return the maximum possible sum of elements you can pick.

Input:

An integer array A of size N where each element A[i] satisfies -103 <= A[i] <= 103.
An integer B where 1 <= B <= N.
Output:

An integer representing the maximum possible sum of selected elements.

[5, -2, 3, 1, 2], 3 -> 8

*/

import java.util.Arrays;

public class Hashing_38_MediaDotNet_OA {
    public static void main(String[] args) {
        int arr[] = {5, -2, 3, 1, 2};
        int b = 3;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int suffix[] = new int[arr.length];
        suffix[suffix.length-1] = arr[arr.length-1];
        for(int i=suffix.length-2;i>=0;i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix)); 
        int max = 0;
        for(int i=0;i<b;i++){
            int sum = 0;
            if(i!=0) sum+=prefix[i-1];
            sum+=suffix[arr.length-(b-i)];
            System.out.println(i +" "+ (arr.length-(b-i)));
            max = Math.max(max,sum);
        }
        System.out.println("Answer is -> "+max);
    }
}
