class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        
        for(String part: parts){
            
            if(part.equals(".") || part.isEmpty()){
                continue;
            }
            else if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(part);
            }
        }
        
        StringBuilder res = new StringBuilder();
        for(String str: stack){
            res.append("/");
            res.append(str);
        }
        
        
        if(res.length()>0){
            return res.toString();
        }
        return "/";
        
        
    }
}