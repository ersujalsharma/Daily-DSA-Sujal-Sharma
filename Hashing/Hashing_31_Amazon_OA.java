import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing_31_Amazon_OA {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        int k = 4;
        long ans = help(arr,k);
        System.out.println("Answer is -> "+ans);
    }

    private static long help(int[] arr, int k) {
        
        int sum[] = new int[arr.length];
        sum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i] = sum[i-1]+arr[i];
        }
        // 
        System.out.println(Arrays.toString(sum));

        Map<Long, Long> freq = new HashMap<>();
        freq.put(0L, 1L);
        long count = 0;
 
        for (int j = 0; j < arr.length; j++) {
            long modPrefix = ((sum[j] % k - j % k + k) % k);
            count += freq.getOrDefault(modPrefix, 0L);
            freq.put(modPrefix, freq.getOrDefault(modPrefix, 0L) + 1);
        }

        return count;
    }

}
