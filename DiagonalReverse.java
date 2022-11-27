import java.util.*;

public class DiagonalReverse {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] b = DiagonalReverse(a);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
    }

    1  2  3  4
    5  6  7  8
    9  10 11 12
    13 14 15 16

    // 1 2 3
    // 4 5 6
    // 7 8 9

    // 0,0         ->d=0
    // 0,1 1,0     ->d=1
    // 0,2 1,1 2,0 ->d=2
    // 1,2 2,1     ->d=3
    // 2,2         ->d=4


    public static int[] DiagonalReverse(int[][] a){
        int r = a.length;
        int c = a[0].length;
        int[] ans = new int[r*c];
        // jitne diagonal honge utni baar loop chalega
        // total diagonals = row  + (column - 1)
        int i=0;
        for(int d=0; d<r+c-1; d++){
            int ro=0;
            int col=0;
            if(d<c){
                ro=0;
                col=d;
            }
            else{
                ro=d-c+1;
                col=c-1;
            }
            ArrayList<Integer> ls = new ArrayList<>();
            while(ro<r && col>=0){
                ls.add(a[ro++][col--]);
            }
            if(d%2==0){
                Collections.reverse(ls);
            }
            for(int j:ls){
                ans[i]=j;
                i++;
            }
        }
        return ans;
    }
}