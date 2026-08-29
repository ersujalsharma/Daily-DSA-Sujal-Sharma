
/*

2131. Longest Palindrome by Concatenating Two Letter Words

You are given an array of strings words. Each element of words consists of two lowercase English letters.

Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. Each element can be selected at most once.

Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.

A palindrome is a string that reads the same forward and backward.

*/

import java.util.HashMap;

public class Hashing_24_Longest_Palindrome_by_Concatenating_Two_Letter_Words {
    public static void main(String[] args) {
        String words[] = {"lc","cl","gg"};
        int count = longestPalindrome(words);
        System.out.println(count);
    }
    public static int longestPalindrome(String[] words) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        int count = 0;
        for(String word : words){
            String str = word.charAt(1)+""+word.charAt(0);
            // System.out.println(str);
            if(hashmap.containsKey(str)){
                count+=4;
                hashmap.put(str,hashmap.get(str)-1);
                if(hashmap.get(str)==0){
                    hashmap.remove(str);
                }
            }
            else{
                hashmap.put(word,hashmap.getOrDefault(word,0)+1);
            }
        }
        boolean val = false;
        for(String str : hashmap.keySet()){
            if(str.charAt(0)==str.charAt(1)) val = true;
        }
        if(val == true){
            count+=2;
        }
        return count;
    }
}
