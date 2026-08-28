package Hashing;
/*

Question - 12 -> 2
First Unique Character in a String

*/

import java.util.HashMap;

public class Hashing_15_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "leetcode";
        int firstUniqueCharacter = firstUniqChar(s);
        System.out.println(firstUniqueCharacter);
    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char c : s.toCharArray()){
            hashmap.put(c,hashmap.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hashmap.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
