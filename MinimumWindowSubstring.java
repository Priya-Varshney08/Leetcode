import java.util.*;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "ADOBECODEBANC";
        // String t = sc.nextLine();
        String t = "ABC";
        String ans = MinimumWindowSubstring(s, t);
        System.out.println(ans);
    }

    public static String MinimumWindowSubstring(String s, String t){
        String a = "";
        int[] fre = new int[123];
        for(int i=0; i<t.length(); i++){
            fre[t.charAt(i)]++;
        }
        int[] fre2 = new int[123];
        int si=0;
        int ei=0;
        int start = -1;
        int len = Integer.MAX_VALUE;
        int cnt =0;
        while(ei<s.length()){
            // Grow
            char ch = s.charAt(ei);
            fre2[ch]++;
            if(fre[ch] >= fre2[ch])
                cnt++;
            // Shrink
            if(cnt==t.length()){
                // char c = s.charAt(si);
                while(fre2[s.charAt(si)]>fre[s.charAt(si)] && si<=ei) {
                    fre2[s.charAt(si)]--;
                    si++;
                }
            
                // ans
                if(len>ei-si+1){
                    len = ei-si+1;
                    start = si;
                }
            }
            ei++;
            }
        if(start==-1)
        return "";
        else
        return s.substring(start, start+len);
    }
}