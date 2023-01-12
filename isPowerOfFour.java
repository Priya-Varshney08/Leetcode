import java.util.*;

public class isPowerOfFour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if(n==1)
        return true;
        if(n%4!=0 || n<=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}