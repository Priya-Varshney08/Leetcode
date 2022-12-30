import java.util.*;

public class FlippingAnImage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] image = {{1, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 0}};
        int[][] ans = flipAndInvertImage(image);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<image[0].length; j++){
                System.out.println(ans[i]+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int end = c-1;
        // Horizontal flip
        for(int i=0; i<r; i++){
            end = c-1;
            for(int j=0; j<c/2; j++){
                int t = a[i][j];
                a[i][j] = a[i][end];
                a[i][end--] = t;
            }
        }
        // Inverting matrix
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(a[i][j]==0)
                a[i][j] = 1;
                else
                a[i][j] = 0;
            }
        }
        return a;
    }
}