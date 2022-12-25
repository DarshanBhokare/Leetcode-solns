class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char arr[] = s.toCharArray();
        for(char c: arr){
            if(c=='(' || c=='[' || c=='{')
                stack.push(c);
            else if(!stack.isEmpty()){
                if(c==')')
                    if(stack.peek()=='(')
                        stack.pop();
                    else
                        return false;
                else if(c=='}')
                    if(stack.peek()=='{')
                        stack.pop();
                    else
                        return false;
                else if(c==']')
                    if(stack.peek()=='[')
                        stack.pop();
                    else
                        return false;
            }
            else{
                if(c==')' || c=='}' || c==']')
                    return false;
            }

        }

        return stack.isEmpty();

        

    }
}