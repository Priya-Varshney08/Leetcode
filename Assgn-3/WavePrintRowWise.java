import java.util.*;

// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44


// 0,0 0,1 0,2 0,3 
// 1,3 1,2 1,1 1,0 
// 2,0 2,1 2,2 2,3 
// 3,3 3,2 3,1 3,0


public class WavePrintRowWise {
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

        wavePrintRowWise(a);
    }

    public static void wavePrintRowWise(int[][] a){
        int r = a.length;
        int c = a[0].length;
        int row =0;
        for(int i=0; i<r; i++){
            if(row%2==0){
                for(int j=0; j<c; j++){
                    System.out.print(a[i][j] + ", ");
                }
            }
            else{
                for(int j=c-1; j>=0; j--){
                    System.out.print(a[i][j] + ", ");
                }
            }
            row++;
        }
        System.out.println("END");
    }
}