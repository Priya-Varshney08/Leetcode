import java.util.*;

public class CheckIfSentenceIsPangram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
    }
    public static boolean check(String s){
        int[] fre = new int[26];
        for(int i=0; i<s.length(); i++){
            fre[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(fre[i]==0){
                return false;
            }
        }
        return true;
    }
}