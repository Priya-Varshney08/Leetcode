import java.util.*;

public class canUReadThis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printOnLine(s);
    }
    // ye galat hai
    
    // public static void printOnLine(String s){
    //     for(int i=0; i<s.length()-1; i++){
    //         char ch = s.charAt(i);
    //         char nx = s.charAt(i+1);
    //         if(i==0 || ((ch>=97 && ch<123) && (nx>=65 && nx<91)) || ((ch>=65 && ch<91) && (nx>=65 && nx<91)))
    //         {
    //             System.out.println(ch);
    //         }
    //         else{
    //             System.out.print(ch);
    //         }
    //     }
    // }

    public static void printOnLine(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(isCapital(ch)==true){
                System.out.println();
            }
            System.out.print(ch);
            
        }
    }

    public static boolean isCapital(char ch){
        if(ch>='A' && ch<='Z'){
            return true;
        }
        return false;
    }
    public static boolean issmall(char ch){
        if(ch>='a' && ch<='z'){
            return true;
        }
        return false;
    }
}