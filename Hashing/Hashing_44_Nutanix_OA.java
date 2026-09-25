package Hashing;

/*

Given 5 arrays :- A,B,C,D,E  all of size “N”

Element in the array can range from [-10^9……….10^9]

Find the number of tuplets (i,j,k,l,m) such that  -

a[i] + b[j] + c[k] + d[l] + e[m] = 0

A = [2 5]
B = [3 8]
C = [-5 8]
D = [5 10]
E = [-10 100]

AB[5,10,8,13]
CD[0,5,13,18]
ABCD[5,10,18,23,10,15,23,28,8,13,21,26,13,18,26,31]
[E] -> [-10,100]
[-5,0,8,13,0,5,13,18,-2,3,11,16,3,8,16,21,105,110,118,123,110,115,123,128,18,113,121,126,113,118,126,131]

*/

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
                ab[(i * b.length) + j] = a[i] + b[j];
            }
        }
        int abe[] = new int[ab.length * e.length];
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < e.length; j++) {
                abe[(i * e.length) + j] = ab[i] + e[j];
            }
        }
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int cd[] = new int[c.length * d.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d.length; j++) {
                cd[(i * d.length) + j] = c[i] + d[j];
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
