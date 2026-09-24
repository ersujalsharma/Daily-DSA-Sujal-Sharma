/*

Given an array of size “N”; find the number of quadruplets; such that A[i] > A[j] < A[k] >A[l] such that i < j < k < l
A[i] > A[j] < A[k] >A[l]

A[i]>A[j] -> and note with j
A[j]<A[k] -> and note with j
A[j]<A[k] -> and note with k
A[k]>A[l] -> and note with k
*/

import java.util.Scanner;

public class Hashing_43_Google_OA_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] b = new int[n + 1];
        int[] pref = new int[n + 1];
        int[] suf = new int[n + 1];
        pref[1] = 0;
 
        for (int i = 1; i <= n; i++) {
            b[i] = scanner.nextInt();
        }
 
        int j = 2;
        while (j <= n) {
            int c = 0;
            int i = 1;
            while (i <= j - 1) {
                if (b[i] > b[j]) {
                    c++;
                }
                i++;
            }
            pref[j] = c;
            j++;
        }
 
        suf[n] = 0;
 
        int k = n - 1;
        while (k >= 1) {
            int c = 0;
            int l = k + 1;
            while (l <= n) {
                if (b[k] > b[l]) {
                    c++;
                }
                l++;
            }
            suf[k] = c;
            k--;
        }
 
        int result = 0;
        j = 1;
 
        while (j <= n) {
            int m = j + 1;
            while (m <= n) {
                if (b[j] < b[m]) {
                    result = result + pref[j] * suf[m];
                }
                m++;
            }
            j++;
        }
 
        System.out.println(result);
    }
}
