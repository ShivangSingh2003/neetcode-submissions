class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mapper = new HashMap<>();
        int len = nums.length;

        for(int i = 0; i < len; i++){

            mapper.put(nums[i], mapper.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> [] buckets = new List[len+1];
        for(Map.Entry<Integer, Integer> entry : mapper.entrySet()){
            int f = entry.getValue();
            if(buckets[f] == null){
                buckets[f] = new ArrayList<Integer>();
            }
            List<Integer> lst = buckets[f];
            lst.add(entry.getKey());
        }
        int[] ans = new int[k];
        int c = 0;
        for(int i = buckets.length-1; i >= 1; i--){
            if(c == k)
                return ans;
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    ans[c++] = num; 
                }
            }
        }
        return ans;
    }
}
