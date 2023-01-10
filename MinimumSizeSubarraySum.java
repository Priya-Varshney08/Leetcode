import java.util.*;

public class MinimumSizeSubarraySum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(MinimumSizeSubarraySum(target, a));
    }

    public static int MinimumSizeSubarraySum(int target, int[] a){
        int ans = Integer.MAX_VALUE;
        int si=0;
        int ei = 0;
        int sum=a[0];
        while(ei<a.length){
            // System.out.println("sum :  " + sum);
            if(sum<target){
                ei++;
                if(ei==a.length)
                break;
                sum+=a[ei];
            }
            else{
            ans = Math.min(ans, ei-si+1);
            sum-=a[si];
            si++;
            // System.out.println("ans :  " + ans);
            }
        }
        // ans = Math.min(ans, ei-si+1);
        
        return ans== Integer.MAX_VALUE? 0 : ans;
    }
}