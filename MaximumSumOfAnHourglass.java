import java.util.*;

public class MaximumSumOfAnHourglass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = {{6, 2, 1, 3}, {4, 2, 1, 5}, {9, 2, 8, 7}, {4, 1, 2, 9}};
        System.out.println(maxSum(a));
    }

    public static int maxSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int ans=0;
        for(int i=0; i<r-2; i++){
            for(int j=0; j<c-2; j++){
                int sum = 0;
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        sum += grid[k][l];
                    }
                }
                ans = Math.max(ans, sum-grid[i+1][j] - grid[i+1][j+2]);
            }
        }
        return ans;
    }
}