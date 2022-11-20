import java.util.*;

public class ApplyOperationstoanArray {
    public static void main(String[] args) {
        // int[] a = {1,2,2,1,1,0};
        // int[] a = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        int[] a = {0, 1};
        int [] b = ApplyOperationstoanArray(a);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
    public static int[] ApplyOperationstoanArray(int[] a){
        for(int i=0; i<a.length-1; i++){
            if(a[i]==a[i+1]){
                a[i] *= 2;
                a[i+1]=0;
            }
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int cnt=0;
        int[] b = new int[a.length];
        int m=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0){
                cnt++;
            }
            else{
                b[m++]=a[i];
            }
        }

        for(int i=0; i<cnt; i++){
            b[m++]=0;
        }

        return b;
    }
}