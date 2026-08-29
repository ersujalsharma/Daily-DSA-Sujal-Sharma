
/*

Q2. Find the Prefix Common Array of Two Arrays

You are given two 0-indexed integer permutations A and B of length n.

A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.

Return the prefix common array of A and B.

A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.

Note: Please do not copy the description during the contest to maintain the integrity of your submissions.

*/

import java.util.Arrays;
import java.util.HashMap;

public class Hashing_22_Find_the_Prefix_Common_Array_of_Two_Arrays {
    public static void main(String[] args) {
        int[] A = {1,3,2,4}, B = {3,1,2,4};
        int ans[] = findThePrefixCommonArray(A , B);
        System.out.println("Answer is -> " + Arrays.toString(ans));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> hashmapA = new HashMap<>();
        HashMap<Integer,Integer> hashmapB = new HashMap<>();
        int countArray[] = new int[A.length];
        int count = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                count++;
            }
            else{
                hashmapA.put(A[i],hashmapA.getOrDefault(A[i],0)+1);
                hashmapB.put(B[i],hashmapB.getOrDefault(B[i],0)+1);
                if(hashmapB.containsKey(A[i])){
                    hashmapB.put(A[i],hashmapB.get(A[i])-1);
                    if(hashmapB.get(A[i])==0){
                        hashmapB.remove(A[i]);
                    }
                    count++;
                }
                if(hashmapA.containsKey(B[i])){
                    hashmapA.put(B[i],hashmapA.get(B[i])-1);
                    if(hashmapA.get(B[i])==0){
                        hashmapA.remove(B[i]);
                    }
                    count++;
                }
            }
            countArray[i] = count;
        }
        return countArray;
    }
}
