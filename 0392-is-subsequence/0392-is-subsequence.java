class Solution {
    public boolean isSubsequence(String s, String t) {
        int slow=0;
        int fast=0;
        if(s.length()==0){
            return true;
        }
        while(fast<t.length() && slow<s.length()){
            if(t.charAt(fast)==s.charAt(slow)){
                fast++;
                slow++;
            }
            else{
                fast++;
            }
        }
        return (slow==s.length());
        
    }
}