import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s1 = sc.nextLine();
        // String s2 = sc.nextLine();
        String s1 = "b";
        String s2 = "bb";
        System.out.println(closeStrings(s1, s2));
    }

    public static boolean closeStrings(String s1, String s2){
        int fre1[] = new int[26];
        int frChar1[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            fre1[s1.charAt(i)-'a']++;
            frChar1[s1.charAt(i)-'a']=1;
        }
        int fre2[] = new int[26];
        int frChar2[] = new int[26];
        for(int i=0; i<s2.length(); i++){
            fre2[s2.charAt(i)-'a']++;
            frChar2[s2.charAt(i)-'a']=1;
        }
        for(int i=0; i<26-1; i++){
            for(int j=0; j<26-i-1; j++){
                if(fre1[j]>fre1[j+1]){
                    int t = fre1[j];
                    fre1[j] = fre1[j+1];
                    fre1[j+1] = t;
                }
                if(fre2[j]>fre2[j+1]){
                    int t = fre2[j];
                    fre2[j] = fre2[j+1];
                    fre2[j+1] = t;
                }
            }
        }

        for(int i=0; i<26; i++){
            if((fre1[i]!=fre2[i]) || (frChar1[i]!=frChar2[i])){
                return false;
            }
        }
        return true;
    }
}