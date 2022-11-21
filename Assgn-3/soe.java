import java.util.*;

public class soe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int q = sc.nextInt();
        // int[] a = {1, 3};
        int[] a = {1, 5};
        int[] b = {2, 5};
        // int[] b = {4, 1};
        int[] q = {3, 1, 7, 6, 7};
        // int[] q = {1, 2};
        equalStrings(a, b, q);
    }

// 1 5
// 2 5
// 3 1 7 6 7

// Its Correct output is : 
// 11 7 19 17 19

    public static int equalStrings(int[]a, int[]b, int[]q){
        
        int n = a.length;
        int q_c=0;
        for(int i=1; i<=q.length-1; i++){
            int a_c = 0, b_c = 0;
            int max = 0;
            for(int j=0; j<n; j++){
                int cost=0;
                cost = q[q_c++]*a[a_c++]+b[b_c++];
                max = Math.max(max, cost);
                System.out.print(max + " ");
            }
        }
        return 0;
    }

}