class Solution {
    public boolean isPalindrome(String s) {

        int b = 0;
        int e = s.length()-1;
        s = s.toLowerCase();
        while(b < e){
            while(b<e && !Character.isLetterOrDigit(s.charAt(b)))
                b++;
            while(e>b && !Character.isLetterOrDigit(s.charAt(e)))
                e--;
            
            if(s.charAt(b) == s.charAt(e)){
                b++;
                e--;
            }
            else
                return false;
        }

        return true;
    }
}
