class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
            
        int l = s1.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i < l; i++){
            char ch = s1.charAt(i);
            freq1[ch-'a'] += 1;
        }

        int left = 0;
        int right = l-1;
        for(int i = 0; i < l; i++){
            char ch = s2.charAt(i);
            freq2[ch-'a'] += 1;
        }

        while(right < s2.length()){
            if(Arrays.equals(freq1,freq2))
                return true;
            char a = s2.charAt(left);
            freq2[a-'a'] -= 1;

            left++;
            if(right == s2.length()-1)
             break;
            right++;

            char b = s2.charAt(right);
            freq2[b-'a'] += 1;
        }

        return false;
    }

}
