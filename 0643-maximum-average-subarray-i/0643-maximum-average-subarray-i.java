class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        
        double average=sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            average=Math.max(average, sum/k);
        }
        return average;
        
        
    }
}