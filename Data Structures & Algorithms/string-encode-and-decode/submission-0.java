class Solution {

    public String encode(List<String> strs) {
        String output = "";

        for(String str : strs){
            output += str.length() + "_" + str;
        }
        return output;
    }

    public List<String> decode(String str) {

        List<String> output = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            String l = "";
            while(str.charAt(i) != '_'){
                l += str.charAt(i++);
            }
            i++;
            int len = l == "" ? 0 : Integer.valueOf(l);
            String out = str.substring(i, i+len);
            output.add(out);
            i += len-1;
        }

        return output;
    }
}
