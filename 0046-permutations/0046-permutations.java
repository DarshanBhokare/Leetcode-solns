class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<>());
        return result;
        
        
    }
    
    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> current){
        
        // base case
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        
        // iterate
        for(int i: nums){
            if(!current.contains(i)){
                current.add(i);
                backtrack(result, nums, current);
                current.remove(current.size() - 1);
            }
        }
    }
}