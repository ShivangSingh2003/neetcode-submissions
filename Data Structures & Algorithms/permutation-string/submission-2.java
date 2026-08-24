class Solution {
    public boolean checkInclusion(String s1, String s2) {

        String sortedS1 = sortString(s1);
        int l = s1.length();

        int left = 0;
        int right = l;

        while(right <= s2.length()){
            String subStr = s2.substring(left, right);
            subStr = sortString(subStr);
            if(subStr.equals(sortedS1))
                return true;
            left++;
            right++;
        }

        return false;
    }

    public static String sortString(String s){
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String sortedS = String.valueOf(str);

        return sortedS;
    }
}
