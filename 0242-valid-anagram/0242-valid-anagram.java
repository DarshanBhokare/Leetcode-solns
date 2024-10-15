class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        Map<Character, Integer> mapOfCharacterToCount = new HashMap<>();
        
        for(char c: s.toCharArray()){
            mapOfCharacterToCount.put(c, mapOfCharacterToCount.getOrDefault(c,0) + 1);
        }
        
        for(char c: t.toCharArray()){
            
            if(!mapOfCharacterToCount.containsKey(c)){
                return false;
            }
            
            mapOfCharacterToCount.put(c, mapOfCharacterToCount.get(c) - 1);
            
        }
        
        Set<Integer> setOfCharacterCount =  new HashSet<>(mapOfCharacterToCount.values());
        return setOfCharacterCount.size() == 1 && setOfCharacterCount.contains(0);
    }
}