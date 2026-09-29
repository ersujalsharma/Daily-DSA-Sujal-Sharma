package Hashing;

/*

Input: arr[] = {1,1,1,0,0,0,1,1,1};;

// find total sum and divide them by 2 if it is divisible by 2 then find the possible partition to find the array with sum target/2;

2nd  FOllow Up -> {1,0,1,0,0,1};
find in how many ways we can partition the array in three equal parts


*/

public class Hashing_47_Atlassin_OA {

    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,0,1};
        int count = partitionInK(arr,0,arr.length-1,3);
        System.out.println("Answer is -> "+ count);
    }



    private static int partitionInK(int[] arr, int left, int right, int k) {
        // TODO Auto-generated method stub
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum+=arr[i];
        }
        if(sum%k!=0) return -1;
        int target = sum/k;
        int prev = target;
        int count = 0;
        for(int i=left;i<=right;i++){
            target -= arr[i];
            if(target == 0){
                if(k==2){
                    System.out.println(left+" / "+i);
                    count++;
                }
                else if((sum-prev)%(k-1)==0){
                    count += partitionInK(arr, i+1, right, k-1);
                }
            }
        }
        return count;
    }



    private static int help(int[] arr) {
        // TODO Auto-generated method stub
        int sum = 0;
        for(int i : arr) sum += i;
        if(sum%2!=0) return -1;
        int target = sum/2;
        int count = 0;
        for(int i : arr){
            target -= i;
            if(target == 0){
                count++;
            }
        }
        return count;
    }

}
