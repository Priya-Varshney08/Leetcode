import java.util.*;

// 4 4
// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44

// 11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
public class SpiralPrintAnticlockwise {
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
        SpiralPrintAnticlockwise(a);
    
    }

    public static void SpiralPrintAnticlockwise(int[][] a){
        int r = a.length-1;
        int c = a[0].length-1;
        int row_counter=0;
        int column_counter=0;

        while(row_counter<=r && column_counter<=c){
            for(int i=row_counter; i<=r; i++){
                System.out.print(a[i][column_counter] + ", ");
            }
            column_counter++;

            for(int i=column_counter; i<=c; i++){
                System.out.print(a[r][i] + ", ");
            }
            r--;
            if(row_counter<=r){
                for(int i=r; i>=row_counter; i--){
                    System.out.print(a[i][c] + ", ");
                }
                c--;
            }
            if(row_counter<=r){
                for(int i=c; i>=column_counter; i--){
                    System.out.print(a[row_counter][i] + ", ");
                }
            }
            row_counter++;
        }
        System.out.println("END");
    }
}