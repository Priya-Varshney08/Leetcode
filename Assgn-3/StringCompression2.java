import java.util.*;
public class StringCompression2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringCompression(s);
    }

    // public static void StringCompression(String s){
    //     int[] fre = new int[26];
    //     boolean[] alph = new boolean[26];
    //     for(int i=0; i<s.length(); i++){
    //         char ch = s.charAt(i);
    //         fre[ch-97]++;
    //         alph[ch-97] = true;
    //     }
    //     // int m=0;
    //     for(int i=0; i<26; i++){
    //         if(alph[i]==true){
    //             System.out.print((char)(i+97));
    //             alph[i]=false;
    //         }
    //         if(fre[i]>1){
    //             System.out.print(fre[i]);
    //         }
    //     }
    // }

// Input :- 
// aaabbccds
// Output :- 
// a3b2c2ds

    public static void StringCompression(String s){
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char nx = s.charAt(i+1);
            if(ch==nx){
                cnt++;
            }
            if(ch!=nx){
            System.out.print(ch);
            if(cnt>1)
            System.out.print(cnt);
            cnt=1;
            }
        }
        System.out.print(s.charAt(s.length()-1));
        if(cnt>1)
        System.out.print(cnt);
    }
}