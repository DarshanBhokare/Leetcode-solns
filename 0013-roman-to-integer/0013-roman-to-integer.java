class Solution {
    public int romanToInt(String s) {
        int total=0;
        HashMap<String, Integer> map=new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        int charCount=0;
        for(int i=0;i<s.length()-1;i++){
            String temp=Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
            if(map.containsKey(temp)){
                total+=map.get(temp);
                i++;
                charCount+=2;
            }
            else{
                temp=Character.toString(s.charAt(i));
                total+=map.get(temp);
                charCount++;
            }            
        }
        if(charCount!=s.length()){
        total+=map.get(Character.toString(s.charAt(s.length()-1)));
    }





        return total;
    }
}