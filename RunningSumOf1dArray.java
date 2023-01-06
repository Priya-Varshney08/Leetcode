import java.util.*;

public class RunningSumOf1dArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 4, 5};
        a = runningSum(a);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}