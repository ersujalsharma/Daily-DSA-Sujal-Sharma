/*

Two strings, a and b, are said to be twins only if they can be made equivalent by performing some number of operations on one or both strings. There are two possible operations:

SwapEven: Swap a character at an even-numbered index with a character at another even-numbered index.
SwapOdd: Swap a character at an odd-numbered index with a character at another odd-numbered index.
For example, a = "abcd" and b = "cdab" are twins because we can make them equivalent by performing operations. Alternatively, a = "abcd" and b = "bcda" are not twins (operations do not move characters between odd and even indices), and neither are a = "abc" and b = "ab" (no amount of operations will insert a 'c' into string b).

Complete the twins function in the provided code. It has two parameters:

a = ["cdab", "dcba"] and b = ["abcd", "abcd"]

*/

import java.util.Arrays;

public class Hashing_40_Arcesium_OA {
    public static void main(String[] args) {
        int n = 2;
        String[] a = {"cdab", "dcba"} , b = {"abcd", "abcd"};
        boolean ans[] = new boolean[n];
        for(int i=0;i<n;i++){
            String first = a[i];
            String second = b[i];
            int freqOdd[] = new int[26];
            int freqEven[] = new int[26];
            for(int itr=0;itr<first.length();itr++){
                if(itr%2==0){
                    freqEven[first.charAt(itr)-'a']++;
                    freqEven[second.charAt(itr)-'a']--;
                }
                else{
                    freqOdd[first.charAt(itr)-'a']++;
                    freqOdd[second.charAt(itr)-'a']--;
                }
            }
            boolean valid = true;
            for(int itr = 0;itr < 26 ; itr++){
                if(freqEven[itr]!=0) valid = false;
                if(freqOdd[itr]!=0) valid = false;
            }
            ans[i] = valid;
        }
        System.out.println(Arrays.toString(ans));
    }
}
