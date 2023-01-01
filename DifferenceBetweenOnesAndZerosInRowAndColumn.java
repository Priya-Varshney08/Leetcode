import java.util.*;

public class DifferenceBetweenOnesAndZerosInRowAndColumn{
    public static void main(String[] args){
        int[][] a = {{0, 1, 1}, {1, 0, 1}, {0, 0, 1}};
        int[][] ans = onesMinusZeros(a);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] onesMinusZeros(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int[] ones_row = new int[r];
        int[] ones_c = new int[c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ones_row[i] += a[i][j];
            }
        }
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ones_c[i] += a[j][i];
            }
        }
        // System.out.println(ones_row[0] + " " + ones_row[1] + " " + ones_row[2]);
        // System.out.println(ones_c[0] + " " + ones_c[1] + " " + ones_c[2]);

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = 2 * ones_row[i]-r + 2 * ones_c[j]-c;
            }
        }
        return a;
    }
}