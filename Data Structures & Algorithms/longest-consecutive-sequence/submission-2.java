class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            if(set.contains(currentNum - 1)) continue;
            int currLen = 1;
            while(set.contains(currentNum+1)){
                currLen++;
                currentNum++;
            }
            if(currLen > maxLen){
                maxLen = currLen;
            }
        }

        return maxLen;
    }
}
