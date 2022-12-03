import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String[] ans = FizzBuzz(n);
        ArrayList<String> ans = FizzBuzz(n);
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
        
    }
    public static ArrayList<String> FizzBuzz(int n){
        // String[] ans = new String[n];
        ArrayList<String> ans = new ArrayList<>(n);
        for(int i=1; i<=n; i++){
            if(i%5==0 && i%3==0){
                ans.add("FizzBuzz");
            }
            else if(i%3==0){
                ans.add("Fizz");
                // ans[i-1] = "Fizz";
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}