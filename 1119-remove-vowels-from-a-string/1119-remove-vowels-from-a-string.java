class Solution {
    public String removeVowels(String s) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character, Integer> map= new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}