class Solution {
    public int maxProfit(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]-min >max){
                max = a[i]-min;
            }
            
        }
        return max;
    }
}
