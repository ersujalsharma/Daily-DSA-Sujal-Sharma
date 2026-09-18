/*

Given an array of size “N” ; find the number of unordered-pairs (i,j) such that - 
|a[i]-a[j]| + |a[i]+a[j]| = target 

If pair(i,j) is valid ; then pair (j,i) is also valid. Questions is asking to check unordered-pair hence -> you will count both of them as only 1 


*/

import java.util.Arrays;
import java.util.HashMap;

public class Hashing_39_DE_SHAW {
    public static void main(String[] args) {
        int arr[] = {1,4,-1,2};
        int sumVal = 4;
        int ans = help(arr,sumVal);
        System.out.println("Answer is -> " + ans);
    }

    private static int help(int[] a, int t) {
        int answer = 0;
        if (t % 2 == 0) {
            long positive = t / 2;
            long negative = -positive;
 
            long c1 = 0, c2 = 0, c5 = 0, c8 = 0;
 
            for (int i = 0; i < a.length; i++) {
                if (a[i] == positive) c1++;
                if (a[i] == negative) c2++;
 
                if (a[i] >= 0 && a[i] < positive) c5++;
 
                if (a[i] < 0 && a[i] > negative) c8++;
            }
 
            answer += (c1 * (c1 - 1)) / 2;
            answer += (c2 * (c2 - 1)) / 2;
            answer += c1 * c5;
            answer += c2 * c8;
            answer += c1 * c8;
            answer += c2 * c5;
        }
        return answer;
    }
}
