class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return convertedToStack(s).equals(convertedToStack(t));
        
    }
    
    private Stack<Character> convertedToStack(String s){
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(c=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack;
        
    }
}