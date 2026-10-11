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
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b[0],a[0]));

        for(int i = 0; i < len; i++){
            if(maxHeap.size() < k)
                maxHeap.add(arr[i]);
            else{
                int[] p1 =  maxHeap.peek();
                int[] p2 = arr[i];
                if(p2[0] < p1[0]){
                    maxHeap.remove();
                    maxHeap.add(p2);
                }
            }
        }

        int[][] ans = new int[k][2];
        int c = 0;
        while(c < k){
            int[] point = maxHeap.remove();
            ans[c++] = new int[] {point[1], point[2]};
        }
        return ans;
    }
}
