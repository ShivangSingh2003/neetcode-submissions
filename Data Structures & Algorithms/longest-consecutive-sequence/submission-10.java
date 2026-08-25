class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int maxLength = 0;

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            set.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            int length = 1, currNum = nums[i];
            if(set.contains(currNum-1)) continue;

            while(set.contains(currNum+1)){
                currNum++;
                length++;
            }

            maxLength = Math.max(maxLength, length);

        }
            
        return maxLength;
    }
}
