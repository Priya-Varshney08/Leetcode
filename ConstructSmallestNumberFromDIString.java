import java.util.*;
/*
Algorithm : 
    1.  initialize count to 1 and array of size str.length() + 1
    2.  whenever u first encounter 'I', fill it with count, count++
    3.  traverse backwards if there are 'D' until 'I' and fill them with count, count++
    4.  Repeat step 2 and 3
    5.  Fill last index with count
*/

/*
IDDII
1  
1  2    // traverse backwards as D is present
  <-
1432    // now proceed further till u find D and fill the I's with count
143256
*/

/*
DDIIDD
  12
4312
431265
*/

/*
DDIIDI
  1
321
3214
3214 5
3214657
*/

// DIDIDDID
// 214376598

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s = "DDIIDI";
        String x = ConstructSmallestNumberFromDIString(s);
        System.out.println(x);
    }

    public static String ConstructSmallestNumberFromDIString(String s){
        int[] ans = new int[s.length()+1];
        int count = 1;
        for(int i=0; i<=s.length(); i++){
            if(i==s.length() || s.charAt(i)=='I'){
                ans[i] = count;
                count++;
                for(int j=i-1; j>=0 && s.charAt(j)!='I'; j--){
                    ans[j] = count;
                    count++;
                }
            }
        }
        String nw = "";
        // for(int i=0; i<ans.length; i++){
        for(int i :ans){
            nw += i;
        }
        return nw;
    }
}