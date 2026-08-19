class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";

        for(String str : strs){
            encodedString += str.length() + "#" + str;
        }

        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            String len = "";
            String curr = "";

            while(str.charAt(i) != '#'){
                len += str.charAt(i++);
            }
            i++;
            int l = Integer.valueOf(len);
            curr = str.substring(i, i+l);
            lst.add(curr);
            i += l-1;
        }

        return lst;
    }
}
