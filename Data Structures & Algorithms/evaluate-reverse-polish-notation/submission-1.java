class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                if(token.equals("+")){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(""+(a+b));
                }
                if(token.equals("-")){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(""+(b-a));
                }
                if(token.equals("*")){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(""+(a*b));
                }
                if(token.equals("/")){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(""+(b/a));
                }
            }
            else
                stack.push(token);
        }

        return Integer.valueOf(stack.pop());
    }
}
