class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int half = total/2;
        int[] temp;
        if(nums2.length < nums1.length){
            temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int l = -1;
        int r = nums1.length - 1;

        while(true){
            int i = (l+r)/2;
            int j = half - i - 2;

            int left1 = 0;
            int right1 = 0;
            int left2 = 0;
            int right2 = 0;

            if(i >= 0)
                left1 = nums1[i];
            else
                left1 = Integer.MIN_VALUE;

            if(i+1 < nums1.length)
                right1 = nums1[i+1];
            else
                right1 = Integer.MAX_VALUE;
            
            if(j >= 0)
                left2 = nums2[j];
            else
                left2 = Integer.MIN_VALUE;

            if(j+1 < nums2.length)
                right2 = nums2[j+1];
            else
                right2 = Integer.MAX_VALUE;
            
            if(left1 <= right2 && left2 <= right1){
                if(total % 2 == 1)
                    return Math.min(right1, right2);
                else{
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }

            }
            else if(left1 > right2)
                r = i-1;
            else
                l = i+1;

        }
    }
}
