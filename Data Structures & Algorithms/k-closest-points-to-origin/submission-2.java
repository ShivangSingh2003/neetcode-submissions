class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int len = points.length;
        int[][] arr = new int[len][3];
        for(int i = 0; i < len; i++){
            int[] point = points[i];
            int x = point[0];
            int y = point[1];
            int d = x*x + y*y;
            arr[i] = new int[] {d, x, y};
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));

        for(int i = 0; i < len; i++){
            minHeap.add(arr[i]);
        }

        int[][] ans = new int[k][2];
        int c = 0;
        while(c < k){
            int[] point = minHeap.remove();
            ans[c++] = new int[] {point[1], point[2]};
        }
        return ans;
    }
}
