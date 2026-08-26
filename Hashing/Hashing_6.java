/*

6. Find Sum of Range  [l……….r] where(l<=r) using Prefix sum.

*/

public class Hashing_6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,15};
        int l = 2, r = 4;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int sum = prefix[4]-prefix[0];
        System.out.println(sum);
    }
}
