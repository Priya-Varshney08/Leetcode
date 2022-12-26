import java.util.*;
public class ReverseWordsInStringIII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public String reverseWords(String s) {
        String ans = "";
        int st = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==' '){
                end = i-1;
                for(int j=end; j>=st; j--){
                    ans += s.charAt(j);
                    // end++;
                }
                ans += ' ';
                st = i+1;
                end = i+1;
            }
        }
        for(int i=s.length()-1; i>=st; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}
