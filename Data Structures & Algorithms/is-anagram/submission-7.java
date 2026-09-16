class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        
        if(l1 != l2) return false;

        int[] arr = new int[26];

        for(int i = 0; i < l1; i++){
            char chs = s.charAt(i);
            arr[chs - 'a'] ++;
            char cht = t.charAt(i);
            arr[cht - 'a'] --;
        }

        for(int num : arr){
            if(num != 0)
                return false;
        }
        return true;
    }
}
