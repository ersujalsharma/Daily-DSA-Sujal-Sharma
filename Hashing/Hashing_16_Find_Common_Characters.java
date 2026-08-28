package Hashing;
/*

Question - 12 -> 3
Find Common Characters

*/

import java.util.*;

public class Hashing_16_Find_Common_Characters {
    public static void main(String[] args) {
        String words[] = {"bella","label","roller"};
        List<String> common = commonChars(words);
        System.out.println(common);
    }
    public static List<String> commonChars(String[] words) {
        int minFreq[] = new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);
        for(String word : words){
            int freq[] = new int[26];
            for(char c : word.toCharArray()){
                freq[c-'a']++;
            }
            for(int i=0;i<minFreq.length;i++){
                minFreq[i] = Math.min(minFreq[i],freq[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<26;i++){
            if(minFreq[i]!=Integer.MAX_VALUE){
                for(int f=0;f<minFreq[i];f++){
                    list.add(((char)('a'+i))+"");
                }
            }
        }
        return list;
    }
}
