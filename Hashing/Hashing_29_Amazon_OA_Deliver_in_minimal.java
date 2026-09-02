/*

Deliver Orders in as few as possible.

1. Choose two package with the same weight.
2. Choose three package with the same weight.

*/

import java.util.HashMap;

public class Hashing_29_Amazon_OA_Deliver_in_minimal {
    public static void main(String[] args) {
        int packageWeight[] = {1,1,1,2,2,2,2};
        int ans = solution(packageWeight);
        System.out.println("Answer is -> "+ans);
    }

    private static int solution(int[] packageWeight) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i : packageWeight){
            hashmap.put(i,hashmap.getOrDefault(i, 0)+1);
        }
        int count = 0;
        for(int i : hashmap.values()){
            if(i==1) return -1;
            if(i==2){
                count++;
            }
            else
                count += i/3 + (i%3==1?1:0);
        }
        return count;
    }
}
