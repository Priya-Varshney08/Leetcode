import java.util.*;

public class validPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String b = removeExtra(s);
        System.out.println(validPalindrome(b));
    }

    public static String removeExtra(String s){
        String nw = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<91){
                nw = nw + (char)(ch+32);
            }
            else if(ch>=97 && ch<=122){
                nw+=ch;
            }
            else if(ch>=48 && ch<=57){
                nw+=ch;
            }
        }
        // System.out.println(nw);
        return nw;
    }

    public static boolean validPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}