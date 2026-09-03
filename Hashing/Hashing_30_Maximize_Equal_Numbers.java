
/*

Maximize equal numbers

A[n] -> Integer (k)

perform -> 1<=i<=n
ai by ai+xi 

*/


public class Hashing_30_Maximize_Equal_Numbers {
    public static void main(String[] args) {
        int t = 2;
        int arr[] = {2,2,5,6};
        int i=0;
        int j=0;
        int result = 0;
        while(j<arr.length){
            while(arr[j]-arr[i]>2*t){
                i++;
            }
            result = Math.max(result,j-i+1);
            j++;
        }
        System.out.println("Answer is -> " + result);
    }
}
