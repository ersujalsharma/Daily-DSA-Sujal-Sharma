package Hashing;

/*

10. Valid Anagrams
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/

public class Hashing_10_Valid_Anagrams {
    public static void main(String[] args) {
        String s = "anagram",t = "nagaram";
        boolean val = checkAnagram(s,t);
        System.out.println("Both are Anagrams : "+val);
    }

    private static boolean checkAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int freq[] = new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : t.toCharArray()){
            freq[c-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
    
}
