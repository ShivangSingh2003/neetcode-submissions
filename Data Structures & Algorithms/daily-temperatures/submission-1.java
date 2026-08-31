class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Stack<Integer> temps = new Stack<>();

        for(int i = 0; i < len; i++){
            if(temps.empty()){
                temps.push(i);
                continue;
            }
            int temp = temperatures[i];
            
            while(!temps.empty() && temp > temperatures[temps.peek()]){
                ans[temps.peek()] = i-temps.peek();
                temps.pop();
            }
            temps.push(i);
        }

        return ans;
    }
}
