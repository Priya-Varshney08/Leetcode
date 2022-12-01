import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char[] a = sc.nextLine();
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        ReverseString(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }

    public static void ReverseString(char[] a){
        int i=0;
        int j=a.length-1;
        while(i<j){
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t; 
        }
    }
}