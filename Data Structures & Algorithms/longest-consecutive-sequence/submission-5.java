class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            int curLen = 1;
            int curNum = nums[i];
            if(set.contains(curNum-1)) continue;
            while(set.contains(curNum+1)){
                curLen++;
                curNum++;
            }

            if(curLen > maxLen)
                maxLen = curLen;
        }

        return maxLen;
    }
}
