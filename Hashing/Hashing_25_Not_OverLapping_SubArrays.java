/**
 * Hashing_25
 * 
 * Maximum sum of two Not Overlapping SubArrays with given length
 */
public class Hashing_25_Not_OverLapping_SubArrays {

    public static void main(String[] args) {
        int nums[] = {0,6,5,2,2,5,1,9,4}, firstLen = 1, secondLen = 2;
        int ans = maxSumTwoNoOverlap(nums, firstLen, secondLen);
        System.out.println(ans); 
    }

    public static int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int sums[] = new int[nums.length+1];
        
        for(int i=1;i<=nums.length;i++){
            sums[i] = nums[i-1]+sums[i-1];
        }

        int maxLval = 0;
        int ans=0;

        for(int i=firstLen;i<=nums.length-secondLen;i++) {
            maxLval = Math.max(maxLval,sums[i]-sums[i-firstLen]);
            ans = Math.max(ans,sums[i+secondLen]-sums[i]+maxLval);
        }

        int maxRval = 0;
        for(int i=secondLen;i<=nums.length-firstLen;i++)
        {
            maxRval = Math.max(maxRval,sums[i]-sums[i-secondLen]);
            ans = Math.max(ans,sums[i+firstLen]-sums[i]+maxRval);
        }

        return ans;
    }
}