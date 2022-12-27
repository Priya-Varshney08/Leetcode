import java.util.*;

public class MaximumBagsWithFullCapacityOfRocks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] capacity={2, 3, 4, 5}; 
        int[] rocks={1, 2, 4, 4};
        int additionalRocks=2;
        System.out.println(maximumBags(capacity, rocks, additionalRocks));
    }
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] difference = new int[rocks.length];
        for(int i=0; i<rocks.length; i++){
            // if(rocks[i]!=capacity[i] && capacity[i]-rocks[i]<=additionalRocks){
            //     additionalRocks -= capacity[i]-rocks[i];
            //     rocks[i]=capacity[i];
            // }
            difference[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(difference);
        int ans = 0;
        int cnt=0;
        for(int i=0; i<rocks.length; i++){
            cnt+=difference[i];
            if(cnt>additionalRocks){
                break;
            }
            ans++;
        }
        return ans;
    }
}
