class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int b = 0;
        int e = s.length()-1;

        while(b <= e){
            if(s.charAt(b) == s.charAt(e)){
                b++;
                e--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
