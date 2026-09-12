class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapper = new HashMap<>();
        int[] arr = new int[2];

        for(int i = 0; i<nums.length; i++){
            int diff = target-nums[i];
            if(mapper.containsKey(diff)){
                arr[0] = mapper.get(diff);
                arr[1] = i;
                return arr;
            }
            else{
                mapper.put(nums[i], i);
            }
        }
        return arr;
    }
}
