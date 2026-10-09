class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a,b) -> (int)(Math.pow(a[0],2) + Math.pow(a[1],2)) -                    (int)(Math.pow(b[0],2) + Math.pow(b[1],2)));
        int[][] ans = new int[k][2];
        int c = 0;
        while(c < k){
            ans[c] = points[c++];
        }
        return ans;
    }
}
