class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";

        for(String str : strs){
            encodedStr += str.length() + "#" + str;
        }

        return encodedStr;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;
        String l = "";

        while(i < str.length()){
            char ch = str.charAt(i);
            if(ch != '#'){
                l+=ch;
                i++;
            }
            else{
                int len = Integer.valueOf(l);
                l="";
                i++;
                String s = str.substring(i, i+len);
                ans.add(s);
                i+=len;
            }
        }

        return ans;
    }
}
