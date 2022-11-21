import java.util.*;

// 1 1 0 1 1
// 1 1 1 1 1
// 1 1 1 0 1
// 1 1 1 1 1
// 0 1 1 1 1

// 0 0 0 0 0
// 0 1 0 0 1
// 0 0 0 0 0
// 0 1 0 0 1
// 0 0 0 0 0


public class ChangeElementsin2DMatrix {
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
        ChangeElementsin2DMatrix(a);
    }

    public static void ChangeElementsin2DMatrix(int[][] a){
        // we will check from the first row first column
        // if any 0 is present respective index in first row and first column will be made zero
        int r = a.length;
        int c = a[0].length;

        int x=1;    // checks for if any zero is present iin the first row
        int y=1;    // checks for if any zero is present iin the first column

        for(int i=0; i<r; i++){
            if(a[i][0]==0){
                y=0;    // means that 0 is present in first column
            }
        }        
        for(int i=0; i<c; i++){
            if(a[0][i]==0){
                x=0;    // means that 0 is present in first row
            }
        }        

        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }

        for(int i=1; i<c; i++){     // this loop set all columns to 0 which contain 0 in column
            if(a[0][i]==0){
                for(int j=1; j<r; j++){
                    a[j][i]=0;
                }
            }
        }
        for(int i=1; i<r; i++){     // this loop set all rows to 0 which contain 0 in row
            if(a[i][0]==0){
                for(int j=1; j<c; j++){
                    a[i][j]=0;
                }
            }
        }

        if(x==0){           // if in the original array there is any zero in first row
            for(int i=0; i<c; i++){
                a[0][i]=0;
            }
        }
        if(y==0){           // if in the original array there is any zero in first column
            for(int i=0; i<r; i++){
                a[i][0]=0;
            }
        }



        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}