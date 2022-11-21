import java.util.*;
// leetcode 179. Largest Number

public class formBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int k=0; k<n; k++){
                a[k] = sc.nextInt();            
            }
            formBiggestNumber(a);
        }
    }


    public static void formBiggestNumber(int[] a){
        int n = a.length;
        String[] arr = new String[n];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                String x = String.valueOf(a[i]);
                String y = String.valueOf(a[j]);
                // System.out.println(x+y);
                // System.out.println(y+x);
                if((y+x).compareTo(x+y)>0){
                    swap(a, i, j);
                }
            }
        }
        String nw = "";
        for(int i=0; i<n; i++){
            nw += a[i];
        }
        System.out.println(nw);
    }

    public static void swap(int[]a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}