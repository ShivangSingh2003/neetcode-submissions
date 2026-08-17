class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] arr = new List[nums.length+1];

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int idx = entry.getValue();
            if(arr[idx] == null)
                arr[idx] = new ArrayList<>();
            List<Integer> lst = arr[idx];
            lst.add(entry.getKey());
        }

        int[] ans = new int[k];
        int c = 0;
        for(int i = arr.length-1; i > 0; i--){
            if(arr[i] == null)
                continue;
            List<Integer> l = arr[i];
            for(int num : l){
                if(c == k)
                    return ans;
                ans[c++] = num;
            }
        }
        return ans;
    }
}
