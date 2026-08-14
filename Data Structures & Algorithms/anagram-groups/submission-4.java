class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String, List<String>> mapper = new HashMap<>();

        for(int i = 0; i < len; i++){
            String str = strs[i];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = String.valueOf(arr);
            List<String> lst =  mapper.getOrDefault(sortedStr, new ArrayList<>());
            lst.add(str);
            mapper.put(sortedStr, lst);
            
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : mapper.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}