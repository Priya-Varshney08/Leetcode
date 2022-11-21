import java.util.*;
// not correct
// Leetcode Q. 680

public class validPalindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        int cnt=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                cnt++;
                if(cnt>1)
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}