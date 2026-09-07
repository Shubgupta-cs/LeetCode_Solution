class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans =0;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:mp.keySet()){
            if((k>0 && mp.containsKey(i+k)) || (k==0 && mp.get(i)>1)){
                ans++;
            }
        }
        return ans;
    }
}