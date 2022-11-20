import java.util.*;

public class avgOfEvenNumsDivBy3 {
    public static void main(String[] args) {
        // int[] a = {1,3,6,10,12,15};
        int[] a = {1,2,4,7,10};
        System.out.println(avgOfEvenNumsDivBy3(a));
    }
    public static int avgOfEvenNumsDivBy3(int[] a){
        int s=0, cnt=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0 && a[i]%3==0){
                s+=a[i];
                cnt++;
            }
        }
        return s/cnt;
    }
}