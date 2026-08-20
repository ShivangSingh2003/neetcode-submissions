class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        if(l1 != l2)
            return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i = 0; i < l1; i++){
            if(str1[i] != str2[i])
                return false;
        }

        return true;
    }
}
