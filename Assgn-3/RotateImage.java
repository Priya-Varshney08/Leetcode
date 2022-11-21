import java.util.*;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        rotateImage(a);
    }

    public static void rotateImage(int[][] a){
        int n = a.length;
        int[][] rev = new int[n][n];
        int r = 0;
        
        for(int i=0; i<n; i++){
            int c=n-1;
            for(int j=0; j<n; j++){
                rev[i][j] = a[r][c--];
            }
            r++;
        }
        PrintTranspose(rev);
    }

    public static void PrintTranspose(int[][] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}