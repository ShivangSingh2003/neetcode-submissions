class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;
        Stack<Character> braces = new Stack<>();
        char[] st = s.toCharArray();
        for(char ch : st){
            if(ch == '[' || ch == '{' || ch == '(')
                braces.push(ch);
            else{
                switch (ch) {
                    case ']' : if(!braces.empty() && braces.peek() == '[') braces.pop();
                    else return false;
                    break;
                    case '}' : if(!braces.empty() && braces.peek() == '{') braces.pop();
                    else return false;
                    break;
                    case ')' : if(!braces.empty() && braces.peek() == '(') braces.pop();
                    else return false;
                    break;
                    default : return false;
                }
            }
        }
        
        return braces.empty();
    }
}
