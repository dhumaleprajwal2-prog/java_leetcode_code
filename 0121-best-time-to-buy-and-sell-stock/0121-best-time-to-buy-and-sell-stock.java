class Solution {
    public int maxProfit(int[] prices) {
        int s=prices[0];
        int pro=0;
        for(int i=1;i<prices.length;i++){
            if(s>prices[i]){
                s=prices[i];
            }else if(prices[i]-s>pro){
                pro=prices[i]-s;
            }
        }
        return pro;
    }
}