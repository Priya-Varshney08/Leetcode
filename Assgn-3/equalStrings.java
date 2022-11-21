import java.util.*;
// to check if any of the given 3 strings are Anagram or not
public class equalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        System.out.println(equalStrings(s1, s2, s3));
    }
    public static boolean equalStrings(String s1, String s2, String s3){
        int n = s1.length();
        int[] fre1 = new int[26];
        for(int i=0; i<n; i++){
            fre1[s1.charAt(i)-97]++;
        }
        int[] fre2 = new int[26];
        for(int i=0; i<n; i++){
            fre2[s2.charAt(i)-97]++;
        }
        int[] fre3 = new int[26];
        for(int i=0; i<n; i++){
            fre3[s3.charAt(i)-97]++;
        }


        for(int i=0; i<26; i++){
            System.out.print(fre1[i] + " ");
        }
        System.out.println();
        for(int i=0; i<26; i++){
            System.out.print(fre2[i] + " ");
        }
        System.out.println();
        for(int i=0; i<26; i++){
            System.out.print(fre3[i] + " ");
        }
        System.out.println();



        int x=0, y=0, z=0;
        for(int i=0; i<26; i++){
            if(fre1[i]==fre2[i]){
                x++;
                // System.out.print(x + " ");
            }
        }
        for(int i=0; i<26; i++){
            if(fre3[i]==fre2[i]){
                y++;
                // System.out.print(y + " ");
            }
        }
        for(int i=0; i<26; i++){
            if(fre3[i]==fre1[i]){
                z++;
                // System.out.print(z + " ");
            }
        }
        System.out.println(x+ " " + y+" "+z);
        if(x==26 || y==26 || z==26)
        return true;
        else
        return false;
    }
}