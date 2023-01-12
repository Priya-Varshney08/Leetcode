import java.util.*;

public class GenerateParenthesis{
    public static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GenerateParenthesis(n, "", 0, 0);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void GenerateParenthesis(int n, String ans, int open, int close){
        if(open==n && close==n){
            // System.out.println(ans);
            list.add(ans);
            return;
        }
        // int total = n*2;
        if(open<n){
            GenerateParenthesis(n, ans + "(", open+1, close);
        }
        if(close<open){
            GenerateParenthesis(n, ans + ")", open, close+1);
        }
    }
}