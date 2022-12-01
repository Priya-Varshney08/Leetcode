import java.util.*;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "tkPAdxpMfJiltOerItiv";
        System.out.println(DetermineIfStringHalvesAreAlike(s));
    }

    public static boolean DetermineIfStringHalvesAreAlike(String s){
        int cnt1=0;
        int cnt2=0;
        for(int i=0; i<s.length()/2; i++){
            if(isVowel(s.charAt(i))){
                cnt1++;
            }
        }
        for(int i=s.length()/2; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                cnt2++;
            }
        }
        if(cnt1==cnt2)
        return true;
        return false;
    }

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        return true;
        else
        return false;
    }
}