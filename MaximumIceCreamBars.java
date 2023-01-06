import java.util.*;

public class MaximumIceCreamBars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt = 0;
        for(int i=0; i<costs.length; i++){
            if(coins>=costs[i]){
                cnt++;
                coins -= costs[i];
            }
        }
        return cnt;
    }
}