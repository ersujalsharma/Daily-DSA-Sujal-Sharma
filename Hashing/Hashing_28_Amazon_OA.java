/*

The engineer wants to find the maximum number of times,
a target word can be obtained by rearranging a subset characters in a log entry.

s[] = "mononom",

target word -> t = "mon"


*/
public class Hashing_28_Amazon_OA {
    public static void main(String[] args) {
        // String s = "abdadccacd";
        // String t = "edac";
        // String s = "abacbc";
        // String t = "bca";
        String s = "mononom";
        String t = "mon";
        int ans = checkCountLogEntry(s,t);
        System.out.println("Answer is -> "+ans);
    }

    private static int checkCountLogEntry(String s, String t) {
        // TODO Auto-generated method stub
        int freqT[] = new int[26];
        for(char c : t.toCharArray()){
            freqT[c-'a']++;
        } 
        int freqS[] = new int[26];
        for(char c : s.toCharArray()){
            freqS[c-'a']++;
        }
        int count = Integer.MAX_VALUE;
        for(int i = 0 ; i < t.length() ; i++) {
            count = Math.min(count,freqS[t.charAt(i)-'a']/freqT[t.charAt(i)-'a']);
        }
        return count;
    }
}
