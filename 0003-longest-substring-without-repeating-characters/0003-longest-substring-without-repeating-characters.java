class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=1;
        char[] cArr=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(cArr[i],1);
            int tempLength=1;
            for(int j=i+1;j<s.length();j++){
                if(map.containsKey(cArr[j])){
                    break;
                }
                else{
                    tempLength++;
                    map.put(cArr[j],1);
                }
            }
            if(tempLength>length){
                length=tempLength;
            }
            
        }
        if(cArr.length==0)
            return 0;
        return length;
    }
}