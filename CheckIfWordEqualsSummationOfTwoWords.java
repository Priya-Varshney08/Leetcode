import java.util.*;

public class CheckIfWordEqualsSummationOfTwoWords{
    public static void main(String[] args){
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = 0;
        int pv = 1;
        for(int i=firstWord.length()-1; i>=0; i--){
            char ch = firstWord.charAt(i);
            num1 += (ch-97)*pv;
            pv*=10;
        }
        // System.out.println(num1);

        int num2 = 0;
        pv = 1;
        for(int i=secondWord.length()-1; i>=0; i--){
            char ch = secondWord.charAt(i);
            num2 += (ch-97)*pv;
            pv*=10;
        }
        // System.out.println(num2);

        int num3 = 0;
        pv = 1;
        for(int i=targetWord.length()-1; i>=0; i--){
            char ch = targetWord.charAt(i);
            num3 += (ch-97)*pv;
            pv*=10;
        }
        // System.out.println(num3);

        if(num1+num2==num3){
            return true;
        }
        else{
            return false;
        }
    }
}