import java.util.*;

// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44

// 0,0 1,0 2,0 3,0 
// 3,1 2,1 1,1 0,1
// 0,2 1,2 2,2 3,2
// 3,3 2,3 1,3 0,3

public class WavePrintColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        wavePrintColumnWise(a);
    }

    public static void wavePrintColumnWise(int[][] a){
        int r = a.length;
        int c = a[0].length;
        for(int col=0; col<c; col++){
            if(col%2==0){
                for(int row=0; row<r; row++){
                    System.out.print(a[row][col] + ", ");
                }
            }
            else{
                for(int row=r-1; row>=0; row--){
                    System.out.print(a[row][col] + ", ");
                }
            }
        }
        System.out.println("END");
    }

}