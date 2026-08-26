class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if(l1 != l2) return false;

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        String a = String.valueOf(arrS);
        String b = String.valueOf(arrT);

        for(int i = 0; i < l1; i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }

        return true;
    }
}
