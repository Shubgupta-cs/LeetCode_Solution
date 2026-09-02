class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0,ans =0,max=0;
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                max += nums[i];

            }
            else{
                while(set.contains(nums[i])){
                    set.remove(nums[left]);
                    max -= nums[left];
                    left++;
                }
                set.add(nums[i]);
                max += nums[i];
            }
            ans = Math.max(ans,max);
        }
        return ans;
    }
}