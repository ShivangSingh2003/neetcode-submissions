class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapper = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sortedStr = Arrays.toString(s);

            mapper.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(mapper.values());
    }
}
