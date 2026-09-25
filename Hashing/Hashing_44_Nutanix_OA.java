package Hashing;

import java.util.HashMap;

public class Hashing_44_Nutanix_OA {
    public static void main(String[] args) {
        int[] A = { 2, 5 }, B = { 3, 8 }, C = { -5, 8 }, D = { 5, 10 }, E = { -10, 100 };
        int ans = help(A, B, C, D, E);
        System.out.println("Answer is -> " + ans);
    }

    private static int help(int[] a, int[] b, int[] c, int[] d, int[] e) {
        int ab[] = new int[a.length * b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                ab[(i * a.length) + j] = a[i] + b[j];
            }
        }
        int abe[] = new int[ab.length * e.length];
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < e.length; j++) {
                abe[(i * ab.length) + j] = ab[i] + e[j];
            }
        }
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int cd[] = new int[c.length * d.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d.length; j++) {
                cd[(i * c.length) + j] = c[i] + d[j];
                hashmap.put(c[i] + d[j], hashmap.getOrDefault(c[i] + d[j], 0) + 1);
            }
        }
        int count = 0;
        for (int i : abe) {
            count += hashmap.getOrDefault(-i, 0);
        }
        return count;
    }
}
