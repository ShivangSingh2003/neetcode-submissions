class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mapper = new HashMap<>();
        int len = nums.length;

        for(int i = 0; i < len; i++){

            mapper.put(nums[i], mapper.getOrDefault(nums[i], 0) + 1);
        }

        Integer[] freq = mapper.values().toArray(new Integer[0]);
        
        Arrays.sort(freq, Collections.reverseOrder());
        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            for(Map.Entry<Integer, Integer> entry : mapper.entrySet()){
                if(entry.getValue().equals(freq[i])){
                    int n = entry.getKey();
                    ans[i] = n;
                    break;
                }
            }
            mapper.remove(ans[i]);
        }

        return ans;
    }
}
