package Hashing;

import java.util.*;

/*

13. CSUMQ - Cumulative Sum Query

William Macfarlane wants to look at an array.

You are given a list of N numbers and Q queries. Each query is specified by two numbers i and j; the answer to each query is the sum of every number between the range [i, j] (inclusive).

Note: the query ranges are specified using 0-based indexing.

*/
public class Hashing_13_CSUMQ_Cumulative_Sum_Query {
    
    public static void main(String[] args) {
        int n = 3;
        int arr[] = {1,4,1};
        int q = 3;
        int query[][] = {{1,1},{1,2},{0,2}};
        int ans[] = cum_sum_query(n,arr,q,query);
        Arrays.toString(ans);
    }

    private static int[] cum_sum_query(int n, int[] arr, int q, int[][] query) {
        // TODO Auto-generated method stub
        
    }

}
