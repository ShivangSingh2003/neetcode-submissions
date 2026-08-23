class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new ArrayList[len+1];

        for(int i = 0; i < len; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int f = entry.getValue();
            if(freq[f] == null)
                freq[f] = new ArrayList<>();
            List<Integer> lst = freq[f];
            lst.add(entry.getKey());
        }

        int[] ans = new int[k];
        int c = 0;
        for(int i = freq.length-1; i >= 0; i--){
            if(freq[i] == null)
                continue;
            List<Integer> lst = freq[i];
            System.out.print(lst);
            for(int j = 0; j<lst.size(); j++){
                if(c == k)
                    return ans;
                ans[c++] = lst.get(j);
            } 
        }

        return ans;
    }
}
