import java.util.HashMap;

public class Hashing_41_Leetcode_4_Sum_II {

    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {-2,-1} , nums3 = {-1,2} , nums4 = {0,2};
        int ans = fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println("Answer is -> "+ ans);

    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> firstTwoSum = new HashMap<>();
        HashMap<Integer,Integer> secondTwoSum = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                firstTwoSum.put(nums1[i]+nums2[j],firstTwoSum.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }
        System.out.println(firstTwoSum);
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                secondTwoSum.put(nums3[i]+nums4[j],secondTwoSum.getOrDefault(nums3[i]+nums4[j],0)+1);
            }
        }
        int count = 0;
        for(int i : firstTwoSum.keySet()){
            if(secondTwoSum.containsKey(-i)){
                count += firstTwoSum.get(i)*secondTwoSum.get(-i);
            }
        }
        System.out.println(secondTwoSum);
        return count;
    }
}
