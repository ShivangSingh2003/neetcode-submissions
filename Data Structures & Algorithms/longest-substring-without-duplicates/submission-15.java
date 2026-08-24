class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right = 0; right < l; right++){

            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}
