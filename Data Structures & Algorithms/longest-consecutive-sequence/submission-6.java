class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int maxLength = 0;
        int length = 0;

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            set.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(i>0 && num == nums[i-1])
                continue;

            if(set.contains(num-1)){
                length++;
                continue;
            }
            else{
                maxLength = Math.max(maxLength, length);
                length = 1;
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }
}
