class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch) || Character.isAlphabetic(ch)){
                str += ch;
            }
        }
        str = str.toLowerCase();
        int b = 0;
        int e = str.length()-1;

        while(b <= e){
            if(str.charAt(b) == str.charAt(e)){
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
