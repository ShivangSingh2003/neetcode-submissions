class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                int index = map.get(diff);
                if(i == index)
                    continue;
                int min = Math.min(i, index);
                int max = Math.max(i, index);
                return new int[]{min, max};
            }
        }
        return new int[]{0,0};
    }
}
