import java.util.*;

// 4 4
// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44

// 11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END

public class SpiralPrintClockwise {
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
        SpiralPrintClockwise(a);
    }

    public static void SpiralPrintClockwise(int[][] a){
        int r = a.length-1;
        int c = a[0].length-1;
        int row_counter=0;
        int column_counter=0;

        while(row_counter<=r && column_counter<=c){
            for(int i=column_counter; i<=c; i++){
                System.out.print(a[row_counter][i] + ", ");
            }
            row_counter++;
            for(int i=row_counter; i<=r; i++){
                System.out.print(a[i][c] + ", ");
            }
            c--;
            if(row_counter<=r){
                for(int i=c; i>=column_counter; i--){
                    System.out.print(a[r][i] + ", ");
                }
            }
            r--;
            if(column_counter<=c){
                for(int i=r; i>=row_counter; i--){
                    System.out.print(a[i][column_counter] + ", ");
                }
                column_counter++;
            }
        }
        System.out.println("END");
    }
}



            