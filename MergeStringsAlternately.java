import java.util.*;

public class MergeStringsAlternately{
    public static void main(String[] args){
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        String ans = "";
        int min;
        String bachi_hui;
        if(word1.length()<word2.length()){
            min = word1.length();
            bachi_hui = word2;
        }
        else{
            min = word2.length();
            bachi_hui = word1;
        }
        // int min = word1.length()<word2.length() ? word1.length() : word2.length();
        for(int i=0; i<min; i++){
            char one = word1.charAt(i);
            char two = word2.charAt(i);
            ans += one;
            ans += two;
        }
        for(int i=min; i<bachi_hui.length(); i++){
            char ch = bachi_hui.charAt(i);
            ans += ch;
        }
        return ans;
    }
}