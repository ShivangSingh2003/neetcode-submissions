class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int c = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < nums.length; i++){
            int left = i-k+1;
            while(!deque.isEmpty() && deque.peek() < left)
                deque.pollFirst();

            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()])
                deque.pollLast();

            deque.offerLast(i);

            if(i>=k-1)
                ans[c++] = nums[deque.peek()];
        }

        return ans;
    }


}
