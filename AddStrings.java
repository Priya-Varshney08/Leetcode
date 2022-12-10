import java.util.*;

public class AddStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(AddStrings(s1, s2));
    }

    public static String AddStrings(String s1, String s2){
        String ans="";
        int carry=0;
        int l1=s1.length();
        int l2=s2.length();
        while(l1>0 || l2>0){
            int d1 = (l1>0) ? (s1.charAt(l1-1)-'0') : 0;
            int d2 = (l2>0) ? (s2.charAt(l2-1)-'0') : 0;

            int sum = (d1+d2+carry)%10;
            carry = (d1+d2+carry)/10;
            ans += "" +sum;
            l1--;
            l2--;
        }
        if(carry>0){
            ans += carry;
        }
        String fans = "";
        for(int i=0; i<ans.length(); i++){
            fans = ans.charAt(i) + fans;
        }
        return fans;
    }
}