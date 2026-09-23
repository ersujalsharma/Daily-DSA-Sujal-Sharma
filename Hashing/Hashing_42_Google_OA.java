/*

Problem.-> Given an array of size “N”; find the number of triplets; such that A[i] >A[j]< A[k] such that i < j < k ; 

1<=N<=1000


*/


public class Hashing_42_Google_OA {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1,2,3,4,5};
        int count = help(arr);
        System.out.println("Count is. -> "+count);
    }

    private static int help(int[] arr) {
        // TODO Auto-generated method stub
        int prevCount[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    prevCount[j]++;
                }
            }
        }
        int nextCount[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    nextCount[i]++;
                }
            }
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count += prevCount[i]*nextCount[i];
        }
        return count;
    }
}
