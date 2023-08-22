class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();
    int[] costArr;
    public int minCostClimbingStairs(int[] cost) {
        costArr=cost;
        return dp(cost.length);
    }
    
    private int dp(int i){
        
        // Base
        if(i<=1){
            return 0;
        }
        
        if(memo.containsKey(i)){
            return memo.get(i);
        }
        
        memo.put(i, Math.min(dp(i-2) + costArr[i-2],dp(i-1) + costArr[i-1]));
        return memo.get(i);
    }
}