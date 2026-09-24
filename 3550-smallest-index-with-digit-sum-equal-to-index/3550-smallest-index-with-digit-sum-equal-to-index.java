class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0;i<nums.length;i++){
           if(getsum(nums[i])==i) return i;
        }
        return -1;
    }
    public int getsum(int n){
        n = Math.abs(n);
        int sum =0;
        while(n>0){
            int temp = n%10;
            sum += temp;
            n/=10;
        }
        return sum;
    }
}