class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1){
            int largest = maxHeap.remove();
            int secondLargest = maxHeap.remove();
            int diff = largest - secondLargest;
            if(diff != 0)
                maxHeap.add(diff);
        }
        if(maxHeap.isEmpty())
            return 0;
        return maxHeap.peek();
    }
}
