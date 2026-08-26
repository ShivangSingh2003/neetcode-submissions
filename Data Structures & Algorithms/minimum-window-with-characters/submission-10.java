class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if(len1<len2)
            return "";
        
        int[] sArr = new int[123];
        int[] tArr = new int[123];
        int required = 0;

        for(int i = 0; i < len2; i++){
            char ch = t.charAt(i);
            tArr[(int)ch] += 1;
            if (tArr[(int)ch] == 1) required++;
        }
        int left = 0;
        int right = 0;
        int minWindow = 100000;
        boolean isValid = true;
        String ans = "";
        int formed = 0;

        while(right < len1){
            char ch = s.charAt(right);
            sArr[(int)ch] ++;
            if(sArr[(int)ch] == tArr[(int)ch]) formed++;
            while(formed == required){
                if(right-left+1 < minWindow){
                    ans = s.substring(left, right+1);
                    minWindow = right-left+1;
                }
                char c = s.charAt(left);
                if(sArr[(int)c] == tArr[(int)c]) formed--;
                sArr[(int)c] --;
                left++;
            }
            right++;
        }
        return ans;
    }
}
