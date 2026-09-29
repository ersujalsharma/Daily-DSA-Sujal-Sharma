package Hashing;

import java.util.Arrays;

/*

-> Please find the increasing subsequence of size - “3” - Return true if it exists; return false if it does not exist

-> [ 18 5 4 3 2 1 8 10]

Answer :- True; [(1,8,10) , (5,8,10) , (4,8,10) , (3,8,10) ,(2,8,10)]

-> [ 5 4 3 2 1 8]

Answer :- False.



*/
public class Hashing_46_Amazon_OA {
    public static void main(String[] args) {
        int arr[] = {18, 5, 4, 2 ,1 ,8 ,10};
        int k = 3;
        int leftMin[] = new int[arr.length];
        Arrays.fill(leftMin, Integer.MAX_VALUE);
        for(int i=1;i<arr.length;i++){
            leftMin[i] = Math.min(arr[i-1]<arr[i]?arr[i-1]:Integer.MAX_VALUE,leftMin[i-1]);
        }
        System.out.println(Arrays.toString(leftMin));
        int rightMax = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=Integer.MAX_VALUE && arr[i]<rightMax){
                leftMin[i] = rightMax-leftMin[i];
                rightMax = Math.max(rightMax,arr[i]);
            }
            else{
                leftMin[i] = Integer.MAX_VALUE;
            }
        }
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>0 && arr[i]!=Integer.MAX_VALUE) flag = true;
        }
        System.out.println(
        Arrays.toString(leftMin)
        );
        System.out.println(flag);

    }
}
