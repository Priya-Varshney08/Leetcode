import java.util.*;
// not done

// leetcode Q.20
public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ValidParenthesis(s));
    }

// Valid
// (){}[]
// ({[]()})

// Invalid
// ([{])
// {[(]]}
// {[[())]]}

    public static boolean ValidParenthesis(String s){
        int n = s.length();
        int i=0;
        int j = 1;
        while(i<j){
            char l = s.charAt(i);
            if()
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindromic(String s){
        int n = s.length();
        int i=0;
        int j=n-1;
    }

    // public static boolean ValidParenthesis(String s){
    //     // not valid for (){}[]
    //     int n = s.length();
    //     int i=0;
    //     int j = n-1;
    //     while(i<=j){
    //         char left = s.charAt(i);
    //         char right = s.charAt(j);
    //         if((left=='(' && right!=')') || (left=='[' && right!=']') || (left=='{' && right!='}')){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
}