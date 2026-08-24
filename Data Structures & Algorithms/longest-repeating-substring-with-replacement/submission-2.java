class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> mapper = new HashMap<>();
        int ans = 0;
        int maxFreq = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            mapper.put(ch, mapper.getOrDefault(ch, 0)+1);
            maxFreq = Math.max(maxFreq, mapper.get(ch));
            if(right - left + 1 - maxFreq > k){
                mapper.put(s.charAt(left), mapper.getOrDefault(s.charAt(left), 0)-1);
                left++;
            }
            right++;
        }

        return right-left;
    }
}
