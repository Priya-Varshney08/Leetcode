import java.util.*;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = noOfSubstr(s);
        System.out.println(x);
    }
    public static int noOfSubstr(String s){
        if(s.length()<3){
            return 0;
        }
        int k=3;    // Window size
        int si=0;
        int ei=0;
        int cnt=0;
        while(ei<s.length()){
            char[] fre = new char[3];
            fre[0] = s.charAt(si);
            fre[1] = s.charAt(si+1);
            fre[2] = s.charAt(si+2);
            while((ei-si+1)<k){
                ei++;   //grow
            }
            while((ei-si+1)>k){
                si++;   // shrink
            }
            if(fre[0]!=fre[1] && fre[1]!=fre[2] && fre[2]!=fre[0])
            cnt++;
            ei++;
            si++;
        }
        return cnt;
    }
}