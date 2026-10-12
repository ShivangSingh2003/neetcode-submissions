class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        int f = 0;
        int k = 0;
        for(char ch : tasks){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            if(freq == f){
                k++;
            }
            else if(freq > f){
                f = freq;
                k = 1;
            }
        }
        int formula = (f-1)*(n+1) + k;
        return Math.max(formula, tasks.length);
    }
}
