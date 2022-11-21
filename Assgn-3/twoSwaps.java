import java.util.*;

public class twoSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 3, 2, 1};
        System.out.println(twSw(4, arr));
    }
    public static boolean twSw(int n, int[] a){
        int cnt = 0;
        for(int i=n-1; i>=0; i++){
            if(a[i]<a[i-1]){
                int k=i-1;
                while(k>=0 && a[i]<a[k])
                    k--;

                int t = a[i];
                a[i] = a[k+1];
                a[k+1] = t;
                cnt++;

                if(cnt==2)
                break;
            }
        }
        if(isSorted(a)==1)
        return true;
        else
        return false;
    } 

    public static int isSorted(int[] a){
        int n = a.length;
        int c = 0;
        for(int i=0; i<n-1; i++){
            if(a[i]<a[i+1])
            c++;
        }
        if(c==n-1)
        return 1;
        else
        return 0;
    }
}