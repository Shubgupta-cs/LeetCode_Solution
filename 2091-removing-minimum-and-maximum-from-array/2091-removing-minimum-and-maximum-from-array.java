class Solution {
    public int minimumDeletions(int[] nums) {
        int l = 0,r =0;
        int len = nums.length;
        if(len == 1)return 1;
        for(int i =1;i<len;i++){
            if(nums[i]>nums[l]){
                l = i;
            }
            if(nums[i]<nums[r]) r =i;
        }
        int min = Math.min(l,r);
        int max = Math.max(l,r);
        int f = max+1;
        int back = len-min;
        int mix = (min+1) + (len-max);
        return Math.min(f,Math.min(back,mix));
    }
}