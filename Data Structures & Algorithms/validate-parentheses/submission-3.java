class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;
        HashMap<Character, Character> closeToOpen = new HashMap();
        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');
        Stack<Character> braces = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(braces.empty() && closeToOpen.containsKey(ch))
                return false;
            if(!braces.empty() && closeToOpen.containsKey(ch) && braces.peek() == closeToOpen.get(ch)){
                braces.pop();
                continue;
            }
            braces.push(ch);
        }
        return braces.empty();
    }
}
