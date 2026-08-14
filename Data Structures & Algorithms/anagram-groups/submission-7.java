class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String, List<String>> mapper = new HashMap<>();

        for(int i = 0; i < len; i++){
            String str = strs[i];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = String.valueOf(arr);
            mapper.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
            
        }
        
        return new ArrayList<>(mapper.values());
    }
}