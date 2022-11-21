import java.util.*;

public class RemoveDuplicates
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        RemoveDuplicates(s);
    }

    public static void RemoveDuplicates(String s){
        String nw = "";
        for(int i=0; i<s.length()-1; i++){
            char curr = s.charAt(i);
            char nxt = s.charAt(i+1);
            if(curr!=nxt){
                nw = nw + curr;
            }
        }
        nw += s.charAt(s.length()-1);
        System.out.println(nw);
    }
}