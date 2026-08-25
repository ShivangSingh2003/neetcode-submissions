class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if(len1<len2)
            return "";
        
        int[] sArr = new int[123];
        int[] tArr = new int[123];

        for(int i = 0; i < len2; i++){
            char ch = t.charAt(i);
            tArr[(int)ch] += 1;
        }
        int left = 0;
        int right = 0;
        int minWindow = 100000;
        boolean isValid = true;
        String ans = "";
        while(right <= len1){
            isValid = true;
            for(int i = 0; i <= 122; i++){
                if(sArr[i] >= tArr[i])
                    continue;
                else{
                    isValid = false;
                }
            }

            if(!isValid){
                if(right == len1)
                    break;
                char ch = s.charAt(right);
                sArr[(int)ch] += 1;
                right++;
                continue;
            }
            else{
                int length = right - left + 1;
                if(length < minWindow)
                    ans = s.substring(left, right);
                minWindow = Math.min(minWindow, length);
                sArr[(int)s.charAt(left)] -= 1;
                left++;
            }
        }
        return ans;
    }
}
