import java.util.*;

public class FindPivotIndex{
    public static void main(String[] args){
        // int[] a = {-1, -1, -1, -1, 0, 1};
        // int[] a = {3, 8, -4, -2, -1, -1, 0};
        int[] a = {8, -4, -2, -1, -1, 7};
        System.out.println(pivotIndex(a));
    }
    public static int pivotIndex(int[] nums) {
        int idx=-1;
        int s_left=0;
        int s_right=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            s_right += nums[i];
        }
        for(int i=0; i<n; i++){
            if(i!=0)
            s_left+=nums[i-1];
            s_right-=nums[i];
            System.out.println(s_left + " " + s_right);
            if(s_left==s_right){
                idx=i;
                break;
            }
        }
        return idx;
    }
}
