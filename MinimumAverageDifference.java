import java.util.*;

public class MinimumAverageDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 5 ,3 ,9, 5, 3};
        // int[] a = {0};
        System.out.println(MinimumAverageDifference(a));
    }

    public static int MinimumAverageDifference(int[] a){
        long min = Integer.MAX_VALUE;
        int n = a.length;
        int idx = 0;
        int cnt = 0;
        long left_sum=0;
        long right_sum=0;
        for(int i=0; i<n; i++){
            right_sum += a[i];
        }
        System.out.println(right_sum);
        for(int i=0; i<a.length; i++){
            left_sum += a[i];
            right_sum -= a[i];
            long l = left_sum /(i+1);
            long r = (i==n-1) ? 0 : right_sum /(n-i-1);
            // System.out.println(left_sum + " " + right_sum);
            // System.out.println(l + " " + r);
            if(Math.abs(l-r)<min){
                min = Math.min(min, Math.abs(l-r));
                idx = i;
            }
        }
        return idx;
    }
}