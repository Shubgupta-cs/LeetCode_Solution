class Solution {
    public int timeRequiredToBuy(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        for(int i = 0;i<n;i++){
            if(i<=k){
                total += Math.min(nums[i],nums[k]);
            }
            else{
                total += Math.min(nums[i],nums[k]-1);
            }
        }
        return total;
    }
}