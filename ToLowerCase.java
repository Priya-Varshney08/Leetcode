import java.util.*;
public class ToLowerCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(toLowerCase(s));
    }
    public String toLowerCase(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ans += (char)(ch+32);
            }
            else{
                ans += ch;
            }
        }
        return ans;
    }
}
