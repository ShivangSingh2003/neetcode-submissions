class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int len = piles.length;
        int maxRate = piles[len-1];
        int minRate = 1;
        int midRate = 0;
        int ans = Integer.MAX_VALUE;
        while(minRate <= maxRate){
            midRate = (minRate+maxRate)/2;
            int hoursNeeded = 0;

            for(int i = 0; i < len; i++){
                hoursNeeded += Math.ceil((double)piles[i]/midRate);
            }
            if(hoursNeeded > h){
                minRate = midRate+1;
            }
            else{
                ans = Math.min(ans, midRate);
                maxRate = midRate-1;
            }
        }
        return ans;
    }
}
