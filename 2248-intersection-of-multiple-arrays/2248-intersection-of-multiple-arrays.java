class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result=new ArrayList<>();
        
        for(int[] num:nums){
            for(int n:num){
                map.put(n, map.getOrDefault(n,0)+1);
            }
        }
        for(int n: map.keySet()){
            if(!(map.get(n)<nums.length)){
                result.add(n);
            }
        }
        Collections.sort(result);
        return result;
        
    }
}