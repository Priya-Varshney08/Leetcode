import java.util.*;
// not done
// Q. 38 Leetcode 
public class countAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n){
        int i=1;
        String res = "1";
        while(i<n){
            int cnt=1;
            for(int j=0; j<res.length()-1; j++){
                if(res.charAt(j)==res.charAt(j+1)){
                    cnt++;
                }
                else{
                    res += cnt;
                    res += res.charAt(j);
                }
            }
            res += cnt;
            res += res.charAt(res.length()-1);
            
            i++;
        }
        return res;
    }
}