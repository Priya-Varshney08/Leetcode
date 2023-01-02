import java.util.*;

public class DetectCapital{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(DetectCapital(s));
    }
    public static boolean DetectCapital(String s){
        int cap_cnt=0;
        int first_cap=0;
        if(s.charAt(0)>='A' && s.charAt(0)<='Z')
        first_cap=1;
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                cap_cnt++;
            }
        }
        if((cap_cnt==s.length()-1 && first_cap==1) || (first_cap==1 && cap_cnt==0) || cap_cnt==0){
            return true;
        }
        return false;
    }
}