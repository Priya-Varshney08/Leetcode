import java.util.*;

public class  rectangleArea{
    public static void main(String[] args) {
        int c = computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        // int c = computeArea(-2, -2, 2, 2, -2, -2, 2, 2);
        System.out.println(c);
    }
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int t_ar = ((ax2-ax1)*(ay2-ay1))+((bx2-bx1)*(by2-by1));
        // if(ax2<=bx1 && by2<=ay1 && bx2<=ax1 && by1<=ay2)
        // return t_ar;
        int extra = 0;
        int s_X = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        System.out.println(s_X);
        int s_Y = Math.min(ay2, by2) - Math.max(ay1, by1);
        System.out.println(s_Y);
        if(s_X>0 && s_Y>0){
            extra = s_X * s_Y;
        }
        return t_ar - extra;
    }
}