class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int len = points.length;
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b[0]*b[0] + b[1]*b[1], a[0]*a[0] + a[1]*a[1]));

        for(int i = 0; i < len; i++){
            maxHeap.add(points[i]);
            if(maxHeap.size() > k)
                maxHeap.remove();
            
        }

        int[][] ans = new int[k][2];
        int c = 0;
        while(c < k){ 
            ans[c++] = maxHeap.remove();
        }
        return ans;
    }
}
