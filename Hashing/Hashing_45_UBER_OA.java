package Hashing;

import java.util.*;

/**
 * Hashing_25_UBER_OA
 *
 * Given an array of strings, for each string, calculate the total number of characters that match with every subsequent string at the same index. Compare only up to the length of the shorter string.
 * Return an array where each element contains its total matching-character count.
 *
 */
public class Hashing_45_UBER_OA {

    public static void main(String[] args) {
        int n = 3;
        List<String> X = Arrays.asList("abc", "ade", "abc");
        List<Integer> result = matchingCnt(n, X);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> matchingCnt(int n, List<String> X) {
        int[][] g = new int[1000][28];
        List<Integer> p = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            p.add(0);
        }

        for (int i = n - 1; i >= 0; i--) {
            String str = X.get(i);
            int c = 0;
            int d = str.length();
            for (int j = 0; j < d; j++) {
                int y = str.charAt(j) - 'a';
                c = c + g[j][y];
                g[j][y] = g[j][y] + 1;
            }
            p.set(i, c);
        }

        return p;
    }

}