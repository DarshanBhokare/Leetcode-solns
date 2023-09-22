class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int result=0;
        int left=0,right=0;
        
        for(right=0;right<s.length();right++){
            char rightChar=s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar,0)+1);
            
            while (map.get(rightChar)>1){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }

            
            result = Math.max(result, right-left+1);
            
        }
       return result;
    }
}