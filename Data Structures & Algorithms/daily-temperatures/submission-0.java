class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        boolean flag = false;
        for(int i = 0; i < len; i++){
            if(i == len-1){
                ans[i] = 0;
                break;
            }
            flag = false;
            for(int j = i+1; j < len; j++){
                if(temperatures[j] > temperatures[i]){
                    ans[i] = j-i;
                    flag = true;
                    break;
                }
            }
            if(!flag)
                ans[i] = 0;
        }

        return ans;
    }
}
